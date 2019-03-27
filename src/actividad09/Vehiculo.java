/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad09;

/**
 *
 * @author javier
 */
public abstract class Vehiculo {
    
    // Se puede tener descencendia si le implementamos un constructor
    /*
    El método set no se podría sobrescribir, ya que no es abstract, es decir,
    es propio de la clase Vehiculo, sin embar, el método getVelocidad si se
    podría modificar, ya que sí que es abstract.
    */
    
    /*
    Cuando la clase ya es final, la ultima de la rama de herencia, no va a 
    tener clases hijas.
    Se le pone final a la clase y sus atributos
    public final class Dado extends Azar{
    }
    
    */

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}
