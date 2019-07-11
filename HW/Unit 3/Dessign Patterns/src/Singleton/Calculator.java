/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author David Lopez
 */
public class Calculator {

    public static void main(String[] args) {
    //USTax tax1= new USTax(); cannot instantiate objects of this type
    USTax tax= USTax.getInstance();
    System.out.println(tax.salesTotal());
    }
    
}

class USTax{
    private static USTax instance;

    private USTax(){};
    
    public static USTax getInstance(){
        if(instance==null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(){
        return 15;
    }
  
}