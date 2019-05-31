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
public class ClassPractice {

  
    public static void main(String[] args) {
        
        float dividen = 5;
        float divisor = 0;
        
        int originalValue;
        int timestoAdd;
        int result;
          
        
        float quotient= Operations.division(dividen, divisor);
        System.out.println(quotient);
        
        originalValue=2;
        timestoAdd=2;
       
        result= Operations.multiplication(originalValue,timestoAdd);
        System.out.println(result);
        
    }
   
           
}
