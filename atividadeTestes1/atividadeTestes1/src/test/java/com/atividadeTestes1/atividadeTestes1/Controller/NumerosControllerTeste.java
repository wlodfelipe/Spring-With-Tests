package com.atividadeTestes1.atividadeTestes1.Controller;

import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class NumerosControllerTeste {

    @Autowired
    NumerosController numerosController;

    List<Double> lista = new ArrayList<>();
    @BeforeEach
    void setup(){
        lista.add(1.0);
        lista.add(2.0);
        lista.add(33.3);
        lista.add(3.0);
    }

    @Test
    @DisplayName("Teste soma")
    void testSumMethod(){
        var retorno = numerosController.soma(lista);
        Assertions.assertEquals(39.3D, retorno);
    }

    @Test
    @DisplayName("Teste média")
    void testAvgMethod(){
        Assertions.assertEquals(9.825, numerosController.media(lista));
    }

    @Test
    @DisplayName("Teste extremos")
    void testExtremesMethod(){
        List<Double> esperado = new ArrayList<>();
        esperado.add(1.0);
        esperado.add(33.3);
        Assertions.assertEquals(esperado, numerosController.extremos(lista));
    }
}
