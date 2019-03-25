/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

import java.util.Random;

/**
 *
 * @author javier
 */
public class Moneda extends Azar{

    public Moneda(int posibilidades) {
        super(posibilidades);
    }
    
    public Moneda(){
        super(2);
    }

    @Override
    public int lanzar() {
        Random alt = new Random();
        
        return alt.nextInt(2)+1;
    }
    
    
}
