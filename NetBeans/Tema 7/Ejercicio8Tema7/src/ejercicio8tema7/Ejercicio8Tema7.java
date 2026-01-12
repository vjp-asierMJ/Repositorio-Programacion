/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio8Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = pedirNumero();
        int []num = array(numero);
        mostrarArray(num); //Llamamos a los metodos
    }
    public static int pedirNumero(){ //Metodo para pedir el numero
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero de 5 cifras");
        
        numero = entrada.nextInt();
        
        return numero; //Devolvemos el numero
        
        
    }
    
    public static int[] array(int numero){//Metodo del array  
        int i;
        
        int [] array = new int [5]; //Creamos un array de 5 posiciones
        
        
        for(i=0;i<5;i++) { //Bucle para recorrer las posiciones
            
            array [i] = numero%10; //Dividimos el numero incial por trozos
            
            numero = numero/10; //Actualizamos el valor
                      
        }
        return array;  
    }
    
    public static void mostrarArray(int [] array){ //Metodo para mostrar el array
    
        int i;
        System.out.println("El orden inverso es:");
        
        
        for(i=0;i<array.length;i++) { //Recorremos las posiciones
            System.out.println(array[i]);
        }
    }
            
    
}
