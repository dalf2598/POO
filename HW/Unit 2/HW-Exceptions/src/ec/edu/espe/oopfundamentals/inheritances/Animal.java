/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.inheritances;

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
         * print class and object data
         */
        public void print(){
            
        System.out.println
        ("name of the class--> "
                +Animal.class + "\nAnimal name is--> " + name 
                + " has " + numberOfLegs + " legs");
        
    }
        /**
         * 
         * @param type non used theorical example
         * Only print the name of the anumal an name of legs
         */
        public void print(int type){
            
        System.out.println
        ("Animal name is--> " + name 
                + " has " + numberOfLegs + " legs");
        
    }
        /**
         * 
         * @param type 
         * print name and number of legs 
         */
        public void print(String type){
            
        System.out.println
        ( numberOfLegs + " legs"
                + ", " + "Animal name is--> " + "\t" + name  );
        
    }
        /**
         * 
         * @return objects data in Json format
         */
        public abstract String getData();
        
        
        @Override
        public String toString(){
            
        String data;
        data = "{\n\t\"name\": " + "\"" + name + "\"" + ",\n\t\"numberOfLegs\": " + numberOfLegs + "\n}";      
        return data;
        
        }
        
        /**
         * 
         * @param numberOfLegs value beetween 0 and 4 
         * @param name given name 
         */
        public Animal(int numberOfLegs, String name) {
            
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        
    }
        public Animal(){
            
        this.numberOfLegs=0;
        
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
