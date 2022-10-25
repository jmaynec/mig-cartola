package com.principal.migracion.service.clientws;

import com.principal.migracion.wsdl.GetObject;
import com.principal.migracion.wsdl.GetObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class DocumentoAlfrescoClient {

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public GetObjectResponse getCartolas() {

        GetObject request = new GetObject();
        request.setRepositoryId("a867540b-808f-42c7-992f-edd12a6c7a81");
        request.setObjectId("workspace://SpacesStore/e57195d3-aeda-432d-bfc4-0a556b2d8ab9;1.0");

        GetObjectResponse response = (GetObjectResponse) webServiceTemplate
                .marshalSendAndReceive("http://localhost:8887/alfresco/cmis/ObjectService",request);
        System.out.println(response.toString());
        return response;
    }

}
