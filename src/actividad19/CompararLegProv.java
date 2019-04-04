/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad19;

import java.util.Comparator;

/**
 *
 * @author Javier
 */
public class CompararLegProv implements Comparator<Legislador>{

    @Override
    public int compare(Legislador o1, Legislador o2) {
        
        return o1.getProvinciaQueRepresenta().compareTo(o2.getProvinciaQueRepresenta());
    }
    
}
