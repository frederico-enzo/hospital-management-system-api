package com.hospital.management_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "tb.prontuario", schema = "public")
public class Prontuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prontuario")
    private Long id;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "historico_medico", nullable = false, length = 2000)
    private String historicoMedico;

    @Column(name = "diagnosticos", length = 2000)
    private String diagnosticos;

    @Column(name = "tratamentos", length = 2000)
    private String tratamentos;

    @Column(name = "medicacoes", length = 2000)
    private String medicacoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_consulta")
    private Consulta consulta;
}
