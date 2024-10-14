package com.hospital.management_system.dto;

import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProntuarioDto {
    private Long id;

    private LocalDateTime dataCriacao;

    private String historicoMedico;

    private String diagnosticos;

    private String tratamentos;

    private String medicacoes;

    private Paciente paciente;

    private Medico medico;

    private Consulta consulta;
}
