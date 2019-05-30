/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpractice;

/**
 *
 * @author David Lopez
 */
public class Operations {
    
    public static float division(float dividen, float divisor){
        float quotient;
        
        quotient= dividen/divisor;
        
        return quotient;
    }
    
    public static int multiplication(int  originalValue, int timesToAdd){
        
        int result = 0;
        int tempOriginalValue;
        
        
        if(timesToAdd==0)
            result=0;
        
        else if(originalValue==0)
            result=0;
        
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
        
        else if(timesToAdd<0&&originalValue<0){
            
            originalValue=originalValue*-1;
            timesToAdd= timesToAdd*-1;
            tempOriginalValue= originalValue;
            
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }
           result= originalValue;
        }
           
        else if(timesToAdd>0&&originalValue>0){
           
           tempOriginalValue= originalValue;
         
           for(int i=1; i<timesToAdd; i++){
           originalValue= originalValue+ tempOriginalValue; 
           }
           result= originalValue;
            
        }
        
        else if(timesToAdd==0&&originalValue==0){
            result =0;
        }
            
        return result;
        
    }
   
}
