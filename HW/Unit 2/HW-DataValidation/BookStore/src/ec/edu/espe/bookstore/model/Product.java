/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author David Lopez
 */
public class Product {
    public String name;
    public String type;
    public String price;

    public Product(String name, String type, String price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public Product(){
        
    }

}
