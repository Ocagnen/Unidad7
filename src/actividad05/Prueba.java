/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad05;

/**
 *
 * @author javier
 */
public class Prueba {
    public static void main(String[] args) {
        
        Cliente clienteA = new Cliente();
        Cliente clienteB = new Cliente("Javier","08955463A",35);
        Cliente clienteC = new Cliente("Javier","08955463A",35);
        Cliente clienteD = new Cliente("Javier","08955463A",35);
        Cliente clienteE = new Cliente("Ana","35211458d",19);
        
        System.out.println(clienteA.hashCode());
        System.out.println(clienteB.hashCode());
        System.out.println(clienteC.hashCode());
        System.out.println(clienteD.hashCode());
        System.out.println(clienteE.hashCode());
        System.out.println("");
        
        // Reflexiva
        System.out.println("Reflexiva");
        System.out.println(clienteB.equals(clienteB));        
        System.out.println("");
        
        // Simétrica
        System.out.println("Simétrica");
        System.out.println(clienteB.equals(clienteC));
        System.out.println(clienteC.equals(clienteB));
        System.out.println("");
        
        // Transitiva
        System.out.println("Transitiva");
        System.out.println(clienteB.equals(clienteC));
        System.out.println(clienteC.equals(clienteD));
        System.out.println(clienteB.equals(clienteD));
        System.out.println("");
        
        //Nula
        System.out.println("Nula");
        System.out.println(clienteB.equals(null));
        System.out.println("");
    }
    
    
}
