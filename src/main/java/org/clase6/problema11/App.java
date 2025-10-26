package org.clase6.problema11;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] lista = {10, 1000, 3, 4, 99};
        List<Integer> listaNumeros = Arrays.asList(lista);
        
        Collections.sort(listaNumeros);
        Collections.reverse(listaNumeros);

        for (int numero : listaNumeros) {
            System.out.println(numero);
        }

        System.out.println("El mayor numero es: " + Collections.max(listaNumeros));
        System.out.println("El menor numero es: " + Collections.min(listaNumeros));

        Collections.shuffle(listaNumeros);
        System.out.println("Lista desordenada: " + listaNumeros);
    }
}
