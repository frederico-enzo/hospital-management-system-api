package com.hospital.management_system.model;

import jakarta.persistence.*;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataConsulta;
    private String horaConsulta;
    private String status;

    // Relação de uma consulta com um paciente
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    // Relação de uma consulta com um médico
    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;
}
