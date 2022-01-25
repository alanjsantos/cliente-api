package com.apicliente.repository;

import com.apicliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteReposieoty extends JpaRepository<Cliente, Long> {
}
