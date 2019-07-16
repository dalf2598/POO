/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals;

import ec.edu.espe.tax.Tax;

/**
 *
 * @author David Lopez
 */
public class fundamentals {
      public static void main( String[] args ){
        
     float money =10;
     float moneyTax=0;
     
     moneyTax= Tax.computeTotal(money);
          System.out.println(moneyTax);
     
//        Mammal mammal = new Mammal(2,4, "Firulais") {};
//        mammal.print();
        
   //     Animal animal = new Lion(true, true, 3, 4, "Alex");
   //   System.out.println(animal.getData());
   
  // WildAnimal wildanimal = new Horse(2);
  //    System.out.println(wildanimal.run());
   
   }
}
