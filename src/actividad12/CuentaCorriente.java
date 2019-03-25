/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;

/**
 *
 * @author Javier
 */
public class CuentaCorriente extends Cuenta{
    
    private final double INTERES = 0.15;
    private double saldoMin;

    public CuentaCorriente(double saldoMin, Persona cliente) {
        super(cliente);
        this.saldoMin = saldoMin;
    }

    public CuentaCorriente() {
        
        this.saldoMin = 50;
    }

    public double getSaldoMin() {
        return saldoMin;
    }

    public void setSaldoMin(double saldoMin) {
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCuentaCorriente{" + "INTERES=" + INTERES + ", saldoMin=" + saldoMin + '}';
    }

    @Override
    public void actualizarSaldo() {
        
    }

    @Override
    public void retirar(double saldoRetirado) {
        
    }

    
    
    
    
}
