package com.bahr.u3_04_bahr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Almacen {
    private Long id;
    private String clave;
    private LocalDate fechaRegistro;
    private double precioVenta;
    private double precioRenta;
    private String tamano; // G, M, P

    public Object getId() {
        return null;
    }
}
