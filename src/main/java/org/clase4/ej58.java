package org.clase4;

import java.util.Locale;

// Definir un Array de 5 componentes de tipo float que representen las alturas de 5 personas.
// Implementar los siguientes métodos:
// - Obtener el promedio de las alturas.
// - Contar cuántas personas son más altas que el promedio y cuántas más bajas.


public class ej58 {
    private java.util.Scanner teclado = new java.util.Scanner(System.in);
    private float[] alturas;
    
    public ej58() {
        teclado.useLocale(Locale.US);
        
        System.out.println("Ingrese cuantos elementos deses cargar:");
        int n = teclado.nextInt();
        alturas = new float[n];
    }

    public void cargarAlturas() {
        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + ": ");
            alturas[i] = teclado.nextFloat();
        }
    }

    public float calcularPromedio() {
        float suma = 0;
        float promedio = 0;
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
        }
        promedio = suma / alturas.length;
        System.out.println("El promedio de alturas es: " + promedio);
        return promedio;
    }

    public void contarAlturas(float promedio) {
        int mayores = 0;
        int menores = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                mayores++;
            } else if (alturas[i] < promedio) {
                menores++;
            }
        }
        System.out.println("Cantidad de personas más altas que el promedio: " + mayores);
        System.out.println("Cantidad de personas más bajas que el promedio: " + menores);
    }

    public static void main(String[] args) {
        ej58 gestionAlturas = new ej58();
        gestionAlturas.cargarAlturas();
        float promedio = gestionAlturas.calcularPromedio();
        gestionAlturas.contarAlturas(promedio);
    }
}
