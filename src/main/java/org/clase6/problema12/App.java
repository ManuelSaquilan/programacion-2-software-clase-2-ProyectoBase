package org.clase6.problema12;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 0));
        alumnos.add(new Alumno("María", 0));
        alumnos.add(new Alumno("Pedro", 0));
        alumnos.add(new Alumno("Ana", 0));

        // Desordenar la lista
        java.util.Collections.shuffle(alumnos);
        java.util.Scanner teclado = new java.util.Scanner(System.in);
               
        // desordenar lista
        Collections.shuffle(alumnos);

        // Ingresar notas
        for (Alumno alumno : alumnos) {
            System.out.print("Ingrese la nota para " + alumno.getNombre() + ": ");
            int nota = teclado.nextInt();
            alumno.setNota(nota);
        }

        System.out.println("Notas ingresadas:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + ": " + alumno.getNota());
        }

        teclado.close();
    }
}
