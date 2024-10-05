package com.hospital.management_system.dto;

import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Medico;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter @Data
@NoArgsConstructor @AllArgsConstructor
public class AgendaDto {
        @NotNull(message = "O ID não pode ser nulo")
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
