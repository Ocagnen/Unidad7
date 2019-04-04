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
public class Microondas extends Electrodomestico implements Comparable<Microondas>{

    private int vatios;

    public Microondas(int vatios, double consumo, String modelo) {
        super(consumo, modelo);
        this.vatios = vatios;
    }

    public int getVatios() {
        return vatios;
    }

    public void setVatios(int vatios) {
        this.vatios = vatios;
    }

    @Override
    public String toString() {
        return super.toString()+"Microondas{" + "vatios=" + vatios + '}';
    }

    /*
    @Override
    public void muestra() {
        System.out.println("Los Vatios son " + this.vatios);
    }
    */

    @Override
    public int compareTo(Microondas o) {
        return this.getVatios()-o.getVatios();
    }
}
