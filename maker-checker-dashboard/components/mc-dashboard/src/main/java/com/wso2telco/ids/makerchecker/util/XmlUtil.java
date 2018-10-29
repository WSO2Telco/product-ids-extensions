package com.wso2telco.ids.makerchecker.util;

import com.wso2telco.ids.makerchecker.dto.HumanTaskInfoDto;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

public class XmlUtil {
    private static final String XSD_COMPLEX_TYPE_WRAPPER = "xsd-complex-type-wrapper";
    private static final String REQUEST_ID = "REQUEST ID";
    private static final String USERNAME = "Username";
    private static final String USER_STORE_DOMAIN = "User Store Domain";
    private static final String ROLES = "Roles";
    private static final String CLAIMS = "Claims";

    public static HumanTaskInfoDto decodeHumanTaskInfo(Reader xmlReader) throws XMLStreamException {
        if (xmlReader == null) {
            return null;
        }

        String cdata = extractCdataSection(xmlReader);
        if (cdata == null || cdata.isEmpty()) {
            return null;
        }

        HumanTaskInfoDto infoDto = new HumanTaskInfoDto();

        XMLInputFactory factory = XMLInputFactory.newInstance();
        try (StringReader reader = new StringReader(cdata)) {
            XMLEventReader eventReader = factory.createXMLEventReader(reader);

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.getEventType() == XMLStreamConstants.START_ELEMENT) {
                    StartElement startElement = event.asStartElement();
                    String elementName = startElement.getName().getLocalPart();

                    if (elementName.equals(XSD_COMPLEX_TYPE_WRAPPER)) {
                        Iterator<Attribute> iterator = startElement.getAttributes();
                        while (iterator.hasNext()) {
                            Attribute attribute = iterator.next();
                            String itemName = attribute.getValue();

                            //skip until, next <itemValue> event which is a start element
                            while (eventReader.hasNext()) {
                                XMLEvent nextEvent = eventReader.nextEvent();
                                if (nextEvent.getEventType() == XMLStreamConstants.START_ELEMENT) {
                                    String itemValue = eventReader.getElementText();

                                    if (itemValue != null && (itemValue.lastIndexOf(',') == (itemValue.length() -1))) {
                                        if (itemValue.length() >= 2) {
                                            itemValue = itemValue.substring(0, itemValue.length() - 1);
                                        }
                                    }

                                    switch (itemName) {
                                        case REQUEST_ID:
                                            infoDto.setRequestId(itemValue);
                                            break;

                                        case USERNAME:
                                            infoDto.setUsername(itemValue);
                                            break;

                                        case USER_STORE_DOMAIN:
                                            infoDto.setUserStoreDomain(itemValue);
                                            break;

                                        case ROLES:
                                            infoDto.setRoles(itemValue);
                                            break;

                                        case CLAIMS:
                                            infoDto.setClaims(itemValue);
                                            break;
                                    }
                                    break;
                                }
                            }
                        }

                    }
                }
            }
        }
        return infoDto;
    }

    private static String extractCdataSection(Reader xmlReader) throws XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = factory.createXMLEventReader(xmlReader);

        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            if (event.getEventType() == XMLStreamConstants.CDATA) {
                String cdata =  event.asCharacters().getData();
                eventReader.close();
                return cdata;
            }
        }
        eventReader.close();
        return null;
    }
}
