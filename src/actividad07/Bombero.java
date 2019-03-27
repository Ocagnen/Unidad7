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
public class Bombero extends Trabajador{

    public Bombero(String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
    }
    
    public Bombero(){
        
    }
    
    public void rescatar(){
        System.out.println("Rescatando una persona");
    }

    @Override
    public void cotizar() {
        System.out.println("Cotizo como bombero");
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajo como bombero");
    }
    
    
    
}
