package org.clase2;

public class Clase15 {
    
    // Generar un valor aleatorio entre 2 y 100.
    // Luego mostrar todos los valores pares que hay desde 2 hasta dicho valor.
    public static void main(String[] args) {
        int valor = (int) (Math.random() * 99) + 2;
        System.out.println("Valor aleatorio generado: " + valor);
        System.out.println("Números pares desde 2 hasta " + valor + ":");
        int i = 2;
        while (i <= valor) {
            System.out.println(i);
            i += 2;
        }
    }
}
