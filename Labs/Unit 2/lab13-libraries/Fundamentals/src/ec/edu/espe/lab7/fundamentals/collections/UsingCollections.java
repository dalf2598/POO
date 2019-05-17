/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals.collections;
import ec.edu.espe.lab7.fundamentals.inheritance.Lion;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Labs-DCCO
 */
public class UsingCollections {
     public  static  void  main ( String [] args ) {
         Lion lion = new Lion(true,true,4,4,"Alex");
         
         Collection things;
         things= new ArrayList();
         things.add(21);
         things.add("David");
         things.add(102.84f);
         things.add(lion);
         System.out.println("The size of the thing is --> "+ things.size());
         System.out.println(things);
         
         Object[] thingArray = new Object[things.size()];
         thingArray=things.toArray();
         
         System.out.println("the third element of the array is -->"+thingArray[2]);
         
         things.remove(102.84f);
         
         
         System.out.println("--------------------------------------");
         /*System.out.println("The size of the thing is --> "+ things.size());
         for(int i=0;i<things.size();i++){
             System.out.println("the "+i+" element of the array is -->"+thingArray[i]);
         }*/
         
         Collection lions = new ArrayList();
         for(int i=0; i<5;i++){
             lions.add(new Lion(true,true,i+1,4,"Alex"+i));
         }
         
         lions.forEach((l)->{
             System.out.println("Lions -->"+l); 
         });
         
         
         
     }
}
