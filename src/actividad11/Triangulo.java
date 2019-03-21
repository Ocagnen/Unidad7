/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad11;

/**
 *
 * @author javier
 */
public class Triangulo extends Figura{

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    public Triangulo() {
    }
    
    @Override
    public int area(){
        return super.area()/2;
    }
    
}
