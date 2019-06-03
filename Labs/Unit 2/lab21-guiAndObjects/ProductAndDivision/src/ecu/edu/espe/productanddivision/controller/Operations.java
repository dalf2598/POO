/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecu.edu.espe.productanddivision.controller;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Operations {
    
    public static float validateDataDivision(String inputValue){
        
        float finalValue=0;
        Scanner scanner= new Scanner(System.in);  
        
        int i=0;
        while( i!=1){
            try{
            finalValue= Float.parseFloat(inputValue);
            i=1;
            } catch(NumberFormatException ex){
                System.out.println("Ingrese un dato válido: ");
                inputValue = scanner.nextLine();
            }
        }
        return finalValue;
    }
    
     public static int validateDataMultiply(String inputValue){
        
        int finalValue=0;
        Scanner scanner= new Scanner(System.in);  
        
            try{
            finalValue= Integer.parseInt(inputValue);   
            } catch(NumberFormatException ex){
                finalValue=0;
            }
        
        return finalValue;
    }
    
    public static float division(float dividen, float divisor){
        float quotient;
        
        quotient= dividen/divisor;
        
        return quotient;
    }
    
    
     public static int multiply(String stringOriginalValue, String stringTimesToAdd){
        
        int originalValue= Operations.validateDataMultiply(stringOriginalValue);
        int timesToAdd= Operations.validateDataMultiply(stringTimesToAdd);
               
        int result = 0;
        int tempOriginalValue;
        
        //Zero cases
        if(timesToAdd==0)
            result=0;
        
        else if(originalValue==0)
            result=0;
        
        else if(timesToAdd==0&&originalValue==0)
            result =0;
        
        //One positive, one negative cases
        else if(timesToAdd<0&&originalValue>0){       
           timesToAdd= timesToAdd*-1;
           tempOriginalValue= originalValue;
           
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }

           result= originalValue*-1;
        }
        
        else if(timesToAdd>0&&originalValue<0){
            
            originalValue=originalValue*-1;
            tempOriginalValue= originalValue;
            
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }
           result= originalValue*-1;
        }
        
        //Two negatives
        else if(timesToAdd<0&&originalValue<0){
            
            originalValue=originalValue*-1;
            timesToAdd= timesToAdd*-1;
            tempOriginalValue= originalValue;
            
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }
           result= originalValue;
        }
           
        //Two Positives
        else if(timesToAdd>0&&originalValue>0){
           
           tempOriginalValue= originalValue;
         
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }
           result= originalValue;  
        }
        return result;
    }
     
}
