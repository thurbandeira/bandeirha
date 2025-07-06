package com.bandeirha.controller;

import com.bandeirha.model.RegistroPonto;
import com.bandeirha.service.RegistroPontoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ponto")
public class RegistroPontoController {
    private final RegistroPontoService service;

    public RegistroPontoController(RegistroPontoService service) {
        this.service = service;
    }

    @GetMapping("/{idFuncionario}")
    public List<RegistroPonto> listarPorFuncionario(@PathVariable Long idFuncionario) {
        return service.listarPorFuncionario(idFuncionario);
    }

    @PostMapping("/marcar")
    public RegistroPonto marcar(@RequestBody RegistroPonto registro) {
        return service.marcar(registro);
    }
}
