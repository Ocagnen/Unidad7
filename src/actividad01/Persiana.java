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
public class Persiana {
    
    private boolean estado;
    private int dimensiones;

    public Persiana(boolean estado, int dimensiones) {
        this.estado = estado;
        this.dimensiones = dimensiones;
    }
    
    public void abrir(){
        this.estado=true;
    }
    
    public void cerrar(){
        this.estado=false;
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

    @Override
    public String toString() {
        return "Persiana{" + "estado=" + estado + ", dimensiones=" + dimensiones + '}';
    }
    
    
            
            
    
}
