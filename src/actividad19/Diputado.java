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
public class Diputado extends Legislador{
    
    private int numeroAsiento;

    public Diputado(int numeroAsiento, String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos) {
        super(provinciaQueRepresenta, partidoPolitico, nombre, apellidos);
        this.numeroAsiento = numeroAsiento;
    }

    public Diputado(){
        
    }
    
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDiputado" + "\tnumeroAsiento=" + numeroAsiento;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Diputado";
    }   
    
}
