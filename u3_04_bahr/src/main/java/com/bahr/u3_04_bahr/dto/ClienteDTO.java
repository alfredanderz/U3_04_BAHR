package com.bahr.u3_04_bahr.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ClienteDTO {
    @NotBlank
    private String nombreCompleto;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$", message = "Debe contener 10 dígitos")
    private String telefono;

    @Email
    private String correo;

    public String getNombreCompleto() {
        return "";
    }

    public String getTelefono() {
        return "";
    }

    public String getCorreo() {
        return "";
    }
}
