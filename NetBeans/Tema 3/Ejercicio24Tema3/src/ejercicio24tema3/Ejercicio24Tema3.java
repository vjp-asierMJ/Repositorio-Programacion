/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio24Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ultimo;
        int actualizador=1;
        int contador=0; //Declaro variables
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        ultimo=entrada.nextInt(); //Inicio el scanner
        
        while(ultimo<0){ //Si el numero es menor que cero
            System.out.println("Introduce un numero correcto");
            ultimo=entrada.nextInt();
        }
        
        while(actualizador<=ultimo){//Declaro la condicion
        if(actualizador%3==0){// Si el actualizador /3 da resto 0 lo imprimo
            System.out.println(actualizador);
             contador++; //Actualizo el total de numeros que se han mostrados
        }
       actualizador++; //Actualizo la variable
      
        }
        System.out.println("El total de los numeros es : "+contador);
        
    }
    
}
