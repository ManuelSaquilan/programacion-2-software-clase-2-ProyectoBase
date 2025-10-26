package org.clase6.problema19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    public Mazo(List<String> palos, List<String> valores) {
        cartas = new ArrayList<>();
        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Carta(palo, valor));
            }
        }
        barajar();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> elegirTresCartasAlAzar() {
        List<Carta> tresCartas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            tresCartas.add(cartas.remove(0));
        }
        return tresCartas;
    }

    public void mostrarMazo() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}
