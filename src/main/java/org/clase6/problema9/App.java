package org.clase6.problema9;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    
}
