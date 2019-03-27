/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

/**
 *
 * @author javier
 */
public class Main {

    public static void main(String[] args) {

        Azar dado1 = new Dado();
        Azar moneda1 = new Moneda();

        System.out.println(dado1.lanzar());
        System.out.println(moneda1.lanzar());
        
        /*
        Azar algo;
        algo = new Moneda();
                System.out.println(algo.lanzar());
        algo = new Dado();
                System.out.println(algo.lanzar());        
        */

    }

}
