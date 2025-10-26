package org.clase6.problema4;

// Crear una lista de tres nombres, como en el ejercicio anterior.
// Imprimir el resultado de llamar el método .isEmpty() sobre la lista, luego eliminar todos los elementos de la lista utilizando .clear()
// y nuevamente preguntar el resultado del método isEmpty() sobre la lista.
//  Finalmente, preguntar el tamaño de la lista al final del programa.

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Nombre> nombres = new ArrayList<>();

        nombres.add(new Nombre("Juan"));
        nombres.add(new Nombre("María"));
        nombres.add(new Nombre("Pedro"));

        for (Nombre nombre : nombres) {
            System.out.println(nombre.getNombre());
        }
        System.out.println("Tamaño de la lista: " + nombres.size());

        System.out.println("¿La lista está vacía? " + nombres.isEmpty());

        nombres.clear();

        System.out.println("¿La lista está vacía después de clear()? " + nombres.isEmpty());
        System.out.println("Tamaño de la lista: " + nombres.size());
    }
}