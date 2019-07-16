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
public abstract class Mammal extends Animal {
    
    private int furThickness;

    
    public Mammal(int furThickness, int numberOfLegs, String name) {
        
        super(numberOfLegs, name);
        this.furThickness = furThickness;
        
    }

    @Override
    public void print(){
        
       super.print();
        System.out.println("printing from class--> " + Mammal.class + "<--");
        System.out.println("furThickness is -->" + furThickness );
        
    }
  

    public void stayWarm(){
        
        System.out.println("This mammal is staying warm");
        
    }
    
    
    
    /**
     * @return the furThickness
     */
    public int getFurThickness() {
        return furThickness;
    }

    /**
     * @param furThickness the furThickness to set
     */
    public void setFurThickness(int furThickness) {
        this.furThickness = furThickness;
    }
    
    
}
