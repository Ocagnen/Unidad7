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
public class ComparadorEspecialidad implements Comparator<Profesor> {

    @Override
    public int compare(Profesor o1, Profesor o2) {
        return o1.getEspecialidad().compareTo(o2.getEspecialidad());
    }

}
