package com.hospital.management_system.dto;

import com.hospital.management_system.model.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProntuarioDto {
    private Long id;
    private Paciente paciente;
    private List<String> historicoMedico;
    private List<String> tratamentos;
}
