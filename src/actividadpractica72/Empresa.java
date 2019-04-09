/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadpractica72;

/**
 *
 * @author javier
 */
public class Empresa {
    
    private int numeroTrab;
    private String nombre;
    private String tipo;
    private String cif;

    public Empresa(int numeroTrab, String nombre, String tipo, String cif) {
        this.numeroTrab = numeroTrab;
        this.nombre = nombre;
        this.tipo = tipo;
        this.cif = cif;
    }

    public int getNumeroTrab() {
        return numeroTrab;
    }

    public void setNumeroTrab(int numeroTrab) {
        this.numeroTrab = numeroTrab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String toString() {
        return "Empresa " + "numeroTrab=" + numeroTrab + ", nombre=" + nombre + ", tipo=" + tipo + ", cif=" + cif ;
    }
    
    
    
}
