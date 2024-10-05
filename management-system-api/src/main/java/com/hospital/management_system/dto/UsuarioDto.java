package com.hospital.management_system.dto;

public class UsuarioDto {
    private Long id;
    private String username;
    private String senha;
    private String papel; // Ex: admin, medico, enfermeiro
    private boolean ativo;
}
