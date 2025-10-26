package org.clase6.problema7;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Toyota"));
        autos.add(new Auto("Ford"));
        autos.add(new Auto("Chevrolet"));

        imprimirLista(autos);
    }

    public static void imprimirLista(List<Auto> autos) {
        for (Auto auto : autos) {
            System.out.println(auto.getMarca());
        }
    }
    
}
