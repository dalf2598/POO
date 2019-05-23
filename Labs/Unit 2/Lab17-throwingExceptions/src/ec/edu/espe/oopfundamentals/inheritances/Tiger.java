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
public class Tiger extends Feline {

    public Tiger(boolean scary, int furThickness, int numberOfLegs, String name) {
        super(scary, furThickness, numberOfLegs, name);
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
