package com.hospital.management_system.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Prontuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class PacienteDto {
    private Long id;

    private String nome;

    private String sobrenome;

    private String cpf;

    private LocalDate dataNascimento;

    private String genero;

    private String estadoCivil;

    private String telefone;

    private String email;

    private String endereco;

    private String contatoEmergencia;

    private String historicoDoenca;

    private String alergias;

    private String planoSaude;

    private String numeroCarteirinha;

    private LocalDateTime dataCadastro;

    private boolean ativo;

    private List<Consulta> consultas;

    private List<Prontuario> prontuarios;
}
