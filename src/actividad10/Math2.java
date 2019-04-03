/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;

import java.util.Arrays;

/**
 *
 * @author Javier
 */
public final class Math2 {
    
    public static double obtenerMax(double[] a){
        
        Arrays.sort(a);
                
        return a[a.length-1];
        
    }
    
    public static double obtenerMin(double[] a){
        
        /*
        int min = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if(x[i] > min){
            min = a[i];
            }
        }
        
        */
        
        Arrays.sort(a);
        
        return a[0];
    }
    
    public static double sumatorio(double[] a){
        
        double suma = 0;
        
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        
        return suma;
    }
    
    
    public static double media(double[] a){
        
        double suma = 0;
        
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        
        return suma/a.length;
    } 
    
}
