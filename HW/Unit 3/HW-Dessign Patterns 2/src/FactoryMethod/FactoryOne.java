/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author David Lopez
 */
public class FactoryOne extends Factory {

    @Override
    protected Connection createConnection(String Type) {
        if (Type.equals("Oracle"))
            return new OracleConnection();
        else
        return new MySqlConnection();
           
    }

}
