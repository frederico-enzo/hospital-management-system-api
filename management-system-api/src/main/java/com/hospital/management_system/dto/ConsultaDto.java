package com.hospital.management_system.dto;

import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;

public class ConsultaDto {
    private Long id;
    private Paciente paciente;
    private Medico medico;
    private String dataConsulta;
    private String horaConsulta;
    private String status;
}
