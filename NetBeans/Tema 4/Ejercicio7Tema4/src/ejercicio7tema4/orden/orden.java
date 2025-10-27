/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema4.orden;

/**
 *
 * @author alumno
 */
public class orden {
    
    public static void orden(int num1, int num2, int num3, int num4){
    
        int primero = num1;
        int segundo = num2;
        int tercero = num3;
        int cuarto = num4;

        // Primera pasada
        if (primero > segundo) {
            int aux = primero;
            primero = segundo;
            segundo = aux;
        }
        if (segundo > tercero) {
            int aux = segundo;
            segundo = tercero;
            tercero = aux;
        }
        if (tercero > cuarto) {
            int aux = tercero;
            tercero = cuarto;
            cuarto = aux;
        }

        // Segunda pasada
        if (primero > segundo) {
            int aux = primero;
            primero = segundo;
            segundo = aux;
        }
        if (segundo > tercero) {
            int aux = segundo;
            segundo = tercero;
            tercero = aux;
        }

        // Tercera pasada
        if (primero > segundo) {
            int aux = primero;
            primero = segundo;
            segundo = aux;
        }

        // Mostrar resultado
        System.out.println("Los números introducidos son: " + num1 + " - " + num2 + " - " + num3 + " - " + num4);
        System.out.println("Ordenados de menor a mayor:");
        System.out.println("Primero: " + primero);
        System.out.println("Segundo: " + segundo);
        System.out.println("Tercero: " + tercero);
        System.out.println("Cuarto: " + cuarto);            
        

         System.out.println("Los numeros introducidos son "+num1+" - "+num2+" - "+num3 +" - "+ num4 );
       
        System.out.println(primero);
        System.out.println(segundo);
        System.out.println(tercero);
        System.out.println(cuarto); 
        }  
       
        }
    
