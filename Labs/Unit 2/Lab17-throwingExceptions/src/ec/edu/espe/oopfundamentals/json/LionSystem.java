/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.oopfundamentals.json;

import com.google.gson.Gson;
import ec.edu.espe.oopfundamentals.inheritances.Lion;

/**
 *
 * @author David Lopez 
 */
public class LionSystem {
    
    public static void main(String[] args) {
        Lion lion = new Lion(true, true, 3, 4,"Lion-o");
        Gson gson = new Gson();
        String json = new String();
        
        json= gson.toJson(lion);
        
        System.out.println(json);
        
        json="{\"mane\":true,\"scary\":true,\"furThickness\":3,\"numberOfLegs\":4,\"name\":\"Lippy\"}";
        
        Lion lion2;
        
        lion2 = gson.fromJson(json, Lion.class);
        System.out.println(lion2);
    }
}
