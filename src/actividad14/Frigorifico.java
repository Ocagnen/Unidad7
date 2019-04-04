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
public class Frigorifico extends Electrodomestico implements Comparable<Frigorifico>{

    private double capacidadL;

    public Frigorifico(double capacidadL, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadL = capacidadL;
    }

    public double getCapacidadL() {
        return capacidadL;
    }

    public void setCapacidadL(double capacidadL) {
        this.capacidadL = capacidadL;
    }

    @Override
    public String toString() {
        return super.toString()+"Frigorifico{" + "capacidadL=" + capacidadL + '}';
    }

    /*
    @Override
    public void muestra() {
        System.out.println("La capacidad es " + this.capacidadL + " litros");
    }
    */

    @Override
    public int compareTo(Frigorifico o) {
        return (int) (this.getCapacidadL()-o.getCapacidadL());
    }
}
