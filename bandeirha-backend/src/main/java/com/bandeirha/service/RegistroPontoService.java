package com.bandeirha.service;

import com.bandeirha.model.RegistroPonto;
import com.bandeirha.repository.RegistroPontoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroPontoService {
    private final RegistroPontoRepository repository;

    public RegistroPontoService(RegistroPontoRepository repository) {
        this.repository = repository;
    }

    public List<RegistroPonto> listarPorFuncionario(Long idFuncionario) {
        return repository.findByFuncionarioId(idFuncionario);
    }

    public RegistroPonto marcar(RegistroPonto registro) {
        return repository.save(registro);
    }
}
