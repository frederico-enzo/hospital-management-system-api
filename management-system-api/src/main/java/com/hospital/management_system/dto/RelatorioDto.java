package com.hospital.management_system.dto;

import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RelatorioDto {
    private Long id;

    private LocalDateTime dataCriacao;

    private String tipo;

    private String conteudo;

    private Medico medico;

    private Paciente paciente;
}
