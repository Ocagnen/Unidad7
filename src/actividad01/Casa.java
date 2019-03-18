/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad01;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Casa {
    
    private Puerta puerta;
    private ArrayList<Ventana> ventana;    
    private ArrayList<Calefactor> calefactor;

    public Casa(Puerta puerta, ArrayList<Ventana> ventana, ArrayList<Calefactor> calefactor) {
        this.puerta = puerta;
        this.ventana = ventana;
        this.calefactor = calefactor;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public ArrayList<Ventana> getVentana() {
        return ventana;
    }

    public void setVentana(ArrayList<Ventana> ventana) {
        this.ventana = ventana;
    }

    public ArrayList<Calefactor> getCalefactor() {
        return calefactor;
    }

    public void setCalefactor(ArrayList<Calefactor> calefactor) {
        this.calefactor = calefactor;
    }

    @Override
    public String toString() {
        return "Casa{" + "puerta=" + puerta + ", ventana=" + ventana + ", calefactor=" + calefactor + '}';
    }
    
    

   
    
    
    
}
