/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema12 {

    public final static String FRASE = "frase.txt";
    public final static String FRASEINVERTIDA = "fraseinvertida.txt"; //archivos
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String lineaAlReves;//creamos la linea para pasarla a los metodos
        
        try{//excepciones
        
            lineaAlReves = leerArchivo();//metodos
            escribirArchivo(lineaAlReves);
        }
        catch(FileNotFoundException e){//excepciones
        
            System.out.println("Error: Fichero no encontrado");
        }
        
        catch(IOException e) {
        
            System.out.println("Error: Error en la entrada/salida de datos");
        }
        
        
    }
    
    //metodo para leer un archivo
    public static String leerArchivo() throws IOException, FileNotFoundException {
    
        String linea;
        String lineaAlReves = ""; //creamos la lineaAlReves, no la creamos en el main ya que entonces no se podria actualizar el valor
        try(
           
                FileReader fr = new FileReader(FRASE); //readers
                BufferedReader br = new BufferedReader(fr);
           )
        {
        
            linea = br.readLine(); //leemos la linea
            
            while(linea != null){//mientras no este vacia
            
                for(int i = linea.length() - 1;i>=0;i--){//recorremos las posiciones desde el final
                
                    lineaAlReves += linea.charAt(i); //añadimos a la variable cada letra
                }
                
                linea = br.readLine(); //leemos la siguiente linea
            }
        }
        
        return lineaAlReves; //la devolvemos para poder usarla en el main
    }
    
    //metodo para escribir el fichero
    public static void escribirArchivo(String lineaAlReves) throws IOException,FileNotFoundException {

        
        try(
                FileWriter fw = new FileWriter(FRASEINVERTIDA); //writers
                PrintWriter pw = new PrintWriter(fw);
                )
        {
        
            pw.println(lineaAlReves); //escribimos la variable lineaAlReves
        }
    }
    
}
