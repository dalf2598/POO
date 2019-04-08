/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txtfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author David Lopez
 */
public class TxtFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File ("miarchivo.txt");
        
        String MessageFirstLine = "Esta frase tiene que escribir y despues leerse";
        String MessageSecondLine = "Hola men que tal";
        String ReadMessage = "";
        String ReadMessageNextLine = "";
        
           if (!file.exists())
            {
                try{
                file.createNewFile();
                System.out.println(file.getName()+" Ha sido creado");
                
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(MessageFirstLine);
                    pw.println(MessageSecondLine);
                    pw.close();
                }catch (IOException ex){} 
            }    
                 
            try{
                FileReader reader = new FileReader ("miarchivo.txt");
                BufferedReader br = new BufferedReader (reader);
                ReadMessage = br.readLine();
                ReadMessageNextLine = br.readLine();
                
            }catch (IOException ex){} 
  
           System.out.println (" La primera linea de texto es:" + ReadMessage);
           System.out.println (" La segunda linea de texto es:" + ReadMessageNextLine);
             
          //Comment out if want to display file info 
          /*
            System.out.println("Nombre: "+file.getName());
            System.out.println("Ruta: "+file.getAbsolutePath());
            System.out.println("Se puede leer: "+file.canRead());
            System.out.println("se puede escribir: "+file.canWrite());
            System.out.println("Se puede ejecutar: "+file.canExecute());
            System.out.println("Es un directorio: "+file.isDirectory());
            System.out.println("Tamaño: "+file.length());*/
    }
    
}
