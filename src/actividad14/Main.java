/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad14;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        Microondas m = new Microondas(200, 32.2, "LG");
        Frigorifico f = new Frigorifico(700.8, 500, "LG");
        
        m.muestra();
        f.muestra();
    }

}
