package org.clase5.problema5;

public class Empleado extends Persona {
    private float sueldo;
    
    public void cargarDatos() {
        super.cargarDatos();
        System.out.print("Ingrese sueldo: ");
        sueldo = teclado.nextFloat();
    }

    public void imprimirSueldo() {
        super.imprimirDatos();
        System.out.println("Sueldo: " + sueldo);
    }

    public void debePagarImpuesto() {
        if (sueldo > 30000) {
            System.out.println(nombre + " debe pagar impuestos.");
        } else {
            System.out.println(nombre + " no debe pagar impuestos.");
        }
    }
    
}
