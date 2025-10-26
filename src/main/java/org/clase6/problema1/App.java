package org.clase6.problema1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carta> cartas = new ArrayList<>();
        
        Carta carta1 = new Carta(7, "espada");
        cartas.add(carta1);
        
        Carta carta2 = new Carta(6, "espada");
        cartas.add(carta2);
        
        Carta carta3 = new Carta(1, "basto");
        cartas.add(carta3);
        
        for (Carta carta : cartas) {
            System.out.println("Número: " + carta.getNumero() + ", Palo: " + carta.getPalo());
        }
        
        
    }
    
    
}