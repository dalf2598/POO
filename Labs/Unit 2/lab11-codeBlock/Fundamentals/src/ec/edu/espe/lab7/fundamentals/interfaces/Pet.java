/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab7.fundamentals.interfaces;

/**
 *
 * @author David Lopez
 */
public interface Pet {
   
    /**
     * This method will determine the average speed that the pet reach during 
     * daily walks 
     * @param timeInSeconds time that the pet has to walk daily 
     * @param distance distance that the pet walked in meters
     * @return  true if the pet has walked at the speed of 5 km/h
     */
   public boolean walk(int timeInSeconds, int distance);
   
   
}
