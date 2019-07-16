/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author David Lopez
 */
public class Validation {
    public static boolean nameValidation(String inputValue) 
    {

        if(inputValue.length()>=1)
        {
            //Pattern letter = Pattern.compile("[a-zA-z]");
            Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
           
               //Matcher hasLetter = letter.matcher(inputValue);
               Matcher hasDigit = digit.matcher(inputValue);
               Matcher hasSpecial = special.matcher(inputValue);

               //return hasLetter.find() && hasDigit.find() && hasSpecial.find();
               return hasDigit.find() || hasSpecial.find();
        }
        else
            return false;

    } 
    
    public static boolean validatePriceData(String inputValue) 
    {

        if(inputValue.length()>=1)
        {
            Pattern letter = Pattern.compile("[a-zA-z]");
            //Pattern digit = Pattern.compile("[0-9]");
            Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
           
               Matcher hasLetter = letter.matcher(inputValue);
               //Matcher hasDigit = digit.matcher(inputValue);
               Matcher hasSpecial = special.matcher(inputValue);

               //return hasLetter.find() && hasDigit.find() && hasSpecial.find();
               return hasLetter.find() || hasSpecial.find();
        }
        else
            return false;

    } 
    
    
    public static boolean validatePriceValue(String inputValue){
        
        float finalValue;
        boolean flag = false;
            
            try{
            finalValue= Float.parseFloat(inputValue);
                if ( finalValue>5000){
                 flag = true;
                }
               
            } catch(NumberFormatException ex){
                
                }     
        return flag;
    }
 
}
