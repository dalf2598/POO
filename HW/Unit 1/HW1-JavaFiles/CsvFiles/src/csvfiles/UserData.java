/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfiles;

/**
 *
 * @author alejo
 */
public class UserData {
    
     private String name;
    private String phone;
    private String email;

    public UserData (String nombre, String telefono, String email) {
        this.name = nombre;
        this.phone = telefono;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telefono) {
        this.phone = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;   
    }
   
}
