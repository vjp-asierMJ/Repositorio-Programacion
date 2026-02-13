/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio7Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        String cadena = "";
        String [] reverso; //Variables
          
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres");
        
        cadena = entrada.nextLine();
        
        reverso = cadena.split(" "); //Split para separ por trozos
        
        for(i=reverso.length-1;i>=0;i--){ //Bucle para mostrarlo al reves
        System.out.println(reverso[i]);
        
        }
        
    }
    
}
