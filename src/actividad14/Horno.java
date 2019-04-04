/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad14;

/**
 *
 * @author javier
 */
public class Horno extends Electrodomestico implements MuestraInformacion {

    public Horno(double consumo, String modelo) {
        super(consumo, modelo);
    }
    
    
    @Override
    public void muestra() {
        System.out.println("Soy un horno");
    }
    
    
    
    
}
