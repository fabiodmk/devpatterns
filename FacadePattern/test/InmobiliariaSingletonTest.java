/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import facadepattern.Propiedad;
import facadepattern.actores.Propietario;
import facadepattern.facade.Inmobiliaria;
import facadepattern.facade.InmobiliariaSingleton;
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
public class InmobiliariaSingletonTest {
    
    public InmobiliariaSingletonTest() {
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
    public void testInmobiliariaSingleton(){
        
        Inmobiliaria inmobiliaria = 
                InmobiliariaSingleton.getSingletonInstance("Inmobiliaria UCP", new Propiedad(1002, 
                                                                                             "Dreams Enjoy", 
                                                                                             "Hotel Boutique", 
                                                                                             5000000, 
                                                                                             new Propietario(38990777, "Matias"), 
                                                                                             null));
        Inmobiliaria inmobiliariaCopia = InmobiliariaSingleton.getSingletonInstance("Inmobiliaria UCP 2", new Propiedad(1002, 
                                                                                             "Dreams Enjoy", 
                                                                                             "Hotel Boutique", 
                                                                                             5000000, 
                                                                                             new Propietario(38990777, "Matias"), 
                                                                                             null));
        assertEquals(inmobiliaria, inmobiliariaCopia);
    }
}
