/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

import java.util.Scanner;

/**
 *
 * @author David Lopez
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee though filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding suger and milk");
    }
    
    public boolean wantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y"))
        return true;
        else
        return false;
    }
    
    private String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        String answer= null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)");
        answer= scanner.nextLine();
        return answer;
    }   
}
