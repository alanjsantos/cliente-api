package com.apicliente.controller;

import com.apicliente.model.Cliente;
import com.apicliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> save (@RequestBody Cliente cliente) {
        cliente = service.save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }
}
