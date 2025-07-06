package com.bandeirha.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private String cargo;
    private String setor;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private String status;

    // Getters e Setters omitidos por brevidade
}
