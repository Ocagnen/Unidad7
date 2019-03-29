/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad15;

/**
 *
 * @author javier
 */
public abstract class Legislador extends Persona{
    
    private String provinciaQueRepresenta;
    private String partidoPolitico;

    public Legislador(String provinciaQueRepresenta, String partidoPolitico, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
    }

       
    public Legislador() {
        
        this.provinciaQueRepresenta = "Málaga";
        this.partidoPolitico = "X";
    }

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return "\nLegislador" + "\tprovinciaQueRepresenta=" + provinciaQueRepresenta + ", partidoPolitico=" + partidoPolitico;
    }
    
    public abstract String getCamaraEnQueTrabaja();
    
    
    
    
}
