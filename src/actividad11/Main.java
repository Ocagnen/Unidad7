/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 12)); 
        figuras.add(new Triangulo(10, 5)); 
        figuras.add(new Romboide(15, 5)); 
        for (Figura f : figuras) {
            
            if(f instanceof Rectangulo){
                System.out.println("Área del Rectángulo = " + f.area() +" cm2");
            } else if(f instanceof Triangulo){
                System.out.println("Área del Triángulo = " + f.area() +" cm2");
            } else {
                System.out.println("Área del Romboide = " + f.area() + " cm2");
            }
            
        }

    }

}
