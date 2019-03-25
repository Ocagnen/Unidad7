/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad07;

/**
 *
 * @author javier
 */
public class Camarero extends Trabajador{
    
    private String rango;

    public Camarero(String rango, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.rango = rango;
    }
    
    public Camarero(){
        this.rango = "encargado";
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    public void servirMesa(){
        System.out.println("Sirviendo mesa");
    }
    
    @Override
    public void cotizar(){
        System.out.println("Cotizando como camarero");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCamarero{" + "rango=" + rango + '}';
    }
    
    
    
}
