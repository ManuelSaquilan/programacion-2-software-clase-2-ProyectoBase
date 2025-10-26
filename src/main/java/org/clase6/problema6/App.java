package org.clase6.problema6;

// Crear una lista vacía. Utilizando un ciclo iterativo, pedirle al usuario tres nombres que guardaremos en la lista.
// Con otro ciclo for, imprimir los elementos almacenados en la lista.    

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Pedir tres nombres
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        // Imprimir los nombres
        System.out.println("Los nombres ingresados son:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        scanner.close();
    }
}
