/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio6Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte nota; //Declaro la variable
        
        Scanner entrada = new Scanner(System.in); //Inicializamos las variables
        
        System.out.println("Introduce la nota");
        
        nota=entrada.nextByte();
        
       if (nota >=0 && nota <=4){ //Filtramos la nota 
           System.out.println("0 a 4 = Suspenso");
                               }
       
       else if (nota >= 5 && nota<=6){
               System.out.println("5 a 6 = Bien");
                                       }
       else if (nota >= 7 && nota <=8){
                System.out.println("7 a 8 = Notable");
                                        }
       else if (nota >=9 && nota <= 10){
                System.out.println("9 a 10 Sobresaliente");
                                        }
       
       else { //Ponemos la opcion default
           System.out.println("Introduce una nota entre 0 y 10");
            }
    
        
        
                    
            
    }
    
}
