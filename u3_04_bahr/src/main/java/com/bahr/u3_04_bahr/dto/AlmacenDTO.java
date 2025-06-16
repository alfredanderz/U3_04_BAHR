package com.bahr.u3_04_bahr.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AlmacenDTO {
    @Positive
    private double precioVenta;

    @Positive
    private double precioRenta;

    @NotBlank
    private String tamano; // G, M, P

    public double getPrecioVenta() {
        return 0;
    }

    public double getPrecioRenta() {
        return 0;
    }

    public String getTamano() {
        return "";
    }
}
