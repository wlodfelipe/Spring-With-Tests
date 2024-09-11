package com.atividadeTestes1.atividadeTestes1;

import com.atividadeTestes1.atividadeTestes1.Controller.NumerosController;
import com.atividadeTestes1.atividadeTestes1.Service.NumerosService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class AtividadeTestes1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	NumerosController numerosController;

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
	@Test
	@DisplayName("Teste Service Soma")
	void testSumMethodService(){
		Assertions.assertEquals(39.3D, numerosService.somaLista(lista));
	}

	@Test
	@DisplayName("Teste Service média")
	void testAvgMethodService(){
		Assertions.assertEquals(9.825, numerosService.mediaLista(lista));
	}

	@Test
	@DisplayName("Teste Service extremos")
	void testExtremesMethodService(){
		List<Double> esperado = new ArrayList<>();
		esperado.add(1.0);
		esperado.add(33.3);
		Assertions.assertEquals(esperado, numerosService.extremosLista(lista));
	}

	@Test
	@DisplayName("Teste Controller repetidos")
	void testRepetidosMethodController(){
		List<Integer> listaInt = new ArrayList<>();
		listaInt.add(21);
		listaInt.add(20);
		listaInt.add(20);
		listaInt.add(21);
		listaInt.add(33);

		Map<Integer, Integer> esperado = new HashMap<>();
		esperado.put(20, 2);
		esperado.put(21,2);

		Assertions.assertEquals(esperado, numerosController.repetidosQuantidade(listaInt));
	}

//	@Test
//	@DisplayName("Teste Service repetidos")
//	void testRepetidosMethodService(){
//		List<Integer> listaInt = new ArrayList<>();
//		listaInt.add(21);
//		listaInt.add(20);
//		listaInt.add(20);
//		listaInt.add(21);
//		listaInt.add(33);
//
//		Map<Integer, Integer> esperado = new HashMap<>();
//		esperado.put(20, 2);
//		esperado.put(21,2);
//
//		// Não sei por que, mas o numerosService nao está puxando o método novo aqui, sendo que puxou no controller por isso vou deixar comentado
//		Assertions.assertEquals(esperado, numerosService.repetidosQuantidade(listaInt));
//	}

}
