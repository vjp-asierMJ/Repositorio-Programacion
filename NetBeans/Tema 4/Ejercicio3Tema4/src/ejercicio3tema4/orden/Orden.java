/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3tema4.orden;

/**
 *
 * @author Asier
 */


public class Orden {
    public static void orden(int num1, int num2, int num3){ //Declaro las tres variables
        int primero;
        if (num1>num2&&num1>num3){ //Hago el filtro para sanber cual es el mayor
        primero=num1;
        }
        else if (num2>num1&&num2>num3){
        primero = num2;
        }
        else {
        primero=num3;
    } 
        
        System.out.println("El numero mayor de los introducidos es el : "+primero);//Llamo al numero mayor
    }
    
}
