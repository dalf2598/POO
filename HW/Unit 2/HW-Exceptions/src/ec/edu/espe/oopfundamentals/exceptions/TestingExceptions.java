/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.exceptions;

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
    }
}
