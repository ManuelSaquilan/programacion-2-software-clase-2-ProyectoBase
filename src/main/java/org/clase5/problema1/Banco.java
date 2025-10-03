package org.clase5.problema1;

public class Banco {
    private Cliente cliente1, cliente2, cliente3;

    public Banco() {
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Maria");
        cliente3 = new Cliente("Pedro");
    }

    public void operar() {
        cliente1.depositar(100);
        cliente2.depositar(150);
        cliente3.depositar(200);
        cliente3.extraer(150);
    }

    public void depositosTotales() {
        int total = cliente1.retornarMonto() + cliente2.retornarMonto() + cliente3.retornarMonto();
        System.out.println("Depositos totales en el banco: " + total);
    
    cliente1.mostrar();
    cliente2.mostrar();
    cliente3.mostrar();
    }

    public static void main(String[] args) {
        
        Banco banco1 = new Banco();
        banco1.operar();
        banco1.depositosTotales();
    }
}