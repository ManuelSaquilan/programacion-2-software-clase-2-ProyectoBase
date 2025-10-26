package org.clase7.problema05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Declarar un mapa con nombres (String) como llaves y edades (Integer) como valores
        Map<String, Integer> personas = new HashMap<>();

        // Agregar nombres y edades al mapa
        personas.put("Manuel", 22);
        personas.put("Carlos", 23);
        personas.put("Ana", 21);

        // Imprimir nombres y edades utilizando un iterador
        System.out.println("=== Nombres y Edades ===\n");
        System.out.println("Nombre\t\tEdad");
        System.out.println("------------------------");

        // Recorrer el mapa usando el iterador
        for (String nombre : personas.keySet()) {
            System.out.println(nombre + "\t\t" + personas.get(nombre));
        }
    }
}
