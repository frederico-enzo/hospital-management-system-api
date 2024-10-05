package com.hospital.management_system.dto;

import com.hospital.management_system.model.Prontuario;

import java.util.List;

public class PacienteDto {
    private Long id;
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private String cpf;
    private String genero;
    private List<Prontuario> prontuarios;
}
