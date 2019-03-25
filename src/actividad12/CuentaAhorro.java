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
public class CuentaAhorro extends Cuenta{
    
    private double interes;
    private double comisionAnual;

    public CuentaAhorro(double interes, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comisionAnual = comisionAnual;
    }

    public CuentaAhorro() {
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCuentaAhorro{" + "interes=" + interes + ", comisionAnual=" + comisionAnual + '}';
    }

    // Si el saldo es negativo no habrá interés
    @Override
    public void actualizarSaldo() {
        double nuevoSaldo;
        
        if(this.getSaldo()>0){
            nuevoSaldo = this.getSaldo()+(this.getSaldo()*this.interes)-this.comisionAnual;
        } else {
            nuevoSaldo = this.getSaldo()-this.comisionAnual;
        }
         this.setSaldo(nuevoSaldo);
    }

    // Si el saldo es positivo se retirará el dinero, en caso contrario no
    @Override
    public void retirar(double saldoRetirado) {
        
        if(this.getSaldo()>0){
            this.setSaldo(this.getSaldo()-saldoRetirado);
        }
    }
    
    
}
