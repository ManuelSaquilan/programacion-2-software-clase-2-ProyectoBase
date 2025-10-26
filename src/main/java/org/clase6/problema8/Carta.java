// instanciar las siguientes tres cartas: el 7 de espadas, el 6 de espadas y el 1 de basto.
// Declarar una lista de cartas y añadir las tres cartas a dicha lista utilizando el método add().
// Obtener e imprimir el número y el palo de las tres cartas utilizando el método .get().
// Deberás crear la clase Carta y en el método main de tu clase principal programar la lista,
// instanciar las tres cartas, añadir dichas cartas a la lista y luego imprimir el número y palo de cada una

package org.clase6.problema8;

public class Carta {
    private int numero;
    private String palo;
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getPalo() {
        return palo;
    }
    
    public void setPalo(String palo) {
        this.palo = palo;
    }
    
}
