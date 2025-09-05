package org.clase2;

public class Clase24 {
    
    // En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada cuenta corriente se conoce: número de cuenta y saldo actual.
    // El ingreso de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
    // Se pide confeccionar un programa que lea los datos de las cuentas corrientes e informe:
    // a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo que:
    // Estado de la cuenta 'Acreedor' si el saldo es >0.
    // 'Deudor' si el saldo es <0.
    // 'Nulo' si el saldo es =0.
    // b) La suma total de los saldos acreedores.

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int numeroCuenta;
        double saldoActual;
        int contador = 0;
        double sumaSaldosAcreedores = 0;

        System.out.print("Ingrese el número de cuenta (negativo para finalizar): ");
        numeroCuenta = teclado.nextInt();

        while (numeroCuenta >= 0) {
            System.out.print("Ingrese el saldo actual: ");
            saldoActual = teclado.nextDouble();

            if (saldoActual > 0) {
                System.out.println("Número de cuenta: " + numeroCuenta + " - Estado: Acreedor");
                sumaSaldosAcreedores += saldoActual;
            } else if (saldoActual < 0) {
                System.out.println("Número de cuenta: " + numeroCuenta + " - Estado: Deudor");
                sumaSaldosAcreedores += saldoActual;
            } else {
                System.out.println("Número de cuenta: " + numeroCuenta + " - Estado: Nulo");
            }

            contador++;
            System.out.print("Ingrese el número de cuenta (negativo para finalizar): ");
            numeroCuenta = teclado.nextInt();
        }        

        if (contador > 0) {
            System.out.println("La suma total de los saldos acreedores es: " + String.format("%.2f", sumaSaldosAcreedores));
        } else {
            System.out.println("No se ingresaron cuentas válidas.");
        }

        teclado.close();
    }
}
