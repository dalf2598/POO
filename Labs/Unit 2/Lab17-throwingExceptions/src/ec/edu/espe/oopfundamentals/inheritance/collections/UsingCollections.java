/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.inheritance.collections;

import ec.edu.espe.oopfundamentals.inheritances.Lion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author David Lopez 
 */
public class UsingCollections {
    public static void main(String[] args) {
        
        Lion lion = new Lion(true, true, 3, 4, "Alex");
        Collection things; 
        things = new ArrayList(); 
        System.out.println("the size of the array list is --> "+ things.size() );
        things.add(21);
        things.add("Andres");
        things.add(102.4f);
        things.add(lion);
        System.out.println("the size of the array list is --> "+ things.size() );
        System.out.println(things);
        
        Object[] thingArray = new Object[things.size()];
        thingArray=things.toArray();
        
        System.out.println("the third element of the array is " + thingArray[0]);
        things.remove(102.4f);
        System.out.println("the size of the array list is --> "+ things.size() );
        System.out.println(things);
        
        Collection<Lion> lions = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lions.add(new Lion(true, true, (i + 1), 4, "Alex" + (i + 1)));
        }

        lions.forEach((l) -> {
            System.out.println("Lion --> " + l);
        });
        
        
    }
}
