package com.hospital.management_system.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String especialidade;
    private String crm;
    private String telefone;

    // Um médico pode ter várias consultas
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Consulta> consultas;

    // Um médico tem uma agenda que pode ter várias consultas
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "agenda_id", referencedColumnName = "id")
    private Agenda agenda;
}

