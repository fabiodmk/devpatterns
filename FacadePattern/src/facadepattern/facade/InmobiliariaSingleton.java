/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern.facade;

import facadepattern.Propiedad;

/**
 *
 * @author fabm_
 */
public class InmobiliariaSingleton {
    
    private String nombreInmobiliaria;
    private static Inmobiliaria inmobiliaria;
    
    // El constructor es privado, no permite que se genere un constructor por defecto.
    private InmobiliariaSingleton(String nombreInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    public static Inmobiliaria getSingletonInstance(String nombreInmobiliaria, Propiedad propiedad) {
        if (getInmobiliaria() == null){
            setInmobiliaria(new Inmobiliaria(nombreInmobiliaria, propiedad));
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombreInmobiliaria + " porque ya existe un objeto de la clase Inmobiliaria");
        }
        
        return getInmobiliaria();
    }

    /**
     * @return the nombreInmobiliaria
     */
    public String getNombreInmobiliaria() {
        return nombreInmobiliaria;
    }

    /**
     * @param nombreInmobiliaria the nombreInmobiliaria to set
     */
    public void setNombreInmobiliaria(String nombreInmobiliaria) {
        this.nombreInmobiliaria = nombreInmobiliaria;
    }

    /**
     * @return the inmobiliaria
     */
    public static Inmobiliaria getInmobiliaria() {
        return inmobiliaria;
    }

    /**
     * @param aInmobiliaria the inmobiliaria to set
     */
    public static void setInmobiliaria(Inmobiliaria aInmobiliaria) {
        inmobiliaria = aInmobiliaria;
    }
    
    
    
}
