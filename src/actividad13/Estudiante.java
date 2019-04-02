/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

/**
 *
 * @author Javier
 */
public class Estudiante extends Persona {

    private String IDEstudiante;

    public Estudiante(String IDEstudiante, String nombre, String apellidos, String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.IDEstudiante = IDEstudiante;
    }

    public String getIDEstudiante() {
        return IDEstudiante;
    }

    public void setIDEstudiante(String IDEstudiante) {
        this.IDEstudiante = IDEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "IDEstudiante=" + IDEstudiante + '}';
    }

    @Override
    public void identificate() {
        System.out.println("Soy un alumno");
    }

}
