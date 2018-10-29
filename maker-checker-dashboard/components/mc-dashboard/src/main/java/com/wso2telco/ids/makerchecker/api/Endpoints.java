package com.wso2telco.ids.makerchecker.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.wso2telco.ids.makerchecker.Constants;
import com.wso2telco.ids.makerchecker.dto.DefaultResponseDto;
import com.wso2telco.ids.makerchecker.dto.HumanTaskDto;
import com.wso2telco.ids.makerchecker.dto.HumanTaskInfoDto;
import com.wso2telco.ids.makerchecker.dto.HumanTaskListResponseDto;
import com.wso2telco.ids.makerchecker.exception.AuthenticationException;
import com.wso2telco.ids.makerchecker.exception.HumanTaskException;
import com.wso2telco.ids.makerchecker.util.AuthenticationUtil;
import com.wso2telco.ids.makerchecker.util.CommonUtil;
import com.wso2telco.ids.makerchecker.util.HumanTaskUtil;
import org.apache.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("v1/")
public class Endpoints {

    private static final Logger log = Logger.getLogger(Endpoints.class);

    @Context
    private ServletConfig servletConfig;
    @Context
    private ServletContext servletContext;
    @Context
    private HttpServletRequest httpServletRequest;
    @Context
    private HttpServletResponse httpServletResponse;

    @POST
    @Path("auth/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(String data) {
        JsonObject loginData = new JsonParser().parse(data).getAsJsonObject();
        DefaultResponseDto responseDto = new DefaultResponseDto();

        if (loginData.has(Constants.USERNAME) && loginData.has(Constants.PASSWORD)) {
            String username = loginData.get(Constants.USERNAME).getAsString();
            String password = loginData.get(Constants.PASSWORD).getAsString();
            String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.AUTHENTICATION_ENDPOINT;

            if (username != null && password != null && (!username.isEmpty()) && (!password.isEmpty())) {
                try {
                    String sessionId = AuthenticationUtil.authenticate(username, password, serviceEndpoint);
                    if (sessionId != null && (!sessionId.isEmpty())) {
                        httpServletRequest.getSession().setAttribute(Constants.USERNAME, username);
                        httpServletRequest.getSession().setAttribute(Constants.SESSION_COOKIE, sessionId);
                        log.info("Maker Checker Dashboard: Successfully authenticated user: " + username);
                        responseDto.setError(false);
                        responseDto.setMessage("Successfully authenticated.");
                    } else {
                        responseDto.setError(true);
                        responseDto.setMessage("Authentication failed. Check credentials and try again.");
                    }
                } catch (AuthenticationException e) {
                    responseDto.setError(true);
                    responseDto.setMessage("Authentication Failed. " + e.getMessage());
                }
            } else {
                responseDto.setError(true);
                responseDto.setMessage("Authentication failed. Check credentials and try again.");
            }

        } else {
            responseDto.setError(true);
            responseDto.setMessage("Both username and password are mandatory. Please try again.");
        }
        return Response.ok().entity(new Gson().toJson(responseDto)).build();
    }

