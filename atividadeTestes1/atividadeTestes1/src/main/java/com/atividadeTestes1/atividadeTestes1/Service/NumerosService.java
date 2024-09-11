package com.atividadeTestes1.atividadeTestes1.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NumerosService {

    public double somaLista(List<Double> lista){
        return lista.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double mediaLista(List<Double> lista){
        var data = lista.stream().mapToDouble(Double::doubleValue).sum();
        return data/lista.size();
    }

    public List<Double> extremosLista(List<Double> lista){
        List<Double> extremos = new ArrayList<Double>();
        lista.sort(Comparator.naturalOrder());

        extremos.add(lista.get(0));
        extremos.add(lista.get(lista.size()-1));

        return extremos;
    }

    public static Map<Integer, Integer> repetidosQuantidadeLista(List<Integer> lista) {
        Map<Integer, Integer> numberCount = new HashMap<>();

        for (int number : lista) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        numberCount.entrySet().removeIf(entry -> entry.getValue() == 1);

        return numberCount;
    }
}
