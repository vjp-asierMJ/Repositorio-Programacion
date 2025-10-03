/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio23Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precio, cantidad;
        
        int suma;
        
        Scanner entrada = new Scanner (System.in); //Declaro el scanner
        
        System.out.println("Introduzca el precio del ordenador que quieres comprar "); // Pido el precio
       
        precio=entrada.nextInt();
        
        System.out.println("Introduzca la cantidad que quieres comprar"); // Pido la cantidad
         
        cantidad=entrada.nextInt();
        
        suma = precio*cantidad; // Calculo el total
        
        System.out.println("El precio total de los productos es : "+suma+" €");
        
    }
    
}
