package com.bahr.u3_04_bahr.controller;

import com.bahr.u304bahr.dto.ClienteDTO;
import com.bahr.u304bahr.model.Cliente;
import com.bahr.u304bahr.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getAll() {
        return clienteService.findAll();
    }

    @PostMapping
    public Cliente create(@Valid @RequestBody ClienteDTO dto) {
        return clienteService.save(dto.getNombreCompleto(), dto.getTelefono(), dto.getCorreo());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
