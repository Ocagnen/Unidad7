/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpractica72;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author javier
 */
public class Main {
    
    // Una lista de empresas
    // ordenar y hacer busquedas binarias por cada una d los distintos atrib
    // ordenando previamente según criterio
    // usaremos lambda o clases anónimas (preferiblemente lambda)
    
    public static void main(String[] args) {
        
        ArrayList<Empresa> listaE = new ArrayList<>();
        
        Empresa e1 = new Empresa(250, "Mercadona", "Supermercado", "M02563145");
        Empresa e2 = new Empresa(289, "Alcampo", "Supermercado", "L52369102");
        Empresa e3 = new Empresa(320, "Mercadona", "Supermercado", "S45169023");
        Empresa e4 = new Empresa(50, "Carrefour", "Supermercado", "E45875126");
        Empresa e5 = new Empresa(2500, "Fiat", "Coches", "R74012036");
        Empresa e6 = new Empresa(25, "Ford", "Coches", "P51203698");
        Empresa e7 = new Empresa(850, "Zara", "Ropa", "U02102365");
        Empresa e8 = new Empresa(1250, "Burger King", "Restaurante", "U02103658");
        Empresa e9 = new Empresa(30, "Mediamarkt", "Electrónica", "T54126541");
        
        listaE.add(e1);
        listaE.add(e2);
        listaE.add(e3);
        listaE.add(e4);
        listaE.add(e5);
        listaE.add(e6);
        listaE.add(e7);
        listaE.add(e8);
        listaE.add(e9);
        
        System.out.println("POR NUMERO");
        listaE.sort((Empresa o1, Empresa o2) -> (o1.getNumeroTrab()-o2.getNumeroTrab()));
        listaE.forEach(System.out::println);
        int i1 = Collections.binarySearch(listaE, e4, (Empresa o1, Empresa o2) -> (o1.getNumeroTrab()-o2.getNumeroTrab()));
        System.out.println(i1);
        
        System.out.println("POR NOMBRE");
        listaE.sort((Empresa o1, Empresa o2) -> (o1.getNombre().compareTo(o2.getNombre())));
        listaE.forEach(System.out::println);
        int i2 = Collections.binarySearch(listaE, e4, (Empresa o1, Empresa o2) -> (o1.getNombre().compareTo(o2.getNombre())));
        System.out.println(i2);
        
        System.out.println("POR TIPO");
        listaE.sort((Empresa o1, Empresa o2) -> (o1.getTipo().compareTo(o2.getTipo())));
        listaE.forEach(System.out::println);
        int i3 = Collections.binarySearch(listaE, e4, (Empresa o1, Empresa o2) -> (o1.getTipo().compareTo(o2.getTipo())));
        System.out.println(i3);
        
        System.out.println("POR CIF");
        listaE.sort((Empresa o1, Empresa o2) -> (o1.getCif().compareTo(o2.getCif())));
        listaE.forEach(System.out::println);
        int i4 = Collections.binarySearch(listaE, e4, (Empresa o1, Empresa o2) -> (o1.getCif().compareTo(o2.getCif())));
        System.out.println(i4);
        
        
        

        
        
        
    }
    
}
