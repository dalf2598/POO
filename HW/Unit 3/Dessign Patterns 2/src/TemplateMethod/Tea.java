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
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
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
        System.out.println("Would you like lemon with your tea (y/n)");
        answer= scanner.nextLine();
        return answer;
    }   
    
}
