package com.bahr.u3_04_bahr.service;

import com.bahr.u304bahr.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> findAll() {
        return clientes;
    }

    public Cliente findById(Long id) {
        return clientes.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    public Cliente save(String nombreCompleto, String telefono, String correo) {
        Cliente cliente = new Cliente(nextId++, nombreCompleto, telefono, correo);
        clientes.add(cliente);
        return cliente;
    }

    public void delete(Long id) {
        clientes.removeIf(c -> c.getId().equals(id));
    }
}
