package org.clase5.Problema6;

public class Lobo extends Canino {

    public Lobo(String foto, int tamaño, String localizacion, String raza) {
        super(foto, tamaño, localizacion, raza);
    }

    @Override
    public void comer() {
        System.out.println("El lobo está cazando en manada");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El lobo está aullando a la luna");
    }
    
}
