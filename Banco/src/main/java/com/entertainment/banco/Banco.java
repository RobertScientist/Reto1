package com.entertainment.banco;

public class Banco {

    public static void main(String[] args) {
        //Creación del cliente
        Cliente cliente1 = new Cliente("Robert", "1234");
        
        CuentaCorriente cuenta1 = new CuentaCorriente(cliente1,1000000);
        CuentaAhorros cuenta2 = new CuentaAhorros(cliente1, 100000);
        
        cliente1.avanzarMes();
        
        cuenta2.conocerSaldo();
    }
}
