package org.clase6.problema10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        String[] arrayNombres = {"Juan", "María", "Pedro"};

        // Método 1: Usando Arrays.asList()
        List<String> nombresList1 = Arrays.asList(arrayNombres);
        System.out.println("Lista usando Arrays.asList(): " + nombresList1);

        // Método 2: Usando Collections.addAll()
        List<String> nombresList2 = new ArrayList<>();
        Collections.addAll(nombresList2, arrayNombres);
        System.out.println("Lista usando Collections.addAll(): " + nombresList2);

        // Método 3: Usando un bucle for
        List<String> nombresList3 = new ArrayList<>();
        for (String nombre : arrayNombres) {
            nombresList3.add(nombre);
        }
        System.out.println("Lista usando un bucle for: " + nombresList3);
    }
}
