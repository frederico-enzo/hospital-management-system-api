package com.hospital.management_system.dto;

import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;
import com.hospital.management_system.model.Prontuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDto {
    private Long id;

    private LocalDateTime dataHora;

    private String motivo;

    private String observacoes;

    private Paciente paciente;

    private Medico medico;

    private Prontuario prontuario;

    private Agenda agenda;

}
