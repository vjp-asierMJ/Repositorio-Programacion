/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bistema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class Ejercicio12BisTema12 {

    public final static String MASNUMEROS = "masnumeros.txt";

    public static void main(String[] args) {
        // TODO code application logic here
        
        try { //excepciones
            sumarNumeros(); //llamamos al metodo
        }
        
        catch(FileNotFoundException e) {
        
            System.out.println("Error: Fichero no encontrado");
        }
        
        catch(IOException e) {
        
             System.out.println("Error: Error en la entrada y/o salida de datos");
        }
        
        catch(Exception e) {
        
            System.out.println("Error: Error desconocido");
        }
    }
    
    //metodo para sumar los numeros del fichero
    public static void sumarNumeros() throws IOException, FileNotFoundException {
    
        String linea;
        float total = 0;
        
        try( //creamos los readers
            
                FileReader fr = new FileReader(MASNUMEROS);
                BufferedReader br = new BufferedReader(fr);
            )
        {
        
            linea = br.readLine(); //leemos la linea
            
            while(linea != null) {//mientras que no este vacia
                
                System.out.println(linea); //mostramos los numeros que tenemos
            
                String[] numeros = linea.split(";");//guardamos los numeros separados por las comas
                
                
                for(String num : numeros) { //recoreremos los numeros
                
                    total+=Float.parseFloat(num); //los sumamos al total
                }
                
                
                
                linea = br.readLine(); //leemos la siguiente linea
            }
            
            System.out.println("La suma total es de: "+total); //mostramos la suma total
        }
    }
    
}
