/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern.facade;

import facadepattern.Propiedad;
import facadepattern.actores.Cliente;
import facadepattern.actores.Interesado;
import facadepattern.actores.Persona;
import facadepattern.actores.Propietario;

/**
 *
 * @author fabm_
 * @see Clase principal del facade
 */
public class Inmobiliaria {
    
    private Propiedad propiedad;
    
    public Inmobiliaria(Propiedad propiedad){
        this.propiedad = propiedad;
    }
    
    private void atenderInteresado(Interesado i){
        System.out.println("** Atendiendo a un interesado **");
        System.out.println("Disponemos de la siguiente propiedad si le interesa");
        System.out.println("Nombre: " + propiedad.getNombre());
        System.out.println("Tipo: " + propiedad.getTipo());
        System.out.println("Precio: " + propiedad.getPrecio());
    }
    
    private void atenderCliente(Cliente c){
        System.out.println("** Atendiendo a un cliente **");
        System.out.println("Le asignamos la propiedad siguiente a usted");
        System.out.println("Nombre: " + propiedad.getNombre());
        System.out.println("Tipo: " + propiedad.getTipo());
        this.propiedad.setCliente(c);
    }
    
    private void atenderPropietario(Propietario p){
        System.out.println("** Atendiendo a un propietario **");
        System.out.println("Su propiedad se encuentra");
        if(this.propiedad.getCliente() == null){
            System.out.println("Libre");
        }else{
            System.out.println("Alquilada por el cliente " + this.propiedad.getCliente().getNombre());
        }
    }
    
    public void atender(Persona p){
        if (p instanceof Interesado){
            //invoco atender interesado
            atenderInteresado((Interesado) p);
        }else if(p instanceof Cliente){
            //invoco atender cliente
            atenderCliente((Cliente) p);
        }else if(p instanceof Propietario){
            //invoco atender propietario
            atenderPropietario((Propietario) p);
        }
    }
    
    /**
     * @return the propiedad
     */
    public Propiedad getPropiedad() {
        return propiedad;
    }

    /**
     * @param propiedad the propiedad to set
     */
    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }
    
    
    
}
