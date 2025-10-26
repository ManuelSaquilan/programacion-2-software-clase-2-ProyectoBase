package org.clase6.problema15;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        agregarNumeros(numeros, teclado);
        teclado.close();
    }

    public static void agregarNumeros(List<Integer> numeros, Scanner teclado) {
        System.out.print("Ingrese un número (0 para terminar): ");
        int numero = teclado.nextInt();
        if (numero != 0) {
            numeros.add(numero);
            agregarNumeros(numeros, teclado);
        } else {
            imprimirNumerosYPromedio(numeros);
        }
    }

    public static void imprimirNumerosYPromedio(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
            return;
        }
        int suma = 0;
        System.out.println("Números ingresados:");
        for (int num : numeros) {
            System.out.println(num);
            suma += num;
        }
        double promedio = (double) suma / numeros.size();
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
