package com.hospital.management_system.dto;

import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDto {
    private Long id;
    private Paciente paciente;
    private Medico medico;
    private String dataConsulta;
    private String horaConsulta;
    private String status;
    private Agenda agenda;

}
