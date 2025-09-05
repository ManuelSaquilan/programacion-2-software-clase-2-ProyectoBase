package org.clase2;

public class Clase17 {
    
    //Generar un valor aleatorio entre 0 y 1000. Mostrar la cantidad de dígitos que tiene dicho número

    public static void main(String[] args) {
        int numero = (int) (Math.random() * 1001); // Genera un número aleatorio entre 0 y 1000
        System.out.println("Número generado: " + numero);
        
        // Convertir el número a cadena para contar los dígitos
        String numeroStr = Integer.toString(numero);
        int cantidadDigitos = numeroStr.length();
        
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
    }
}
