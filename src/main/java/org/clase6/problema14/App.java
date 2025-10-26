package org.clase6.problema14;

// Crear una lista de Strings llamada sistemaSolar y cargar uno por uno y en orden el nombre de los planetas 
// del sistema solar. Imprimir el tamaño de la lista y todos los elementos y su índice.
// usar lista de listas (ArrayList)

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> sistemaSolar = new ArrayList<>();

        sistemaSolar.add("Mercurio");
        sistemaSolar.add("Venus");
        sistemaSolar.add("Tierra");
        sistemaSolar.add("Marte");
        sistemaSolar.add("Júpiter");
        sistemaSolar.add("Saturno");
        sistemaSolar.add("Urano");
        sistemaSolar.add("Neptuno");

        System.out.println("Tamaño de la lista: " + sistemaSolar.size());
        for (int i = 0; i < sistemaSolar.size(); i++) {
            System.out.println("Índice " + i + ": " + sistemaSolar.get(i));
        }
    }
}
