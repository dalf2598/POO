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
public class Animal {
    
    public String eyes;
    
    public void eat() throws RuntimeException{
        System.out.println("The animal is eating and its eyes are"+ eyes.toString());
    }
    
    @Override
    public String toString(){
        return "I am an animal class";
    }
}
