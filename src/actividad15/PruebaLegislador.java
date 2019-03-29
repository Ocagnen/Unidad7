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
        
        Legislador pp = new Diputado(2, "Sevilla", "PP", "Jaime", "López");
        Legislador psoe = new Diputado(6, "Almería", "PSOE", "Ana", "Pinto");
        Legislador ciudadanos = new Senador(2500, "Málaga", "Ciudadanos", "Juan", "Ruiz");
        Legislador podemos = new Senador(2550, "Granada", "Podemos", "Laura", "Gómez");
        
        leg.add(pp);
        leg.add(psoe);
        leg.add(ciudadanos);
        leg.add(podemos);
        
        for (Legislador legislador : leg) {
            System.out.println(legislador.getCamaraEnQueTrabaja());
        }
        
        System.out.println("");
        for (Legislador legislador : leg) {
            System.out.println(legislador);
        }
        
    }
    
}
