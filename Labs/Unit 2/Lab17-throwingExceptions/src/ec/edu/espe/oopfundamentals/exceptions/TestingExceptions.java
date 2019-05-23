/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David Lopez
 */
public class TestingExceptions {
    
    public static void main(String[] args) {
        Animal animal = null;
       
        try{
        System.out.println("The animal eyes are: "+ animal.eyes);}
        catch(Exception ex){
            System.err.println("There are no animals on the system, talk with admin "
                    + "and tell him which functionality fail "+ex);
        }
        System.out.println("The first try-catch passed");
        
        Animal animal2= new Animal();
        animal2.eyes = null;
        
        try{
          animal2.eat();
        }
        catch(RuntimeException ex){
            System.out.println("This is the stacktrace");
            ex.printStackTrace();
            System.out.println("The Logger");
            Logger.getLogger(TestingExceptions.class.getName()).log(Level.SEVERE, null, ex+"David");
            //System.out.println(getClass().getClassLoader().getResource("loggin.properties"));
            
            System.out.println(TestingExceptions.class.getClassLoader().getResource("loggin.properties"));
        }
        System.out.println("The second try passed");
    }
}
