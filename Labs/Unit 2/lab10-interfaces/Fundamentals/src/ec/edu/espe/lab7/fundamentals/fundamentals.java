/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals;
import ec.edu.espe.lab7.fundamentals.inheritance.Animal;
import ec.edu.espe.lab7.fundamentals.inheritance.Mammal;
import ec.edu.espe.lab7.fundamentals.inheritance.Lion;
/**
 *
 * @author David Lopez
 */
public class fundamentals {
    public  static  void  main ( String [] args ) {
        
        /*Animal animal = new Mammal(2,5,"Lucy");
        System.out.println(animal);
        animal.print() 
        
        Mammal mammal = new Mammal(2,4,"Firulais");
        mammal.print();*/
        
        Animal animal = new Lion(true,true,3,4,"Alex");
        System.out.println(animal.getData());
    }
}
