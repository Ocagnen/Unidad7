/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Javier
 */
public class PruebaLegislador {

    public static void main(String[] args) {

        ArrayList<Legislador> leg = new ArrayList<>();

        Legislador pp = new Diputado(22, "Malaga", "PP", "JAIME", "lopez");
        Legislador psoe = new Diputado(52, "Sevilla", "PSOE", "JAIME", "lopez");
        Legislador ciudadanos = new Diputado(12, "Sevilla", "Cds", "JAIME", "lopez");
        Legislador podemos = new Diputado(74, "Granada", "UP", "JAIME", "lopez");

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

        System.out.println("--------------------");
        System.out.println("Ordena por provincia");
        Collections.sort(leg, new CompararLegProv());
        //leg.sort((o1, o2) -> o1.getProvinciaQueRepresenta().compareTo(o2.getProvinciaQueRepresenta()));
        leg.forEach(System.out::println);

        System.out.println("--------------------");
        System.out.println("Ordena por partido");
        Collections.sort(leg, new CompararLegPartido());
        //leg.sort((o1, o2) -> o1.getPartidoPolitico().compareTo(o2.getPartidoPolitico()));
        leg.forEach(System.out::println);

        System.out.println("------------------------------");
        System.out.println("Ordena por ambos valores");        
        Collections.sort(leg, new CompararLegisladorTodo());
        leg.forEach(System.out::println);
        
        
        
        

    }

}
