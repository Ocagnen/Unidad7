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
public class Calefactor {
    
    private int temperatura;
    private boolean estado;

    public Calefactor(int temperatura, boolean estado) {
        this.temperatura = temperatura;
        this.estado = estado;
    }
    
    public void encender(){
        this.estado=true;
    }
    
    public void apagar(){
        this.estado=false;
    }
    
    public void fijarTemperatura(int valor){
        this.temperatura = valor;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Calefactor{" + "temperatura=" + temperatura + ", estado=" + estado + '}';
    }
    
    
    
 
    
}
