package com.wso2telco.ids.makerchecker.util;

import com.wso2telco.ids.makerchecker.dto.HumanTaskDto;
import com.wso2telco.ids.makerchecker.dto.HumanTaskInfoDto;
import com.wso2telco.ids.makerchecker.exception.HumanTaskException;
import okhttp3.*;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.api._200803.*;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryCategory;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TSimpleQueryInput;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultRow;
import org.oasis_open.docs.ns.bpel4people.ws_humantask.types._200803.TTaskSimpleQueryResultSet;

import javax.net.ssl.*;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HumanTaskUtil {

    public static List<HumanTaskDto> getAllTasks(String sessionCookie, String taskType, String serviceEndpoint) throws HumanTaskException {
        List<HumanTaskDto> taskList = new LinkedList<>();
        HumanTaskClientAPIAdminStub stub = null;
        try {
            stub = initializeHumanTaskStub(sessionCookie, serviceEndpoint);

            SimpleQueryDocument document = SimpleQueryDocument.Factory.newInstance();
            SimpleQueryDocument.SimpleQuery query = SimpleQueryDocument.SimpleQuery.Factory.newInstance();
            TSimpleQueryInput input = TSimpleQueryInput.Factory.newInstance();
            input.setSimpleQueryCategory(TSimpleQueryCategory.ALL_TASKS);

            query.setSimpleQueryInput(input);
            document.setSimpleQuery(query);

            SimpleQueryResponseDocument response = stub.simpleQuery(document);
            SimpleQueryResponseDocument.SimpleQueryResponse resp = response.getSimpleQueryResponse();
            TTaskSimpleQueryResultSet resultSet = resp.getTaskSimpleQueryResultSet();
            TTaskSimpleQueryResultRow rows[] = resultSet.getRowArray();
            for (TTaskSimpleQueryResultRow row: rows) {
                HumanTaskDto dto = simpleQueryResultRowToHumanTaskDto(row);
                if (taskType == null || taskType.equals("ALL")) {
                    taskList.add(dto);
                } else {
                    if (dto.getStatus().equals(taskType)) {
                        taskList.add(dto);
                    }
                }
            }
            return taskList;

        } catch (IllegalStateFault | IllegalArgumentFault | RemoteException e) {
            throw new HumanTaskException(e);
        } finally {
            try {
                stub.cleanup();
            } catch (AxisFault axisFault) {
                //ignore
            }
        }
    }

    public static HumanTaskInfoDto getTaskInput(String taskId, String sessionCookie, String serviceEndpoint) throws HumanTaskException {
        HumanTaskClientAPIAdminStub stub = null;
        try {
            stub = initializeHumanTaskStub(sessionCookie, serviceEndpoint);

            GetInputDocument document = GetInputDocument.Factory.newInstance();
            GetInputDocument.GetInput input = GetInputDocument.GetInput.Factory.newInstance();
            input.setIdentifier(taskId);
            document.setGetInput(input);
            GetInputResponseDocument responseDocument = stub.getInput(document);
            GetInputResponseDocument.GetInputResponse response = responseDocument.getGetInputResponse();

            HumanTaskInfoDto infoDto = XmlUtil.decodeHumanTaskInfo(response.getTaskData().newReader());
            return infoDto;
        } catch (IllegalStateFault | IllegalArgumentFault | IllegalAccessFault |
                RemoteException | IllegalOperationFault | XMLStreamException e) {
            throw new HumanTaskException(e);
        } finally {
            try {
                stub.cleanup();
            } catch (AxisFault axisFault) {
                //ignore
            }
        }
    }

    public static boolean startTask(String taskId, String sessionCookie, String serviceEndpoint) throws HumanTaskException {
        HumanTaskClientAPIAdminStub stub = null;
        try {
            stub = initializeHumanTaskStub(sessionCookie, serviceEndpoint);
            StartDocument document = StartDocument.Factory.newInstance();
            StartDocument.Start start = StartDocument.Start.Factory.newInstance();
            start.setIdentifier(taskId);
            document.setStart(start);
            stub.start(document);

            return true;

        } catch (IllegalStateFault | IllegalArgumentFault | IllegalAccessFault | RemoteException | IllegalOperationFault e) {
            throw new HumanTaskException(e);
        } finally {
            try {
                stub.cleanup();
            } catch (AxisFault axisFault) {
                //ignore
            }
        }
    }

    /**
     *
     * @param taskId
     * @param sessionCookie
     * @param serviceEndpoint
     * @return
     * @throws HumanTaskException
     */
    public static boolean completeTask(String taskId, String command, String sessionCookie, String serviceEndpoint) throws HumanTaskException {
        //Using manual SOAP request due to an issue in generated code. In generated code CDATA section gets escaped but it should not.
        String taskData = "<![CDATA[<sch:ApprovalCBData xmlns:sch=\"http://ht.bpel.mgt.workflow.identity.carbon.wso2.org/wsdl/schema\">" +
                    "<approvalStatus>" + command + "</approvalStatus>" +
                    "</sch:ApprovalCBData>]]>";

        String entity = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns=\"http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803\">" +
                "   <soapenv:Header/>" +
                "   <soapenv:Body>" +
                "      <ns:complete>" +
                "         <ns:identifier>" + taskId + "</ns:identifier>" +
                "         <ns:taskData>" + taskData + "</ns:taskData>" +
                "      </ns:complete>" +
                "   </soapenv:Body>" +
                "</soapenv:Envelope>";

        OkHttpClient client = getUnsafeOkHttpClient();
        RequestBody body = RequestBody.create(MediaType.parse("text/xml"), entity.getBytes());
        Request request = new Request.Builder().addHeader("Cookie", sessionCookie)
                .addHeader("Content-type", "text/xml; charset=UTF-8")
                .addHeader("SOAPAction", "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803/complete")
                .url(serviceEndpoint)
                .post(body).build();
        try(Response response = client.newCall(request).execute()) {
            return (response.code() == 200);
        } catch (IOException e) {
           throw new HumanTaskException(e);
        }
    }

    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager)trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static HumanTaskDto simpleQueryResultRowToHumanTaskDto(TTaskSimpleQueryResultRow row) {
        HumanTaskDto dto = new HumanTaskDto();
        dto.setTaskId(row.getId());
        dto.setStatus(row.getStatus());
        dto.setPriority(row.getPriority());
        dto.setCreatedTime(row.getCreatedTime());
        dto.setSubject(row.getPresentationSubject());

        return dto;
    }

    private static HumanTaskClientAPIAdminStub initializeHumanTaskStub(String sessionCookie, String serviceEndpoint)
            throws AxisFault {

//        SSLContext sslContext = SSLContexts.custom()
//                .loadTrustMaterial(new TrustSelfSignedStrategy())
//                .build();
//        SSLContext.setDefault(sslContext);

        HumanTaskClientAPIAdminStub stub = new HumanTaskClientAPIAdminStub(serviceEndpoint);
        Options options = stub._getServiceClient().getOptions();
        options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, Boolean.TRUE.toString());
        options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE.toString());
        options.setManageSession(true);

        Map<String, String> property = new HashMap<>();
        property.put("Cookie", sessionCookie);

        options.setProperty( org.apache.axis2.transport.http.HTTPConstants.HTTP_HEADERS , property);

        return stub;
    }
}
