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
    
    public static int pedirNumero(){
    int numero;
    
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Introduce un numero");
        numero = entrada.nextInt();
        return numero;
    
    }
    
    public static int [] calcularCifras(int numero){
    
    int [] array = new int [numero];
    return array;
    }
    
    public static void asignarArray(int[] array, int numero){
        int i;
        
        for(i=0;i<array.length;i++){
            array[i] = numero%10;
            numero = numero/10;
            
            System.out.println(array[i]);
        }
        
    }
    
}
