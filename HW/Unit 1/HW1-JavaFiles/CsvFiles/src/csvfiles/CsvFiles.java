/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfiles;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Lopez
 */
public class CsvFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<UserData> users = new ArrayList<UserData>();
        
        users.add(new UserData("David L", "259876", "fleia@hotmail.com"));
        users.add(new UserData("Andres Z", "456213", "Waza@gmail.com"));
        users.add(new UserData("Kevin C", "763512", "Caicedo_1@gmail.com"));
        users.add(new UserData("Daniel A", "789450", "Aucas_dani@gmail.com"));
        
        //ExportarCSV(users);
        ImportarCSV();
    }
    public static void ExportarCSV(List<UserData> usuarios) {
        String salidaArchivo = "Usuarios.csv"; // Nombre del archivo
        boolean existe = new File(salidaArchivo).exists(); // Verifica si existe
        
        // Si existe un archivo llamado asi lo borra
        if(existe) {
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }
        
        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            // Datos para identificar las columnas
            salidaCSV.write("Nombre");
            salidaCSV.write("Telefono");
            salidaCSV.write("Email");
            
            salidaCSV.endRecord(); // Deja de escribir en el archivo
            
            // Recorremos la lista y lo insertamos en el archivo
            for(UserData user : usuarios) {
                salidaCSV.write(user.getName());
                salidaCSV.write(user.getPhone());
                salidaCSV.write(user.getEmail());
                
                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }
            
            salidaCSV.close(); // Cierra el archivo
            
        } catch(IOException e) {
        }    
    }
    
    public static void ImportarCSV() {
        try{
            List<UserData> usuarios = new ArrayList<UserData>(); // Lista donde guardaremos los datos del archivo
            
            CsvReader leerUsuarios = new CsvReader("Usuarios.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String nombre = leerUsuarios.get(0);
                String telefono = leerUsuarios.get(1);
                String email = leerUsuarios.get(2);
                
                usuarios.add(new UserData(nombre, telefono, email)); // Añade la informacion a la lista
            }
            
            leerUsuarios.close(); // Cierra el archivo
            
            // Recorremos la lista y la mostramos en la pantalla
            usuarios.forEach((user) -> {
                System.out.println(user.getName() + " , "
                        + user.getPhone() + " , "
                        +user.getEmail());
            });
            
        } catch(FileNotFoundException e) {
        } catch(IOException e) {
        }
    }
    
}
