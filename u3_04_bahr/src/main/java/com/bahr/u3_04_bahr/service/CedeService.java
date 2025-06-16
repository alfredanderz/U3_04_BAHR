package com.bahr.u3_04_bahr.service;

import com.bahr.u304bahr.model.Cede;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CedeService {
    private final List<Cede> cedes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cede> findAll() {
        return cedes;
    }

    public Cede findById(Long id) {
        return cedes.stream().filter(c -> c.getId().equals(id)).findFirst().orElse(null);
    }

    public Cede save(String estado, String municipio) {
        String clave = generateClave();
        Cede cede = new Cede(nextId++, clave, estado, municipio);
        cedes.add(cede);
        return cede;
    }

    public void delete(Long id) {
        cedes.removeIf(c -> c.getId().equals(id));
    }

    private String generateClave() {
        String date = new SimpleDateFormat("ddMMyyyy").format(new Date());
        int random = new Random().nextInt(9000) + 1000;
        return "C" + nextId + "-" + date + "-" + random;
    }
}
