package org.clase5.Problema6;

public class Leon extends Felino {

    public Leon(String foto, int tamaño, String localizacion) {
        super(foto, tamaño, localizacion);
    }
    
    public void comer() {
        System.out.println("El león está cazando y comiendo carne");
    }
 
    public void hacerRuido() {
        System.out.println("El león está rugiendo fuertemente");
    }
}