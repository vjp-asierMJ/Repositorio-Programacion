/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25tema2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio25Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3;
        
        int suma,producto;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        
        num1=entrada.nextInt();
        
        System.out.println("Introduce el segundo numero");
        
        num2=entrada.nextInt();
        
        System.out.println("Introduce el tercer numero");
        
        num3=entrada.nextInt();
        
        suma = num1+num2+num3;
        
        producto= num1*num2*num3;
        
        System.out.println("La suma es : "+suma);
        System.out.println("La multiplicacion es : "+producto);
    }
    
}
