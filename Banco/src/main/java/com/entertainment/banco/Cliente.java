
package com.entertainment.banco;

public class Cliente {
    
    private String nombre;
    private String documento;
    private int idCliente;
    private double saldo;
    private static int contadorClientes;
    private Cuenta cuentas[];
    private int contadorCuentas;
    private CDT cdts[];
    private int contadorCDT;
    private int mes;
    private static final int MAX_CDT = 1;
    
    private Cliente(){
        this.idCliente = ++contadorClientes;
        this.cdts = new CDT[MAX_CDT];
        this.mes = 0;
    }
    public Cliente(String nombre, String documento){
        this();
        this.nombre = nombre;
        this.documento = documento;
    }
    
    public void CrearCuenta(Cuenta cuenta){
        cuentas[this.contadorCuentas++] = cuenta;
    }
    
    public void consultaSaldo(){
        double total = 0;
        for(int i = 0; i < this.contadorCuentas; i++){
            Cuenta cuenta = cuentas[i];
            total += cuenta.consultarSaldo();
        }
        System.out.println(total);
    }
  
    public double avanzarMes(){
        double total = 0;
       for(int i = 0; i < this.contadorCuentas; i++){
            Cuenta cuenta = cuentas[i];
            total += cuenta.avanzarMes();
        }
       this.mes ++;
        return total;
    }
    
}
