package org.Clase3;

// Plantear una clase llamada ‘Fecha’ que tenga 3 atributos: dia, mes y año.
// Definir 2 constructores, el primero sin parámetros que inicialice la fecha con el 1 de enero de 2000 y el segundo constructor que lleguen 3 enteros con el dia, mes y año.
// Crear los siguientes métodos:
// - Imprimir la fecha.
// - Mostrar un mensaje a que semestre corresponde la fecha.
// - Mostrar un mensaje si la fecha corresponde a Navidad.

public class Ejercicio48 {
    private int dia;
    private int mes;
    private int anio;

    public Ejercicio48() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Ejercicio48(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void imprimirFecha() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }

    public void mostrarSemestre() {
        if (mes >= 1 && mes <= 6) {
            System.out.println("La fecha corresponde al primer semestre.");
        } else if (mes >= 7 && mes <= 12) {
            System.out.println("La fecha corresponde al segundo semestre.");
        } else {
            System.out.println("Mes inválido.");
        }
    }

    public void esNavidad() {
        if (dia == 25 && mes == 12) {
            System.out.println("La fecha corresponde a Navidad.");
        } else {
            System.out.println("La fecha no corresponde a Navidad.");
        }
    }

    public static void main(String[] args) {
        Ejercicio48 fecha1 = new Ejercicio48();
        fecha1.imprimirFecha();
        fecha1.mostrarSemestre();
        fecha1.esNavidad();

        Ejercicio48 fecha2 = new Ejercicio48(25, 12, 2023);
        fecha2.imprimirFecha();
        fecha2.mostrarSemestre();
        fecha2.esNavidad();
    } 
}
