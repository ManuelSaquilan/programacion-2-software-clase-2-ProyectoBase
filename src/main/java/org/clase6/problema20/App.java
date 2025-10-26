package org.clase6.problema20;


// Diseñar un programa que pida al usuario 5 números y los almacene en una lista.
// Copiar esta lista en otra nueva lista. Desordenar aleatoriamente la nueva lista. Imprimir los elementos de cada lista, línea por línea, de modo de que el primer elemento de cada lista se lea en una línea, el segundo elemento de cada lista en otra, y así. Ejemplo:
// lista original = 1,4,7,9
// lista shuffled = 9,1,7,4
// El programa imprimiría:
//  1, 9
//  4, 1
//  7, 7
//  9, 4

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> listaOriginal = new ArrayList<>();

        // Pedir 5 números al usuario
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un número: ");
            listaOriginal.add(teclado.nextInt());
        }

        // Copiar la lista original a una nueva lista
        List<Integer> listaDesordenada = new ArrayList<>(listaOriginal);

        // Desordenar aleatoriamente la nueva lista
        Collections.shuffle(listaDesordenada);

        // Imprimir los elementos de cada lista
        System.out.println("Imprimiendo elementos de las listas:");
        for (int i = 0; i < listaOriginal.size(); i++) {
            System.out.println("  " + listaOriginal.get(i) + ", " + listaDesordenada.get(i));
        }

        teclado.close();
    }
}
