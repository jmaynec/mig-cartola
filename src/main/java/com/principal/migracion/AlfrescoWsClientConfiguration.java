package com.principal.migracion;

import com.principal.migracion.service.clientws.DocumentoAlfrescoClient;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.wss4j.dom.WSConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class AlfrescoWsClientConfiguration {

    @Value("${client.default-uri}")
    private String defaultUri;
    @Value("${client.user.username}")
    private String username;
    @Value("${client.user.password}")
    private String password;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setMtomEnabled(true);
        marshaller.setContextPath("com.principal.migracion.wsdl");
        return marshaller;
    }
    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller){
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri(defaultUri);
        //Configuracion de autenticacion basica
        //webServiceTemplate.setMessageSender(httpComponentsMessageSender);
        ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
        webServiceTemplate.setInterceptors(interceptors);

        return webServiceTemplate;
    }
    /*
    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender(UsernamePasswordCredentials credentials){
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setCredentials(credentials);
        return httpComponentsMessageSender;
    }
*/
    @Bean
    public UsernamePasswordCredentials usernamePasswordCredentials(){
        return new UsernamePasswordCredentials(username,password);
    }

    @Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        wss4jSecurityInterceptor.setSecurementUsername("admin");
        wss4jSecurityInterceptor.setSecurementPassword("admin");
        wss4jSecurityInterceptor.setSecurementTimeToLive(120);
        wss4jSecurityInterceptor.setTimestampStrict(true);
        wss4jSecurityInterceptor.setTimestampPrecisionInMilliseconds(true);
//        wss4jSecurityInterceptor.setValidationTimeToLive(60);
//        wss4jSecurityInterceptor.setFutureTimeToLive(60);
        wss4jSecurityInterceptor.setSecurementUsernameTokenNonce(true);
        wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(true);
        return wss4jSecurityInterceptor;
    }
}
