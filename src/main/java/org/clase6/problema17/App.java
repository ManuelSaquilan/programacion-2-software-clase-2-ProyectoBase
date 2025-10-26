package org.clase6.problema17;

// Programar una clase Carta, que tenga los parámetros numero (String) y palo (String), constructor y getters asociados. Programar un método llamado obtenerMazo que no tome parámetros, pero devuelva un mazo de cartas (Lista de Cartas) que contenga todas las cartas de la baraja inglesa (números: As, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K de palos: corazon, trébol, pica y diamante). Imprimir el número y palo de todas las cartas.
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Crear una baraja de cartas
        List<Carta> mazo = obtenerMazo();
        // Imprimir todas las cartas del mazo
        for (Carta carta : mazo) {
            System.out.println(carta);
        }
    }

    public static List<Carta> obtenerMazo() {
        String[] palos = {"corazón", "trébol", "pica", "diamante"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        List<Carta> mazo = new ArrayList<>();

        for (String palo : palos) {
            for (String valor : valores) {
                mazo.add(new Carta(palo, valor));
            }
        }
        return mazo;
    }
}
