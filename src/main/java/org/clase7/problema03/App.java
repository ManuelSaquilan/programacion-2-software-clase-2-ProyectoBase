package org.clase7.problema03;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        // Crear un mapa que relacione DNI (String) con Persona
        Map<String, Persona> personas = new HashMap<>();

        // Instanciar 3 personas
        Persona persona1 = new Persona("Juan Pérez");
        Persona persona2 = new Persona("María González");
        Persona persona3 = new Persona("Carlos Rodríguez");

        // Agregar las personas al mapa usando DNI ficticio como llave
        personas.put("12345678", persona1);
        personas.put("87654321", persona2);
        personas.put("45678912", persona3);

        // Imprimir el nombre de las tres personas usando .get() para obtener cada persona
        System.out.println("=== Personas en el Mapa ===\n");

        System.out.println("DNI: 12345678 - Nombre: " + personas.get("12345678").getNombre());
        System.out.println("DNI: 87654321 - Nombre: " + personas.get("87654321").getNombre());
        System.out.println("DNI: 45678912 - Nombre: " + personas.get("45678912").getNombre());
    }
}
