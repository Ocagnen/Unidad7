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
public class Figura {
    
    private int base;
    private int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int area(){ 
        
       return this.base*this.altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.base;
        hash = 37 * hash + this.altura;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (this.base != other.base) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        return true;
    }
    
    
    
}
