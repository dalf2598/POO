/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals.inheritance;

/**
 *
 * @author David Lopez
 * @version 0.1.0
 * @since 2019-05-08
 * @see Mammal and Feline
 */
public abstract class Animal {
    private int numberOfLegs;
    private String name;
    
    /**
     * 
     * @param numberOfLegs Value can go from 0 to 4.
     * @param name Given name
     */
     public Animal(int numberOfLegs, String name) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }
    
    public Animal(){
        this.numberOfLegs=0;
    }
    
  /**
   * Print Class Name and object's data
   */
    public void print(){
        System.out.println
        ("Name of the class --> "+Animal.class+
                "\nThe animal name is -->"
                +name+" has "+numberOfLegs+" legs.");
    }
     
    /**
     * 
     * @param type Academic example of variable overload
     * Print only object's data 
     */
    public void print(int type){
        System.out.println
        ("\nThe animal name is -->"+name+" has "+numberOfLegs+" legs.");
    }
    
    /**
     * 
     * @param type Academic example of variable overload
     * Print only object's values
     */
    
    public void print(String type){
        System.out.println
        (name+", \t"+numberOfLegs);
    }
    
    /**
     * 
     * @return  Object's data on Jason format  
     */
    public abstract String getData();
    
    @Override
    public String toString(){
        String data;
            data= "{\n\t\"name\": \""+name+"\", \n\t\"numberOfLegs\": "+numberOfLegs+"\n}";
        return data;
    }
    
    /**
     * @return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
