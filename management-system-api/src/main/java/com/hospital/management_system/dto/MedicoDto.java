package com.hospital.management_system.dto;

import com.hospital.management_system.model.Agenda;
import com.hospital.management_system.model.Consulta;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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

    private String crm;

    private String especialidade;

    private String telefone;

    private String email;

    private List<Consulta> consultas;

    private List<Agenda> agendas;
}
