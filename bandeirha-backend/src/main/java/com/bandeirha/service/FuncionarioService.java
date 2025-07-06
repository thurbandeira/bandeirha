package com.bandeirha.service;

import com.bandeirha.model.Funcionario;
import com.bandeirha.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> listar() {
        return repository.findAll();
    }

    public Funcionario salvar(Funcionario funcionario) {
        return repository.save(funcionario);
    }
}
