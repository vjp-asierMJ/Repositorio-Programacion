/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros = pedirNumero(); //LLamamos a los metodos
        mostrarPares(numeros);
    
    }
    public static int [] pedirNumero(){ //Metodo para pedir numero
        int numero;
        int i;
        int [] vector = new int [9]; //Creamos el vector
        for(i=0;i<=9;i++){ //Bucle para que pida 10 numeros
            System.out.println("Introduce un numero");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt(); //Tomo el numero
            
           vector[i] = numero; //Asigno el numero a cada posicion del vector
           
           
        }
       return vector; //lo devolvemos
         
    }
    public static void mostrarPares(int [] vector){ //Tomamos el vector
        System.out.println("Los numeros pares son: ");
        
        int i;
        
        for (i=0;i < vector.length;i++){ //Bucle para que recorra todas las posiciones del vector
            if (vector[i]%2 == 0) { //Si el numero da resto 0 lo mostramos
                System.out.println(vector[i]);
            }
        }
    }
    
    
}
