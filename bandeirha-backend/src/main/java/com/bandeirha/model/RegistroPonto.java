package com.bandeirha.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class RegistroPonto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private LocalTime entrada;
    private LocalTime almocoInicio;
    private LocalTime almocoFim;
    private LocalTime saida;

    @ManyToOne
    private Funcionario funcionario;

    // Getters e Setters omitidos por brevidade
}
