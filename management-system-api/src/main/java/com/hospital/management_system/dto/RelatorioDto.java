package com.hospital.management_system.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RelatorioDto {
    private Long id;
    private String tipo;
    private String conteudo;
    private String dataGeracao;
}
