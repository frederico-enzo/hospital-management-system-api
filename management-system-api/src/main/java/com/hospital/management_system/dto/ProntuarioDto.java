package com.hospital.management_system.dto;

import com.hospital.management_system.model.Paciente;

import java.util.List;

public class ProntuarioDto {
    private Long id;
    private Paciente paciente; // Relação com Paciente
    private List<String> historicoMedico; // Anotações médicas
    private List<String> tratamentos;
}
