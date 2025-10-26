package org.clase6.problema13;

// Construir una Lista de Listas de elementos String, donde podamos almacenar la siguiente tabla:
// Argentina Brasil Paraguay Peru Guatemala Cuba Nicaragua Puerto Rico Estados Unidos Canada Mexico Alemania Francia Italia Portugal
// De modo que la Lista índice 0 contenga los nombres de los países de Latinoamérica, la lista de índice uno contenga los países de Centroamérica, etc.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<List<String>> paises = new ArrayList<>();
        paises.add(Arrays.asList("Argentina", "Brasil", "Paraguay", "Peru"));
        paises.add(Arrays.asList("Guatemala", "Cuba", "Nicaragua", "Puerto Rico"));
        paises.add(Arrays.asList("Estados Unidos", "Canada", "Mexico"));
        paises.add(Arrays.asList("Alemania", "Francia", "Italia", "Portugal"));

        // AGREGAR ESTA LÍNEA para llamar al método
        mostrarPaises(paises);
    }


    public static void mostrarPaises(List<List<String>> paises) {
        for (List<String> region : paises) {
            for (String pais : region) {
                System.out.print(pais + " ");
            }
            System.out.println();
    
        }
    
        System.out.println(paises.get(0).get(0)); // Argentina

    }
}
