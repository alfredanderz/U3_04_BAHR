package com.bahr.u3_04_bahr.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CedeDTO {
    @NotBlank
    private String estado;

    @NotBlank
    private String municipio;

    public String getEstado() {
        return "";
    }

    public String getMunicipio() {
        return "";
    }
}
