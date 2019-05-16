/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals.codeBlocks;

/**
 *
 * @author David Lopez
 */
public class OperationParent {
    
    public OperationParent(){
        System.out.println("Parent contructor excecuted");
        {
        System.out.println("Parent block executed");
        }
    }
    
    static {
        System.out.println("Static father block executed");
    }
}
