package com.hospital.management_system.dto;

import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;

public class ConsultaDto {
    private Long id;
    private Paciente paciente; // Relação com Paciente
    private Medico medico; // Relação com Médico
    private String dataConsulta;
    private String horaConsulta;
    private String status;
}
