package com.matrix.adajunior.apicidades.distancia;


import com.matrix.adajunior.apicidades.servicos.RaioTerra;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/distances")

public class RecursoDistancia {
    Logger log = (Logger) LoggerFactory.getLogger(RecursoDistancia.class);

    private final RecursoDistancia servico;

    public RecursoDistancia(RecursoDistancia service) {
        this.servico = service;
    }

    @GetMapping("/by-points")
    public Double byPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return servico.distanceByPointsInMiles(city1, city2);
    }

    private Double distanceByPointsInMiles(Long city1, Long city2) {
        return servico.distanceByPointsInMiles(city1,city2);

    }

    @GetMapping("/by-cube")
    public Double byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("byCube");
        return servico.distanceByCubeInMeters(city1, city2);
    }

    private Double distanceByCubeInMeters(Long city1, Long city2) {
        return servico.distanceByPointsInMiles(city1,city2);
    }


}






