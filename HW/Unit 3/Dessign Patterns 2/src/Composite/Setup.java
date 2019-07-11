/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author David Lopez
 */
public class Setup {
    
      public static void main(String[] args) {
          
          //Ables org
          Teller lonny = new Teller ("Lonny");
          Clerk cal = new Clerk("Cal");
          Manager able = new Manager ("Able");
          able.add(lonny);
          able.add(cal);
          
          //Beckys org
          Teller juanita = new Teller("Juanita");
          Teller tina = new Teller("Tina");
          Teller thelma = new Teller("Thelma");
          Manager becky = new Manager("Becky");
          becky.add(juanita);
          becky.add(tina);
          becky.add(thelma);
          
          //create president
          President pete= President.getPresident("Pete");
          pete.add(able);
          pete.add(becky);
          
          //initial client
          Client.employee=pete;
          Client.doClientTasks();
      }
    
}
