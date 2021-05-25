package com.matrix.adajunior.apicidades.paises;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "pais")

public class Pais {

    @Id
    private Long id;

    @Column(name= "nome")
    private String name;

    @Column(name= "nome_pt")
    private String portName;

    @Column(name= "sigla")
    private String codigo;


    private Integer bacen;

    public Pais(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPortName() {
        return portName;
    }

    public String getCodigo() {
        return codigo;
    }

    public Integer getBacen() {
        return bacen;
    }
}
