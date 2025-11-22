/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema4;

/**
 *
 * @author alumno
 */
import java.util.Scanner; //Importo el scanner
import ejercicio7tema4.orden.orden;
public class Ejercicio7Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,num4;//Declaro
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce el primer nunero");//Inicializo el scanner
        num1 = entrada.nextInt();
        
        System.out.println("Introduce el segundo numero");
        num2= entrada.nextInt();
        
        System.out.println("Introduce el tercer numero");
        num3 = entrada.nextInt();
        
        System.out.println("Introduce el cuarto numero");
        num4= entrada.nextInt();
        
        orden.orden(num1,num2,num3,num4);
        
    }
    
}
