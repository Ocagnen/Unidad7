/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad16;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author javier
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Robot> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            lista.add(new Robot());
        }

        lista.sort((o1, o2) -> (o1.getVida() - o2.getVida()));

        for (Robot robot : lista) {
            System.out.println(robot);
        }

        System.out.println("");
        int contador = 0;

        for (Robot robot : lista) {
            if (robot.getVida() > 50) {
                contador++;
            }
        }

        System.out.println("Total de robots con más de 50 de vida: " + contador);

        System.out.println(lista.get(lista.size() - 1).getNumSerie());
        System.out.println(lista.get(lista.size() - 2).getNumSerie());
        System.out.println(lista.get(lista.size() - 3).getNumSerie());

        lista.sort((o1, o2) -> (o1.getNumSerie() - o2.getNumSerie()));

        System.out.println("");
        for (Robot robot : lista) {
            System.out.println(robot);
        }

        Robot r1 = new Robot();
        lista.add(r1);
        
        

    }

}
