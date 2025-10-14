/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio17Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float numero;
        float raiz;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        
        numero=entrada.nextInt();
        
        raiz = (float)Math.sqrt(numero);
        
        
        do{
        
            if (numero>0){ //Si cumple la condicion
            System.out.println("La raiz cuadrada es : "+raiz);
        }

            else{System.out.println("Error, debes introducir un numero postivo");} //Si no la cumple
                
         
        }
      
             
      while(numero<=0); //Condicion para el bucle
    
    }
    
}
