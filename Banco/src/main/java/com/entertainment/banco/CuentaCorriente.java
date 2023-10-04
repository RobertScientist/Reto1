
package com.entertainment.banco;

public class CuentaCorriente extends Cuenta {
    
    private double saldo;
    
    public CuentaCorriente(Cliente titular, double saldo){
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
        System.out.println("Su saldo de cuenta corriente es: " + saldo);;
    }
    @Override
    public double avanzarMes(){
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "saldo=" + saldo + '}';
    }
    
}
