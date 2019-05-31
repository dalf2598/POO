/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productanddivision;

import ecu.edu.espe.productanddivision.controller.Operations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David Lopez
 */
public class OperationsTest {
    
    public OperationsTest() {
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
     * Test of multiplication method, of class Operations.
     */
    @Test
    public void testWrongInput() {
        System.out.println("multiplication");
        String stringOriginalValue = "a";
        String stringTimesToAdd = "b";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testWrongInput2() {
        System.out.println("multiplication");
        String stringOriginalValue = "**/*8**8**";
        String stringTimesToAdd = "dsadlmsa;da@";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testLowPositiveTimesZero() {
        System.out.println("multiplication");
        String stringOriginalValue = "2";
        String stringTimesToAdd = "0";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testZeroTimesLowPostive() {
        System.out.println("multiplication");
        String stringOriginalValue = "0";
        String stringTimesToAdd = "2";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLowPositiveTimesLowPostive() {
        System.out.println("multiplication");
        String stringOriginalValue = "5";
        String stringTimesToAdd = "4";
        int expResult = 20;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLowNegativeTimesLoxPositive() {
        System.out.println("multiplication");
        String stringOriginalValue = "-5";
        String stringTimesToAdd = "3";
        int expResult = -15;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLowPositiveTimesLowNegative() {
        System.out.println("multiplication");
        String stringOriginalValue = "2";
        String stringTimesToAdd = "-3";
        int expResult = -6;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLowNegativeTimesLowNegative() {
        System.out.println("multiplication");
        String stringOriginalValue = "-5";
        String stringTimesToAdd = "-6";
        int expResult = 30;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testZeroTimesZero() {
        System.out.println("multiplication");
        String stringOriginalValue = "0";
        String stringTimesToAdd = "0";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBigPositiveTimesBigPositive() {
        System.out.println("multiplication");
        String stringOriginalValue = "800";
        String stringTimesToAdd = "500";
        int expResult = 400000;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void tesBigNegativeTimesBigPositive() {
        System.out.println("multiplication");
        String stringOriginalValue = "-500";
        String stringTimesToAdd = "-500";
        int expResult = 250000;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testZeroTimesNegative() {
        System.out.println("multiplication");
        String stringOriginalValue = "0";
        String stringTimesToAdd = "-100";
        int expResult = 0;
        int result = Operations.multiplication(stringOriginalValue, stringTimesToAdd);
        assertEquals(expResult, result);
    }
}
