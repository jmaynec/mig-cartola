package com.principal.migracion.controller;

import com.principal.migracion.service.clientws.DocumentoAlfrescoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cartolas")
public class CartolaController {

    @Autowired
    private DocumentoAlfrescoClient documentoClient;

    @GetMapping(path ="/get")
    public void getDocumentoTest(){
        documentoClient.getCartolas();
    }
}
