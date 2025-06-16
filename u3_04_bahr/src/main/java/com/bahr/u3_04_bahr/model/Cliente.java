package com.bahr.u3_04_bahr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private Long id;
    private String nombreCompleto;
    private String telefono;
    private String correo;

    public Object getId() {
        return null;
    }
}
