/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12bis2tema12;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12Bis2Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = new String[4];
        
        try{ //excepciones
            rellenarArray(array); //metodos
            escribirCadenasEnArchivo(array);
        }
        
         catch(FileNotFoundException e) {//excepciones
        
            System.out.println("Error: Fichero no encontrado");
        }
        
        catch(IOException e) {
        
            System.out.println("Error: Error a la entrada/salida de datos");
        }
        
        catch(InputMismatchException e) {
        
            System.out.println("Error: Valor incorrecto introducido");
        }
       
    }
    
    
    //metodo para pedir un string
    public static String pedirString(String texto){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        return entrada.nextLine();
        
        
    }
    
    //metodo para rellenar el array
    public static void rellenarArray(String[] array) throws InputMismatchException{
  
        for(int i = 0; i<array.length;i++){
        
            array[i] = pedirString("Caracteres: ");
        }
        
    }
    
    //metodo para escribir el archivo
    public static void escribirCadenasEnArchivo(String[] array) throws IOException, FileNotFoundException{    
        
        try(
                FileWriter fw = new FileWriter(pedirString("Nombre del archivo (con .txt)")); //pedimos el nombre del archivo
                
                PrintWriter pw = new PrintWriter(fw);
                )
            
        {
            for(String caracteres : array) { //recorremos el array y vamos imprimiendo cada cadena concatenado con *
            
                pw.print(caracteres.concat("*"));
            }
        
        }
    }
    
}
