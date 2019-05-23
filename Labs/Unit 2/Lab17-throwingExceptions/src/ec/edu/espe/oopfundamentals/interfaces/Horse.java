/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.interfaces;

import java.util.Random;

/**
 *
 * @author David Lopez
 */
public class Horse extends WildAnimal implements Pet,Animal {

        public Horse(int remainigAnimals) {
        super(remainigAnimals);
    }
    
    @Override
    public boolean walk(int timeInSeconds, int distance) {
        Random rd = new Random();
        float speed;
        speed = distance/timeInSeconds;                
        return speed>= rd.nextFloat()*3;
    }    
    }



