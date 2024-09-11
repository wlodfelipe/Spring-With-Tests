package com.atividadeTestes1.atividadeTestes1.Services;

import com.atividadeTestes1.atividadeTestes1.Service.NumerosService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class NumerosServiceTeste {

    @Autowired
    NumerosService numerosService;

    List<Double> lista = new ArrayList<>();
    @BeforeEach
    void setup(){
        lista.add(1.0);
        lista.add(2.0);
        lista.add(33.3);
        lista.add(3.0);
    }

    @Test
    @DisplayName("Teste Service Soma")
    void testSumMethod(){
        Assertions.assertEquals(39.3D, numerosService.somaLista(lista));
    }

    @Test
    @DisplayName("Teste média")
    void testAvgMethod(){
        Assertions.assertEquals(9.825, numerosService.mediaLista(lista));
    }

    @Test
    @DisplayName("Teste extremos")
    void testExtremesMethod(){
        List<Double> esperado = new ArrayList<>();
        esperado.add(1.0);
        esperado.add(33.3);
        Assertions.assertEquals(esperado, numerosService.extremosLista(lista));
    }
}
