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
public class BeverageTest {
    public static void main(String[] args) throws InterruptedException {
        
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        
        System.out.println("Making tea...");
        tea.prepareRecipe();
        Thread.sleep(1000);
        System.out.println("Your tea is ready!!");
        Thread.sleep(1000);
        
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
        Thread.sleep(1000);
        System.out.println("Your coffee is ready!!");
        Thread.sleep(1000);
    }
}
