package com.hospital.management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UsuarioDto {
    private Long id;
    private String username;
    private String senha;
    private String role;
    private boolean ativo;
}
