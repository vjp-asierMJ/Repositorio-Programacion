/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio21Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2;
        int resultado;
        
       
       
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce el primer numero");
        num1=entrada.nextInt();
        
        System.out.println("Introduce el segundo numero");
        num2=entrada.nextInt();
        
         try {
         resultado = num1/num2; //Guardo la posible excepcion
         }
         catch(ArithmeticException e){ //Si ocurre error y el resultado es 0
             System.out.println("Error ");
             resultado=0;
         }
         
         System.out.println("El resultado es : "+resultado);
         
        
        
        
    }
    
}
