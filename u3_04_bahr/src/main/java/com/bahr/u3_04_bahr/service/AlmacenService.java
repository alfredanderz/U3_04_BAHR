package com.bahr.u3_04_bahr.service;

import com.bahr.u304bahr.model.Almacen;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class AlmacenService {
    private final List<Almacen> almacenes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Almacen> findAll() {
        return almacenes;
    }

    public Almacen findById(Long id) {
        return almacenes.stream().filter(a -> a.getId().equals(id)).findFirst().orElse(null);
    }

    public Almacen save(double precioVenta, double precioRenta, String tamano) {
        String clave = generateClave();
        Almacen almacen = new Almacen(nextId++, clave, LocalDate.now(), precioVenta, precioRenta, tamano);
        almacenes.add(almacen);
        return almacen;
    }

    public void delete(Long id) {
        almacenes.removeIf(a -> a.getId().equals(id));
    }

    private String generateClave() {
        String date = LocalDate.now().toString().replaceAll("-", "");
        int random = new Random().nextInt(9000) + 1000;
        return "A" + nextId + "-" + date + "-" + random;
    }
}
