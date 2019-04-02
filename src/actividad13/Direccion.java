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
public class Direccion {
    
    private String nombreCalle;
    private String nombreCiudad;
    private int cp;
    private String pais;

    public Direccion(String nombreCalle, String nombreCiudad, int cp, String pais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.cp = cp;
        this.pais = pais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreCalle=" + nombreCalle + ", nombreCiudad=" + nombreCiudad + ", cp=" + cp + ", pais=" + pais + '}';
    }
    
    
        
    
}
