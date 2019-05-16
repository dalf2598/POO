/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals.utils;

/**
 *
 * @author David Lopez
 */
public class Tax {
    
    public static float ComputeIva(float  base){
        
        float iva;
        iva=base*0.12f;
        return iva;
    }
    
     public static float ComputeTotal(float base){
        
        float total;
        total= base+ ComputeIva(base);
        return total;
    }
     
}
