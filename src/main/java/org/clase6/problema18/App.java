package org.clase6.problema18;

// Programar un método que tome de parámetro una Lista de Cartas, y retorne una carta aleatoria. Llamar a este método desde el main e imprimir el numero y palo del valor de retorno.

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carta> listaDeCartas = new ArrayList<>(); // Crear una lista de cartas
        listaDeCartas.add(new Carta("Corazones", "As"));
        listaDeCartas.add(new Carta("Diamantes", "Rey"));
        listaDeCartas.add(new Carta("Tréboles", "Reina"));
        listaDeCartas.add(new Carta("Picas", "Jota"));
        listaDeCartas.add(new Carta("Corazones", "10"));

        // Obtener una carta aleatoria
        Carta cartaAleatoria = obtenerCartaAleatoria(listaDeCartas);

        // Imprimir la carta aleatoria
        System.out.println("Carta aleatoria: " + cartaAleatoria);
    }

    public static Carta obtenerCartaAleatoria(List<Carta> listaDeCartas) {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaDeCartas.size());
        return listaDeCartas.get(indiceAleatorio);
    }
}
