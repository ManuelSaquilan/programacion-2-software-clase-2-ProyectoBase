package org.clase6.problema16;
// Programar una clase Auto que tenga los parámetros marca (String) y modelo (int), un constructor con estos parámetros y getters para ambos. Crear una lista de objetos Auto (List<Auto>) y pedirle al usuario que ingrese 3 autos, que serán almacenados en la lista. Imprimir la marca y modelo de cada uno de los Autos ingresados en la lista.

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", 2020);
        Auto auto2 = new Auto("Honda", 2019);
        Auto auto3 = new Auto("Ford", 2021);

        List<Auto> autos = new ArrayList<>();
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);

        for (Auto auto : autos) {
            System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo());
        }
    }    
}
