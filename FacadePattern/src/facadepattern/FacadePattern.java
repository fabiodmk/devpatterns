/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

import facadepattern.actores.Cliente;
import facadepattern.actores.Interesado;
import facadepattern.actores.Propietario;
import facadepattern.facade.Inmobiliaria;

/**
 *
 * @author fabm_
 */
public class FacadePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Main del ejemplo del patron Facade
        System.out.println("Desarrollando el ejemplo del patrón Facade para los alumnos");
        //TODO: instanciar el ejemplo aqui
        System.out.println("Se finaliza el desarrollo del ejemplo del patron Facade");
        
        Interesado interesado = new Interesado(33724815, "Fabio");
        Cliente cliente = new Cliente(39222999, "Pedro");
        Propietario propietario = new Propietario(21333999, "Emiliano");
        
        Propiedad propiedad = new Propiedad(1002, 
                                            "Casa residencial", 
                                            "Casa", 
                                            12003333, 
                                            propietario, 
                                            null);
        
        Inmobiliaria inmobiliaria = new Inmobiliaria(propiedad);
        //Atiendo a un interesado
        System.out.println("*****************************************");
        inmobiliaria.atender(interesado);
        System.out.println("*****************************************");
        inmobiliaria.atender(propietario);
        System.out.println("*****************************************");    
        inmobiliaria.atender(cliente);
        System.out.println("*****************************************");
        inmobiliaria.atender(propietario);
        System.out.println("Se desarrollo el ejemplo");
    }
    
}
