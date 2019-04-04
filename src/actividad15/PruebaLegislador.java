/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad15;

import java.util.ArrayList;


/**
 *
 * @author javier
 */
public class PruebaLegislador {
    
    public static void main(String[] args) {
        
       ArrayList<Legislador> leg = new ArrayList<>();       
        
        
     
    
        
        for (Legislador legislador : leg) {
            System.out.println(legislador.getCamaraEnQueTrabaja());
        }
        
        System.out.println("");
        for (Legislador legislador : leg) {
            System.out.println(legislador);
        }

        
    }
    
}
