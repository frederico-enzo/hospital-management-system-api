package com.hospital.management_system.dto;

import com.hospital.management_system.model.Paciente;

import java.util.List;

public class ProntuarioDto {
    private Long id;
    private Paciente paciente;
    private List<String> historicoMedico;
    private List<String> tratamentos;
}
