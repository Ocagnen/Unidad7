/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<>();

        Electrodomestico m = new Microondas(200, 32.2, "LG");
        Electrodomestico f = new Frigorifico(700.8, 500, "Turbo");
        Electrodomestico h = new Horno(22, "LG");

        lista.add(m);
        lista.add(f);
        lista.add(new Microondas(360, 25, "SOny"));

        lista.sort(new Comparator<Electrodomestico>() {
            @Override
            public int compare(Electrodomestico o1, Electrodomestico o2) {
                return o1.getModelo().compareTo(o2.getModelo());
            }

        });
        
        System.out.println("");
        lista.forEach(System.out::println);
        
        System.out.println("");

        for (Electrodomestico electrodomestico : lista) {
            if (electrodomestico instanceof MuestraInformacion) {
                ((MuestraInformacion) electrodomestico).muestra();
            }
        }

        ArrayList<Frigorifico> lista2 = new ArrayList<>();
        lista2.add(new Frigorifico(22, 32, "LG"));
        lista2.add(new Frigorifico(17, 62, "LG"));
        lista2.add(new Frigorifico(53, 19, "LG"));

        lista2.forEach(System.out::println);

        System.out.println("Ordenado");

        Collections.sort(lista2);
        lista2.forEach(System.out::println);

        System.out.println("");

        ArrayList<Microondas> lista3 = new ArrayList<>();
        lista3.add(new Microondas(22, 32, "LG"));
        lista3.add(new Microondas(17, 62, "LG"));
        lista3.add(new Microondas(53, 19, "LG"));

        lista3.forEach(System.out::println);

        System.out.println("Ordenado");

        Collections.sort(lista3);
        lista3.forEach(System.out::println);

    }

}
