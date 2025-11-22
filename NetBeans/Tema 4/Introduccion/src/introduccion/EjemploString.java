/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class EjemploString {
   public static void main(EjemploString[] args) {
   //Declarar variable
   String nombre;
   String nombre1="Manolo";
   //Inicializar la variable
   nombre = "Manolo";
   //Declarar e inicializar EjemploString
   
   String apellido = "Garcia";
   //Pedir una cadena al usuario
   Scanner entrada = new Scanner(System.in);
   System.out.print("¿Cual fue el ultimo trofeo que ganaste? : ");
   String trofeos = entrada.nextLine();
       System.out.println("Has ganado el trofeo de:  "+trofeos);
    
    //Comparar dos cadenas de caracter .equals .equalsIgnoreCase
   if(nombre.equals(apellido)) {
       System.out.println("Son iguales");
   }
   else {
       System.out.println("Son distintos");
           }
    if (nombre.equalsIgnoreCase(nombre1)){
            System.out.println("Son iguales");
   }
   else {
            System.out.println("Son distintos");
        }
   }
  
}
