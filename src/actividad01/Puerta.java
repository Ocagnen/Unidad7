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
public class Puerta {
    
    private boolean estado;
    private int ancho;

    public Puerta(boolean estado, int ancho) {
        this.estado = estado;
        this.ancho = ancho;
    }
    
    public Puerta(){
        
    }
    
    public void cerrar(){
        this.estado=false;
    }
    
    public void abrir(){
        this.estado=true;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ancho=" + ancho + '}';
    }
    
    
  
    
}
