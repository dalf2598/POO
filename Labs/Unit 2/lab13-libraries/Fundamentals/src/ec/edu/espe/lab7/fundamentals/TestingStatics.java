/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals;

import ec.edu.espe.lab7.fundamentals.utils.Tax;

/**
 *
 * @author David Lopez
 */
public class TestingStatics {
    
    public static void main(String[] args) {
     float price;
     float pvp;
     
     price=10;
     pvp= Tax.ComputeIva(price);    
        System.out.println(" The pvp of "+price+" is "+pvp);
     
     pvp= Tax.ComputeTotal(price);
        System.out.println(" The pvp of "+price+" is "+pvp);
    }
}
