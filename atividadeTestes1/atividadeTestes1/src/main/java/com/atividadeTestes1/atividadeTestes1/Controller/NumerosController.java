package com.atividadeTestes1.atividadeTestes1.Controller;

import com.atividadeTestes1.atividadeTestes1.Service.NumerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/numeros")
public class NumerosController {
    @Autowired
    private NumerosService numerosService;

    @GetMapping("/soma")
    public Double soma(@RequestBody List<Double> lista){
        return numerosService.somaLista(lista);
    }

    @GetMapping("/media")
    public Double media(@RequestBody List<Double> lista){
        return numerosService.mediaLista(lista);
    }

    @GetMapping("/extremos")
    public List<Double> extremos(@RequestBody List<Double> lista){
        return numerosService.extremosLista(lista);
    }

    @GetMapping("/repetidos")
    public Map<Integer, Integer> repetidosQuantidade(@RequestBody List<Integer> lista){
        return numerosService.repetidosQuantidadeLista(lista);
    }
}
