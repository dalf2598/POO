/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.interfaces;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author David Lopez 
 */
public class WildAnimal implements Animal {
private int remainigAnimals;
    Random rd = new Random();

    public WildAnimal(int remainigAnimals) {
        this.remainigAnimals = remainigAnimals;
    }

    public boolean isInDangerOfStiction() {
        return (getRemainigAnimals() <= 10);
    }

    @Override
    public void run() {
        float speed;
        speed = rd.nextFloat() * 10;
        System.out.println("The animal is running at " + speed + "m/s");
    }

    @Override
    public void sound() {
        System.out.println("the animal is neighing");
    }

    /**
     *
     * @param sleepTime ins seconds between 1800 and 28800
     */
    @Override
    public void sleep(int sleepTime) {
        Calendar calendar = new GregorianCalendar();
        int second;
        int minute;
        int hour;
        second = calendar.get(Calendar.HOUR);
        minute = calendar.get(Calendar.MINUTE);
        hour = calendar.get(Calendar.SECOND);
        sleepTime = sleepTime + calculateSeconds(hour, minute, second);
        hour = sleepTime / 3600;
        minute = (sleepTime - (hour * 3600)) / 60;
        second = sleepTime - (hour * 3600) - (minute * 60);
        System.out.println("The animal wake up at: " + hour + ":" + minute + ":" + second);
    }

    private int calculateSeconds(int hour, int minute, int second) {
        int _second;
        second = (hour * 3600) + (minute * 60) + second;
        return second;
    }

    /**
     * @return the remainigAnimals
     */
    public int getRemainigAnimals() {
        return remainigAnimals;
    }

    /**
     * @param remainigAnimals the remainigAnimals to set
     */
    public void setRemainigAnimals(int remainigAnimals) {
        this.remainigAnimals = remainigAnimals;
    }
}
