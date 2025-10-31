/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2tema4;

import java.util.Scanner;

/**
 *
 * @author Asier
 *///Importo el scanenr

public class mayorMenor {
    
    public static void mayorMenor(int num1, int num2, int resultado) { 
   

      Scanner entrada = new Scanner (System.in);
     
        System.out.println("Introduce el primer numero"); //Pido el primer numero
        num1= entrada.nextInt();
        System.out.println("El segundo numero");
        num2=entrada.nextInt(); //Pido el segundo
       
        if (num1>num2){ //Si num1 es mayor multiplica
        mayorMenor.multiplicacion(num1, num2);
        resultado = num1*num2;
            System.out.println("La multiplicacion de"+num1+"*"+num2+"="+resultado);
        }
        else {
        mayorMenor.suma(num1, num2); //Si es menor suma
        resultado=num1+num2;
            System.out.println("La suma de "+num1+"+"+num2+"="+resultado);
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
     * @return devuelve la suma 
     */
    public static int suma(int num1, int num2){ //Clase para la suma
    int resultado;
    resultado = num1+num2;
        System.out.println("La operacion que se realizo es suma y el resultado es : "+resultado);
    return resultado;
    }

}

