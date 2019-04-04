/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad19;

/**
 *
 * @author Javier
 */
public class Senador extends Legislador{
    
    private double salarioExtra;

    public Senador(double salarioExtra, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellidos);
        this.salarioExtra = salarioExtra;
    }

    public Senador(){
        
    }
    
    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSenador " + "\tsalarioExtra=" + salarioExtra;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senador";
    }
    
    
    
    
    
}
