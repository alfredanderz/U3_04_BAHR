package com.bahr.u3_04_bahr.controller;

import com.bahr.u304bahr.dto.AlmacenDTO;
import com.bahr.u304bahr.model.Almacen;
import com.bahr.u304bahr.service.AlmacenService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {

    private final AlmacenService almacenService;

    public AlmacenController(AlmacenService almacenService) {
        this.almacenService = almacenService;
    }

    @GetMapping
    public List<Almacen> getAll() {
        return almacenService.findAll();
    }

    @PostMapping
    public Almacen create(@Valid @RequestBody AlmacenDTO dto) {
        return almacenService.save(dto.getPrecioVenta(), dto.getPrecioRenta(), dto.getTamano());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        almacenService.delete(id);
    }
}
