/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camilo
 */
public class TrianguloFactoryTest {
    
    public TrianguloFactoryTest() {
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

    /**
     * Test of createTriangulo method, of class TrianguloFactory.
     */
    @Test
    public void testCreateTriangulo() {
        System.out.println("createTriangulo");
        int ladoA = 10;
        int ladoB = 10;
        int ladoC = 10;
        TrianguloFactory instance = new TrianguloFactory();
        String expResult = "Equilatero";
        String result = instance.createTriangulo(ladoA, ladoB, ladoC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    @Test
    public void testCreateTriangulo2() {
        System.out.println("createTriangulo");
        int ladoA = 10;
        int ladoB = 11;
        int ladoC = 12;
        TrianguloFactory instance = new TrianguloFactory();
        String expResult = "Escaleno";
        String result = instance.createTriangulo(ladoA, ladoB, ladoC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    @Test
    public void testCreateTriangulo3() {
        System.out.println("createTriangulo");
        int ladoA = 10;
        int ladoB = 10;
        int ladoC = 12;
        TrianguloFactory instance = new TrianguloFactory();
        String expResult = "Isosceles";
        String result = instance.createTriangulo(ladoA, ladoB, ladoC);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    
}
