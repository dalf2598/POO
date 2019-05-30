/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productanddivision;

/**
 *
 * @author David Lopez
 */
public class ProductAndDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //division variables
        String dividen="5";
        String divisor="0";
        float quotient;
        
        //product variables
        String stringOriginalValue="5";
        String stringTimesToAdd="-100";
        int result=0;
        
        //Division code
        float tempDividen= Operations.validateDataDivision(dividen);
        float tempDivisor= Operations.validateDataDivision(divisor);
        
        quotient=Operations.division(tempDividen, tempDivisor);
        System.out.println(quotient);
        
        //Product code
        result= Operations.multiplication(stringOriginalValue,stringTimesToAdd);
        System.out.println(result);
        
    }
    
    
}
