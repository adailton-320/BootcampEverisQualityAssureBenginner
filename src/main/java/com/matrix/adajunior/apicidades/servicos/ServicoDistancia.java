package com.matrix.adajunior.apicidades.servicos;



import com.matrix.adajunior.apicidades.cidades.Cidades;
import com.matrix.adajunior.apicidades.cidades.repositorio.RepositorioCidade;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Arrays;
import java.util.List;


@Service
public class ServicoDistancia {
    private final RepositorioCidade repositorioCidade;
    Logger log = (Logger) LoggerFactory.getLogger(ServicoDistancia.class);

    public ServicoDistancia(RepositorioCidade repositorioCidade) {
        this.repositorioCidade = repositorioCidade;
    }


    public Double distanceByPointsInMiles(final Long city1, final Long city2) {
        log.info("nativePostgresInMiles({}, {})", city1, city2);
        return repositorioCidade.distanceByPoints(city1, city2);
    }

    public Double distanceByCubeInMeters(Long city1, Long city2) {
        log.info("distanceByCubeInMeters({}, {})", city1, city2);
        final List<Cidades> cities = repositorioCidade.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return repositorioCidade.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }





}
