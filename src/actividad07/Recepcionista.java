/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad07;

/**
 *
 * @author javier
 */
public class Recepcionista extends Trabajador{
    
    private String hotel;

    public Recepcionista(String hotel, String nombre, String apellido1, String NIF) {
        super(nombre, apellido1, NIF);
        this.hotel = hotel;
    }
    
    public Recepcionista(){
        this.hotel = "NH";
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Recepcionista{" + "hotel=" + hotel + '}';
    }

    @Override
    public void cotizar() {
        System.out.println("Cotiza como un recepcionista");
    }
    
    
    
}
