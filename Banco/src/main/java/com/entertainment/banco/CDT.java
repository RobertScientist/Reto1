
package com.entertainment.banco;

public class CDT extends Cuenta{
   
    private Cliente titular;
    private double saldo;
    private static final double INTERES = 5.2;
    
    public CDT(Cliente titular, double saldoInicial){
        super(titular, saldoInicial);
    }
    @Override
    public double getSaldo(){
        return saldo;
    }
    @Override
    public void conocerSaldo(){
        System.out.println("Su saldo es: " + getSaldo());
    }
    @Override
    public double avanzarMes(){
        double i;
        i = this.saldo*INTERES;
        return saldo += i;
    }
}
