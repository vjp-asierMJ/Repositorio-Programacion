/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio16Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nota;
        String datos;
        int valor;
        System.out.println("Introduce el nombre");
        
      Scanner entrada = new Scanner(System.in);
      
      datos = entrada.nextLine();
      
        System.out.println("Introduce la nota");
        
      valor = entrada.nextInt();
      
     Alumno nombre = new Alumno(datos,valor);
     
     
      
      
        
        
 
}
}
