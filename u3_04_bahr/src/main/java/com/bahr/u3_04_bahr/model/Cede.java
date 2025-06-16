package com.bahr.u3_04_bahr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cede {
    private Long id;
    private String clave;
    private String estado;
    private String municipio;

    public Object getId() {
        return null;
    }
}
