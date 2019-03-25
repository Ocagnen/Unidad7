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

    /*
    Si es mayor que 1000, se usa como referencia para el interés el saldo
    mínimo, de lo contrario, se aplica el interés con normalidad.
    */
    @Override
    public void actualizarSaldo() {
        double saldoNuevo;
        
        if(this.getSaldo()>1000){            
            saldoNuevo = this.getSaldo()+(this.saldoMin*this.INTERES);
        } else {
            saldoNuevo = this.getSaldo()+(this.getSaldo()*this.INTERES);
        }
        
        this.setSaldo(saldoNuevo);
    }

    // El saldo tras retirar dinero no puede ser menor al saldo mínimo establecido
    @Override
    public void retirar(double saldoRetirado) {
        double nuevoSaldo = this.getSaldo()-saldoRetirado;
        
        if (nuevoSaldo >= this.saldoMin){
            this.setSaldo(nuevoSaldo);
        }
    }

    
    
    
    
}
