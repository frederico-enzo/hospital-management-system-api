package com.hospital.management_system.model;

import jakarta.persistence.*;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Paciente paciente;
    private Medico medico;
    private String dataConsulta;
    private String horaConsulta;
    private String status;
    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private Agenda agenda;
}
