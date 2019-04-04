/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad16;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author javier
 */
public class Robot {
    
    private int numSerie;
    private int vida;
    
    private static int contador = 0;

    public Robot() {
        Random alt = new Random();        
        this.numSerie = contador;        
        this.vida = alt.nextInt(100)+1;
        contador++;
    }

    public  int getNumSerie() {
        return numSerie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        
        if(vida>100 || vida < 1){
            vida = 100;
        }
        
        this.vida = vida;
    }
    
    public static Robot devolverRobot(ArrayList<Robot> lista, int numSerie){        
        
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getNumSerie() == numSerie){
                return lista.get(i);
            }
        }
        
        return new Robot();
        
    }

    @Override
    public String toString() {
        return "Robot{" + "numSerie=" + numSerie + ", vida=" + vida + '}';
    }
    
    
    
    
    
}
