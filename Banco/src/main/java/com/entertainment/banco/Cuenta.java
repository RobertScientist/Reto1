
package com.entertainment.banco;

public abstract class Cuenta {

    private double saldo;
    private Cliente titular;
    
    public Cuenta(Cliente titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public abstract void conocerSaldo();
    public abstract double getSaldo();
    public abstract double avanzarMes();
    
}
