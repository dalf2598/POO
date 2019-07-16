/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.interfaces;

/**
 *
 * @author David Lopez
 */

public interface Pet {
    
    /**
     * this method have a boolean that comes true when the pet walked at the speed of 5 Km/h
     * @param timeInSeconds the time that pet has to walk daily
     * @param distance the distance that pet walk in meters 
     * @return a boolean when the pet walks at the speed of 5 Km per hour
     */
    public boolean walk(int timeInSeconds, int distance);
    
}