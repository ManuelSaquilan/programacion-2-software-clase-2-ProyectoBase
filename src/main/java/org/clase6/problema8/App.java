package org.clase6.problema8;

// Utilizando la clase Carta del principio de este apunte, crear un mazo de cartas españolas de 48 cartas (1 al 12 de oro, 1 al 12 de copas, 1 al 12 de espada, 1 al 12 de basto). El mazo será, por supuesto, una Lista de Cartas.

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Carta> mazo = new ArrayList<>();

        // Crear las cartas de oro
        for (int i = 1; i <= 12; i++) {
            mazo.add(new Carta(i, "oro"));
            mazo.add(new Carta(i, "copas"));
            mazo.add(new Carta(i, "espada"));
            mazo.add(new Carta(i, "basto"));
        }

        // Imprimir las cartas del mazo
        for (Carta carta : mazo) {
            System.out.println("Carta: " + carta.getNumero() + " de " + carta.getPalo());
        }
    }

}
