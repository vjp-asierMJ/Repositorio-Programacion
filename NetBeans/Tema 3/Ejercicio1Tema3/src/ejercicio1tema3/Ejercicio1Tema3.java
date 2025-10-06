/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int numero; //Declaro la variable
         System.out.println("Por favor, introduzca un numero");
    Scanner entrada = new Scanner (System.in);
    numero = entrada.nextInt(); //Inicializo el scanner
    
    if (numero>=0){ //Hago la condicion
        System.out.println("El numero introducido es postivo");
        }
    else {System.out.println("El numero introducido es negativo");
        }
    
    }
   
}
