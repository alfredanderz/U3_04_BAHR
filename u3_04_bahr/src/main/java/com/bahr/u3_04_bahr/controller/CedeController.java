package com.bahr.u3_04_bahr.controller;

import com.bahr.u304bahr.dto.CedeDTO;
import com.bahr.u304bahr.model.Cede;
import com.bahr.u304bahr.service.CedeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cedes")
public class CedeController {

    private final CedeService cedeService;

    public CedeController(CedeService cedeService) {
        this.cedeService = cedeService;
    }

    @GetMapping
    public List<Cede> getAll() {
        return cedeService.findAll();
    }

    @PostMapping
    public Cede create(@Valid @RequestBody CedeDTO dto) {
        return cedeService.save(dto.getEstado(), dto.getMunicipio());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cedeService.delete(id);
    }
}
