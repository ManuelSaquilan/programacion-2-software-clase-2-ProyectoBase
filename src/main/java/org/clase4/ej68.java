package org.clase4;

// Crear un Array bidimensional de n * m filas (cargar n y m por teclado) Intercambiar la primer fila con la segundo. Imprimir luego el Array bidimensional.
// – Algoritmos y Estructuras de Datos II –
// Imprimir los cuatro valores que se encuentran en los vértices de la misma (array[0][0] etc.)

public class ej68 {
   private java.util.Scanner teclado;
   private int[][] matriz;
   
    public ej68() {
         teclado = new java.util.Scanner(System.in);
         System.out.print("Ingrese el número de filas (n): ");
         int n = teclado.nextInt();
         System.out.print("Ingrese el número de columnas (m): ");
         int m = teclado.nextInt();
         matriz = new int[n][m];
         cargarMatriz(n, m);
         intercambiarPrimerasFilas();
    }

    private void cargarMatriz(int n, int m) {
        for (int fila = 0; fila < n; fila++) {
            for (int col = 0; col < m; col++) {
                System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
                matriz[fila][col] = teclado.nextInt();
            }
        }
    }

    private void intercambiarPrimerasFilas() {
        if (matriz.length < 2) {
            System.out.println("La matriz debe tener al menos dos filas para intercambiar.");
            return;
        }
        int[] temp = matriz[0];
        matriz[0] = matriz[1];
        matriz[1] = temp;
    }

    public void imprimirMatriz() {
        System.out.println("Contenido de la matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }
        if (matriz.length > 0 && matriz[0].length > 0) {
            System.out.println("Valores en los vértices:");
            System.out.println("Esquina superior izquierda: " + matriz[0][0]);
            System.out.println("Esquina superior derecha: " + matriz[0][matriz[0].length - 1]);
            System.out.println("Esquina inferior izquierda: " + matriz[matriz.length - 1][0]);
            System.out.println("Esquina inferior derecha: " + matriz[matriz.length - 1][matriz[0].length - 1]);
        }
    }

    public static void main(String[] args) {
        ej68 ejemplo = new ej68();
        ejemplo.imprimirMatriz();
    }
}
