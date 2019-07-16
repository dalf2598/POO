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
public class OracleConnection extends Connection{
    
    public OracleConnection(){   
    }
    
    public String description(){
    return "an Oracle database";
    }
}
