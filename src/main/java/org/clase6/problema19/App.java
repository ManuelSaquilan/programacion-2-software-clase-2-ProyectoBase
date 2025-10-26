package org.clase6.problema19;

import java.util.List;

// Diseñar un método que tome de parámetro una Lista de Cartas (mazo completo) y retorne otra Lista, de solo tres cartas esta vez, elegidas al azar del mazo. Llamar a este método desde el programa principal e imprimir los valores de la Lista de retorno (las tres cartas elegidas al azar). Asegurarse de que en las tres cartas elegidas al azar, no existan repetidas.

public class App {
    public static void main(String[] args) {
        List<String> palos = List.of("Corazones", "Diamantes", "Tréboles", "Picas");
        List<String> valores = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        Mazo mazo = new Mazo(palos, valores);
        List<Carta> tresCartas = elegirTresCartasAlAzar(mazo);

        System.out.println("Tres cartas elegidas al azar:");
        for (Carta carta : tresCartas) {
            System.out.println(carta);
        }
    }
    
    public static List<Carta> elegirTresCartasAlAzar(Mazo mazo) {
        return mazo.elegirTresCartasAlAzar();
    }
}
