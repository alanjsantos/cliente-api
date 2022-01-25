package com.apicliente.service;

import com.apicliente.model.Cliente;
import com.apicliente.repository.ClienteReposieoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteReposieoty reposieoty;

    public Cliente save(Cliente cliente) {
        return reposieoty.save(cliente);
    }

}
