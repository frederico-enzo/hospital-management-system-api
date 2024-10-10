package com.hospital.management_system.dto;

import com.hospital.management_system.model.Consulta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDto {
    private Long id;
    private String nome;
    private String sobrenome;
    private String especialidade;
    private String crm;
    private String telefone;
    private List<Consulta> consultas;
}
