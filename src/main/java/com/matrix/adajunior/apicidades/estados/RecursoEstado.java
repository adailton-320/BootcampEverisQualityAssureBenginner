package com.matrix.adajunior.apicidades.estados;

import com.matrix.adajunior.apicidades.estados.repositorio.RepositorioEstado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class RecursoEstado {
    public RecursoEstado(RepositorioEstado repositorioEstado) {
        this.repositorioEstado = repositorioEstado;
    }

    private final RepositorioEstado repositorioEstado;

    @GetMapping
    public List<Estados> estados() {
        return repositorioEstado.findAll();
    }



}
