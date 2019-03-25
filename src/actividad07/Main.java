/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad07;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList <Trabajador> lista = new ArrayList<>();
        Trabajador t1 = new Camarero();
        Trabajador t2 = new Camarero();
        Trabajador t3 = new Recepcionista();
        Trabajador t4 = new Recepcionista();
        
        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        lista.add(t4);
        
        for (Trabajador trabajador : lista) {
            
            trabajador.cotizar();
            
        }
       
        
        
    }
    
}
