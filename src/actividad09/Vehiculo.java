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

    private int bastidor;

    public final void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    public abstract int getVelocidad();
}
