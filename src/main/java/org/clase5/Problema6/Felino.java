package org.clase5.Problema6;

public class Felino extends Animal {
    public Felino(String foto, int tamaño, String localizacion) {
        super(foto, tamaño, localizacion);
    }
    
    public void hacerRuido() {
        System.out.println("El felino está maullando o rugiendo");
    }

    public void caer() {
        System.out.println("El felino cae siempre de pie");
    }
}
