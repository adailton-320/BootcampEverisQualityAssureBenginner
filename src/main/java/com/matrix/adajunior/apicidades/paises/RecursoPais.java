package com.matrix.adajunior.apicidades.paises;

import com.matrix.adajunior.apicidades.paises.Pais;
import com.matrix.adajunior.apicidades.paises.repositorio.RepositorioPais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/paises")

public class RecursoPais {

    private RepositorioPais repositorioPais;

    public RecursoPais(RepositorioPais repositorioPais) {
        this.repositorioPais = repositorioPais;
    }

    @GetMapping
    public Page<Pais> paises(Pageable pageable){
        return repositorioPais.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Pais> optional= repositorioPais.findById(id);
        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }
}
