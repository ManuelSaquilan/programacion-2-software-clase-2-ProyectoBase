package org.Clase3;

// Plantear una clase llamada NumeroAleatorio.
// Al constructor enviar el rango de valores (mínimo y máximo, por ejemplo si queremos generar un valor aleatorio entre 1 y 80, le pasaremos dichos enteros)
// Definir un segundo método que retorne un valor aleatorio en el rango especificado en el constructor. Llamar luego 10 veces a dicho método.

public class Ejercicio41 {
    private int minimo, maximo;
    
    public Ejercicio41(int min, int max) {
        minimo = min;
        maximo = max;
    }

    public int Retornar() {
        int rango = maximo - minimo + 1;
        int valorAleatorio = (int)(Math.random() * rango) + minimo;
        return valorAleatorio;
    }

    public static void main(String[] args) {
        Ejercicio41 numeroAleatorio = new Ejercicio41(1, 80);
        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeroAleatorio.Retornar());
        }
    }
   
}