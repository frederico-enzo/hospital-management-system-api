package com.hospital.management_system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Data @Entity @Table(name = "tb.agenda", schema = "public")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "horario_hisponivel")
    private LocalDateTime horarioDisponivel;
    @Column(name = "disponivel", unique = true)
    private boolean disponivel;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;
    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Consulta> consultas;
}
