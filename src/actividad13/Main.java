/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        Persona p1 = new Estudiante("001", "Javier", "OI", "9097932j", new Direccion("C ronda", "Estepona", 6, "España"));
        Persona p2 = new Estudiante("002", "Javier", "OI", "9097932j", new Direccion("C ronda", "Estepona", 6, "España"));
        Persona p3 = new Profesor("Matematicas", "Javier", "OI", "9097932j", new Direccion("C ronda", "Estepona", 6, "España"));
        Persona p4 = new Profesor("Ingles", "Javier", "OI", "9097932j", new Direccion("C ronda", "Estepona", 6, "España"));

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        for (Persona persona : lista) {
            System.out.println(persona);
            persona.identificate();
        }
        
        for (Persona persona : lista) {
            if(persona instanceof Estudiante){
                System.out.println("ESTUDIANTE");
                System.out.println(((Estudiante) persona).getIDEstudiante());
            } else {
                System.out.println("PROFESOR");
                System.out.println(((Profesor)persona).getEspecialidad());
            }
        }

    }

}
