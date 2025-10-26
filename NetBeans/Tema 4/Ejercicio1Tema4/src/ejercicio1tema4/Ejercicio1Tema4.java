/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema4;

/**
 *
 * @author Asier
 */
import java.util.Scanner;
public class Ejercicio1Tema4 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero=0;
        positivoNegativo(numero);
        
        
    }
        public static void positivoNegativo(int numero){
            System.out.println("Por favor, introduzca un numero :");
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        
        if(numero>=0){
            System.out.println("El numero introducido es positivo: "+numero);
        }
        else {
            System.out.println("El numero introducido es negativo : "+numero);
        }
    }
    }
    

