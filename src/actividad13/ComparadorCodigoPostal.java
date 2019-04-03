/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.util.Comparator;

/**
 *
 * @author javier
 */
public class ComparadorCodigoPostal implements Comparator<Direccion> {

    @Override
    public int compare(Direccion o1, Direccion o2) {
        return (o1.getCp() - o2.getCp());
    }

}
