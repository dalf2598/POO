/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.codeblocks;

/**
 *
 * @author David Lopez 
 */
public class OperationParent {
    
    public OperationParent(){
        System.out.println("Constructor father executed");
    }
    {
     System.out.println("block father executed");
    }
     static{
         System.out.println("static block father executed");
     }
}
