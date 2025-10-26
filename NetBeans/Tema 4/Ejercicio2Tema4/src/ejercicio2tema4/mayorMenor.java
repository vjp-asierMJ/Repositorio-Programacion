/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2tema4;

/**
 *
 * @author Asier
 */
import java.util.Scanner; //Importo el scanenr

public class mayorMenor {
    
    public static void mayorMenor(int num1, int num2) { 
   
    Scanner entrada = new Scanner (System.in);
    System.out.println("Por favor, introduzca el primer numero: ");
        num1=entrada.nextInt();
    System.out.println("Ahora, introduzca un segundo numero: ");
        num2= entrada.nextInt();
       
   if (num1>num2) {
   multiplicacion(num1,num2); //Si es mayor llamo al metodo multiplicacion
   }
   else {
   suma(num1,num2); // Sino, al suma
   }
   }
   /**
    * 
    * @param num1
    * @param num2
    * @return devulve la multiplicacion
    */
    public static int multiplicacion(int num1, int num2){//Clase para la multiplicacion
    int resultado;
    resultado = num1*num2;
        System.out.println("La operacion que se realizo es producto y el resultado es : "+resultado);
    return resultado;
    }
    /**
     * 
     * @param num1
     * @param num2
     * @return devuelve la division 
     */
    public static int suma(int num1, int num2){ //Clase para la suma
    int resultado;
    resultado = num1+num2;
        System.out.println("La operacion que se realizo es suma y el resultado es : "+resultado);
    return resultado;
    }

}

