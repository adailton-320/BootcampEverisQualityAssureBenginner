package com.matrix.adajunior.apicidades.cidades;

import com.matrix.adajunior.apicidades.cidades.repositorio.RepositorioCidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

public class RecursoCidades {
    private final RepositorioCidade repositorioCidade;

    public RecursoCidades(RepositorioCidade repositorioCidade) {
        this.repositorioCidade = repositorioCidade;
    }

    @GetMapping
    public Page<Cidades> cities(final Pageable page) {
        return repositorioCidade.findAll(page);
    }
}
