package com.hospital.management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RelatorioDto {
    private Long id;
    private String tipo; // Ex: financeiro, operacional
    private String conteudo; // Informações do relatório
    private String dataGeracao;
}
