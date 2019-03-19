/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

/**
 *
 * @author javier
 */
public class Ventana {
    
    private boolean estado;
    private int dimensiones;
    private Persiana persiana;

    public Ventana(boolean estado, int dimensiones, Persiana persiana) {
        this.estado = estado;
        this.dimensiones = dimensiones;
        this.persiana = persiana;
    }
    
    public Ventana(){
        
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + ", dimensiones=" + dimensiones + ", persiana=" + persiana + '}';
    }
    
    
    
    
}
