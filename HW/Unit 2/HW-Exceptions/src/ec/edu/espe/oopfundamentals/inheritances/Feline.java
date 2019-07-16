/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.inheritances;

/**
 *
 * @author David Lopez
 */
public abstract class Feline extends Mammal {
    
    private boolean scary;

    public Feline(boolean scary, int furThickness, int numberOfLegs, String name) {
        super(furThickness, numberOfLegs, name);
        this.scary = scary;
    }
    
    /**
     * @return the scary
     */
    public boolean isScary() {
        return scary;
    }

    /**
     * @param scary the scary to set
     */
    public void setScary(boolean scary) {
        this.scary = scary; 
    }
    
    
}
