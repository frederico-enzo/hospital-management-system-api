package com.hospital.management_system.dto;


import com.hospital.management_system.model.Consulta;
import com.hospital.management_system.model.Medico;
import com.hospital.management_system.model.Paciente;
import lombok.*;
import java.time.LocalDateTime;


@NoArgsConstructor @AllArgsConstructor  @Data
public class AgendaDto {
         private Long id;

         private LocalDateTime dataHora;

         private String status;

         private Paciente paciente;

         private Medico medico;

         private Consulta consulta;
}
