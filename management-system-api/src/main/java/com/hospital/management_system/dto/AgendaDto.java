package com.hospital.management_system.dto;

import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Medico;

import java.util.List;

public class AgendaDto {
        private Long id;
        private Medico medico; // Relação com Médico
        private List<Consulta> consultas; // Consultas agendadas
        private String data;
}
