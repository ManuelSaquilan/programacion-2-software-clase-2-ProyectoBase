package org.clase1;

public class Clase04 {
    
    public static void main(String[] args) {
            int valor=(int)(Math.random()*1000);
            int largo = String.valueOf(valor).length();
            System.out.println("Valor aleatorio : "+valor);
            System.out.println("Cantidad de caracteres: "+largo);
        }
}
