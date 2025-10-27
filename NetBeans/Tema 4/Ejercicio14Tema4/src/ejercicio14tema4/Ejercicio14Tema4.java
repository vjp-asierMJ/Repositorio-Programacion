/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Metodo principal
        // TODO code application logic here
       int num1;
       num1 = 0;
      calculos(num1); //Llamamos al metodo calculos
    }
   public static int dato(int num1){ //Metodo para pedir el numero
    
    Scanner entrada = new Scanner (System.in);
    
        System.out.println("Introduce un numero");
        num1 = entrada.nextInt(); //Recogemos el numero
        return num1; //Devolvemos el numero al programa
        
    }
   public static int mayorQue0(int num1) { //Metodo de filtro para que sea mayor que 0
    num1=dato(num1);
    while (num1<=0){ //Bucle para que introduzca una mayor que 0
      System.out.println("Introduce un caracter valido");
      num1 = dato(num1); //Tomamos el numero del anterior metodo
    }
  
    return num1; //Devolvemos el valor al programa

}
   public static int calculos(int num1){ //Metodo para los calculos
        int actualizador, contador;
        actualizador = 1;
        contador = 0;
        num1 = mayorQue0(num1); //Tomamos el numero del anterior metodo
    
    while(actualizador<=num1){ //Mientras que actualizador sea menor a numero va a seguir el bucle
    if (actualizador%3==0) { //Creamos el filtro para que solo nos muestre los multiplos de 3
        contador++; //Actualizamos el contador por cada numero multiplo de 3 que escribamos
            System.out.println(actualizador + " Es multiplo de 3"); // Si es multiplo lo escribimos y actualizamos el contador
            }
    actualizador++; //Actualizamos la condicion para que el bucle no sea infinito
    }
        System.out.println("Los multiplos de 3 entre 1 :"+contador);
    
        
    return num1;} //Devolvemos el valor
} 

