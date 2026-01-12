/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio9Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = pedirNumero();
        
        int [] vector = calcularCifras(num);
        
        asignarArray(vector,num);
    }
    
    public static int pedirNumero(){ //Metodo para pedir el numero
    int numero;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();
        return numero; //Devolvemos el numero
    
    }
    
    public static int [] calcularCifras(int numero){ //Metodo para saber las cifras
    int contador = 0; //Creamos un contador
    
    
    while (numero> 0){ //Hacemos un bucle mientras que el numero sea mayor que 0
       numero = numero/10; //Dividimos entre 10 por cada cifra
       contador++; //Aumentamos el numero por cada cifra 
       
    }
        System.out.println("El numero de cifras es : "+contador);
    
    
    int [] array = new int [contador]; //Creamos un array y  le ponemos el contador
    return array;
    }
    
    public static void asignarArray(int[] array, int numero){ //Metodo para asignar los valores del array
        int i;
        
        for(i=0;i<array.length;i++){ //Bucle para pasar por todas las posiciones del array
            array[i] = numero%10; //Vamos cogiendo cada unidad
            numero = numero/10; //Actualizamos el valor
            
            System.out.println(array[i]); //Imprimimos el array al reves
        }
        
    }
    
}
