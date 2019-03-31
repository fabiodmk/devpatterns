/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern.actores;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author fabm_
 */
public class Cliente extends Persona{
    
    private Date fechaAlta;
    
    public Cliente(int dni, String nombre) {
        super(dni, nombre);
        this.fechaAlta = Calendar.getInstance().getTime();
    }

    /**
     * @return the fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
    
}
