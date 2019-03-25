/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad08;

/**
 *
 * @author javier
 */
public abstract class Azar {
    
    protected int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    @Override
    public String toString() {
        return "Azar{" + "posibilidades=" + posibilidades + '}';
    }
    
       
    public abstract int lanzar();

    
}
