/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab6aggregation.model;

/**
 *
 * @author David Lopez
 */
public class B {
    /*private int b;
    private int c;*/
    String data;

    public B(int i) {
        data=new String(""); 
        data= "object B #"+i;
    }
    
    @Override
    public String toString(){
        return data;
    } 
}
