/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author David Lopez
 */
public abstract class CaffeineBeverage {
    
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        } 
    }
    
    void boilWater(){
        System.out.println("Boiling Water");
    }
    abstract void brew();
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    abstract void addCondiments();
    boolean wantsCondiments(){
        return true;}
}