    @GET
    @Path("tasks")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTasks(@QueryParam("taskFilter")String taskFilter) {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute(Constants.USERNAME);
        String sessionCookie = (String)session.getAttribute(Constants.SESSION_COOKIE);

        if (username == null || sessionCookie == null || username.isEmpty() || sessionCookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.HUMAN_TASK_ENDPOINT;
        HumanTaskListResponseDto responseDto = new HumanTaskListResponseDto();
        try {
            List<HumanTaskDto> list = HumanTaskUtil.getAllTasks(sessionCookie, taskFilter, serviceEndpoint);
            responseDto.setError(false);
            responseDto.setMessage("success");
            responseDto.setList(list);
        } catch (HumanTaskException e) {
            responseDto.setError(true);
            responseDto.setMessage("Error occurred: " + e.getMessage());
        }

        return Response.ok().entity(new Gson().toJson(responseDto)).build();
    }

    @GET
    @Path("tasks/{taskId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTaskInfo(@PathParam("taskId") String taskId) {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute(Constants.USERNAME);
        String sessionCookie = (String)session.getAttribute(Constants.SESSION_COOKIE);

        if (username == null || sessionCookie == null || username.isEmpty() || sessionCookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
        String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.HUMAN_TASK_ENDPOINT;

        try {
            HumanTaskInfoDto infoDto = HumanTaskUtil.getTaskInput(taskId, sessionCookie, serviceEndpoint);
            return Response.ok().entity(new Gson().toJson(infoDto)).build();
        } catch (HumanTaskException e) {
            log.error("Error fetching human task info [taskId: " + taskId + "]", e);
        }
        return null;
    }

    @POST
    @Path("tasks/{taskId}/approve")
    @Produces(MediaType.APPLICATION_JSON)
    public Response approveTask(@PathParam("taskId") String taskId) {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute(Constants.USERNAME);
        String sessionCookie = (String)session.getAttribute(Constants.SESSION_COOKIE);

        if (username == null || sessionCookie == null || username.isEmpty() || sessionCookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.HUMAN_TASK_ENDPOINT;

        return completeTask(taskId, Constants.APPROVED, sessionCookie, serviceEndpoint);
    }

    @POST
    @Path("tasks/{taskId}/reject")
    @Produces(MediaType.APPLICATION_JSON)
    public Response rejectTask(@PathParam("taskId") String taskId) {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute(Constants.USERNAME);
        String sessionCookie = (String)session.getAttribute(Constants.SESSION_COOKIE);

        if (username == null || sessionCookie == null || username.isEmpty() || sessionCookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.HUMAN_TASK_ENDPOINT;

        return completeTask(taskId, Constants.REJECTED, sessionCookie, serviceEndpoint);
    }

    @POST
    @Path("tasks/{taskId}/release")
    @Produces(MediaType.APPLICATION_JSON)
    public Response releaseTask(@PathParam("taskId") String taskId) {
        HttpSession session = httpServletRequest.getSession();
        String username = (String)session.getAttribute(Constants.USERNAME);
        String sessionCookie = (String)session.getAttribute(Constants.SESSION_COOKIE);

        if (username == null || sessionCookie == null || username.isEmpty() || sessionCookie.isEmpty()) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        String serviceEndpoint = CommonUtil.constructServerUrl(httpServletRequest) + Constants.HUMAN_TASK_ENDPOINT;

        return completeTask(taskId, Constants.RELEASED, sessionCookie, serviceEndpoint);
    }

    private Response completeTask(String taskId, String command, String sessionCookie, String serviceEndpoint) {
        DefaultResponseDto responseDto = new DefaultResponseDto();
        try {
            boolean taskStarted = HumanTaskUtil.startTask(taskId, sessionCookie, serviceEndpoint);
            if (taskStarted) {
                log.info("Human task started [taskId: " + taskId + "]");
            }

            boolean taskCompleted = HumanTaskUtil.completeTask(taskId, command, sessionCookie, serviceEndpoint);
            if (taskCompleted) {
                log.info("Human task completed [taskId: " + taskId + "]");
            }

            String message = "Task " + command.toLowerCase() + " successfully.";
            responseDto.setError(false);
            responseDto.setMessage(message);

        } catch (HumanTaskException e) {
            try {
                boolean taskCompleted = HumanTaskUtil.completeTask(taskId, command, sessionCookie, serviceEndpoint);
                if (taskCompleted) {
                    String message = "Task " + command.toLowerCase() + " successfully.";
                    responseDto.setError(false);
                    responseDto.setMessage(message);
                } else {
                    log.error("Error completing task [TaskId: " + taskId + "]" + e);
                    responseDto.setError(true);
                    responseDto.setMessage("Error approving task. " + e.getMessage());
                }
            } catch (HumanTaskException e1) {
                log.error("Error occurred while approving human task [taskId: " + taskId + "]", e);
                responseDto.setError(true);
                responseDto.setMessage("Error approving task. " + e1.getMessage());
            }

        }

        return Response.ok().entity(new Gson().toJson(responseDto)).build();
    }

}
