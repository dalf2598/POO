/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author David Lopez
 */
public class Client {
    
    public static void main(String[] args) {
    Factory factory = new FactoryOne();
    
    Connection connection = factory.createConnection("Oracle");
    System.out.println("You are connecting with "+connection.description());
    }
}


