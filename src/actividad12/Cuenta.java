/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;

import java.util.Random;

/**
 *
 * @author Javier
 */
public abstract class Cuenta {
    
    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente) {  
        Random alt = new Random();
        this.cliente = cliente;
        this.saldo = 0;        
        this.numeroCuenta = alt.nextLong();
    }

    public Cuenta() {
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double saldoRetirado);

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    
    
}
