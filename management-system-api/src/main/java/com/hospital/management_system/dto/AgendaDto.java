package com.hospital.management_system.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

 @Data
@NoArgsConstructor @AllArgsConstructor
public class AgendaDto {
        private Long id;

        @NotNull(message = "O horário disponível não pode ser nulo")
        private LocalDateTime horarioDisponivel;
        @NotNull(message = "O campo 'disponível' deve ser especificado")
        private boolean disponivel;
        @NotNull(message = "O médico não pode ser nulo")
        private MedicoDto medico;
        @NotEmpty(message = "A lista de consultas não pode estar vazia")
        private List<ConsultaDto> consultas;
}
