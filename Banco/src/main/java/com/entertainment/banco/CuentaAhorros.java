
package com.entertainment.banco;


public class CuentaAhorros extends Cuenta{
    
    private double saldo;
    private static final double INTERES = 2.2;
    
    public CuentaAhorros(Cliente titular, double saldo){
        super(titular,saldo);       
    }
    public void consignarSaldo(double saldo){
        this.saldo = saldo;
    }
    public void retirarSaldo(double saldo){
         if(this.saldo < saldo){
            System.out.println("Lo sentimos, no hay suficiente saldo. Su saldo actual es: " + this.saldo);
        }else{
            this.saldo -= saldo;
            System.out.println("Saldo en cuenta: " + this.saldo);
        }
    }
    @Override
    public double getSaldo(){
        return saldo;
    }
    @Override
    public void conocerSaldo(){
        System.out.println("Su saldo de cuenta ahorros es: " + saldo);
    }
    @Override
    public double avanzarMes(){
        double i;
        i = this.saldo*INTERES;
        return saldo += i;
    }
}
