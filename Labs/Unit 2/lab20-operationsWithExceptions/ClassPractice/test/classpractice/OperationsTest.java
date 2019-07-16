/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

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
    public void testLowPositiveTimesZero() {
        System.out.println("multiplication");
        int originalValue = 2;
        int timesToAdd = 0;
        int expResult = 0;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testZeroTimesLowPostive() {
        System.out.println("multiplication");
        int originalValue = 0;
        int timesToAdd = 2;
        int expResult = 0;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testLowPositiveTimesLowPostive() {
        System.out.println("multiplication");
        int originalValue = 2;
        int timesToAdd = 2;
        int expResult = 4;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
     
    @Test
    public void testLowNegativeTimesLoxPositive() {
        System.out.println("multiplication");
        int originalValue = -2;
        int timesToAdd = 3;
        int expResult = -6;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void testLowPositiveTimesLowNegative() {
        System.out.println("multiplication");
        int originalValue = 2;
        int timesToAdd = -3;
        int expResult = -6;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    
    @Test
    public void testLowNegativeTimesLowNegative() {
        System.out.println("multiplication");
        int originalValue = -5;
        int timesToAdd = -6;
        int expResult = 30;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    

    @Test
    public void testZeroTimesZero() {
        System.out.println("multiplication");
        int originalValue = 0;
        int timesToAdd = 0;
        int expResult = 0;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    
    
    @Test
    public void testBigPositiveTimesBigPositive() {
        System.out.println("multiplication");
        int originalValue = 800;
        int timesToAdd = 500;
        int expResult = 400000;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    
    @Test
    public void tesBigNegativeTimesBigNegative() {
        System.out.println("multiplication");
        int originalValue = -500;
        int timesToAdd = -500;
        int expResult = 250000;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void tesBigNegativeTimesBigPositive() {
        System.out.println("multiplication");
        int originalValue = -500;
        int timesToAdd = 600;
        int expResult = -300000;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void tesBigPositiveTimesLowNegative() {
        System.out.println("multiplication");
        int originalValue = 500;
        int timesToAdd = -1;
        int expResult = -500;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    
    @Test
    public void testZeroTimesNegative() {
        System.out.println("multiplication");
        int originalValue =  0;
        int timesToAdd = -1;
        int expResult = 0;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
    
    @Test
    public void WrongInput() {
        System.out.println("multiplication");
        int originalValue = '1';
        int timesToAdd = '3';
        int expResult = 3;
        int result = Operations.multiplication(originalValue, timesToAdd);
        assertEquals(expResult, result);
     
    }
     
}
