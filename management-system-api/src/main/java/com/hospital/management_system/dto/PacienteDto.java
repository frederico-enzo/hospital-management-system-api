package com.hospital.management_system.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital.management_system.model.Prontuario;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
public class PacienteDto {
    private Long id;

    @NotNull(message = "O campo nome deve ser preenxido")
    private String nome;

    @NotNull(message = "O campo sobrenome deve ser preenxido")
    private String sobrenome;

    @NotNull(message = "O campo dataNascimento deve ser preenxido")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataNascimento;

    @NotNull(message = "O campo telefone deve ser preenxido")
    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "Número de telefone deve estar no formato (XX) XXXXX-XXXX")
    private String telefone;

    @NotNull(message = "O campo endereco deve ser preenxido")
    private String endereco;

    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "CPF deve estar no formato XXX.XXX.XXX-XX")
    @NotNull(message = "O campo cpf deve ser preenxido")
    private String cpf;

    @NotNull(message = "O campo genero deve ser preenxido")
    private String genero;

    private List<Prontuario> prontuarios;
}
