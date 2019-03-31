/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import facadepattern.Propiedad;
import facadepattern.actores.Cliente;
import facadepattern.actores.Interesado;
import facadepattern.actores.Propietario;
import facadepattern.facade.Inmobiliaria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabm_
 */
public class InmobiliariaTest {
    
    public InmobiliariaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test 
    public void testAtenderInteresado(){
        Interesado interesado = new Interesado(33724816, "Juancito");
        Propiedad propiedad = new Propiedad(1000, 
                                            "Chalet Perrando", 
                                            "Chalet", 
                                            2000000, 
                                            new Propietario(33724815, "Fabio"), 
                                            null);
        Inmobiliaria inmobiliaria = new Inmobiliaria(propiedad);
        inmobiliaria.atender(interesado);
        assertEquals(inmobiliaria, inmobiliaria);
    }
    
    @Test
    public void testAtenderPropietario(){
        Propietario propietario = new Propietario(21333999, "Emiliano");
        Propiedad propiedad = new Propiedad(1000, 
                                            "Chalet Perrando", 
                                            "Chalet", 
                                            2000000, 
                                            propietario, 
                                            null);
        Inmobiliaria inmobiliaria = new Inmobiliaria(propiedad);
        inmobiliaria.atender(propietario);
        assertEquals(inmobiliaria, inmobiliaria);
    }
    
    @Test
    public void testAtenderCliente(){
        Cliente cliente = new Cliente(39222999, "Pedro");
        Propiedad propiedad = new Propiedad(1000, 
                                            "Chalet Perrando", 
                                            "Chalet", 
                                            2000000, 
                                            new Propietario(33724815, "Fabio"), 
                                            null);
        Inmobiliaria inmobiliaria = new Inmobiliaria(propiedad);
        inmobiliaria.atender(cliente);
        assertEquals(inmobiliaria.getPropiedad().getCliente(), cliente);
    }
    
    
}
