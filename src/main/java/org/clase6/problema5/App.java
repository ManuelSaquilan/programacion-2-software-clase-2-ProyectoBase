package org.clase6.problema5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Nombre> nombres = new ArrayList<>();
        nombres.add(new Nombre("Ana"));
        nombres.add(new Nombre("Juan"));
        nombres.add(new Nombre("Pedro"));

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i).getNombre());
        }
    }
}
