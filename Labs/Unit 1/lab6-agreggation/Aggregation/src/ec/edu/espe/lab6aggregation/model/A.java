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
public class A {
    int i;
    private B b= new B(i);
    private C c;
    private D d;
    
    public B m(){
        return b;
    }

}
