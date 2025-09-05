package org.clase2;

public class Clase19 {
    
    // Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24, etc.
    public static void main(String[] args) {
        int i = 8;
        while (i <= 500) {
            System.out.print(i);
            if (i < 500) {
                System.out.print(" - ");
            }
            i += 8;
        }
    }
}
