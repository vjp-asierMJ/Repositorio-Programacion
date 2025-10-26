/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema4;

/**
 *
 * @author Asier
 */
import java.util.Scanner; //Importo el scanner
import ejercicio3tema4.orden.Orden; //Importo el paquete
public class Ejercicio3Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1=entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero : " );
        num2= entrada.nextInt();
        System.out.println("Por ultimo, introduzca un tercer numero : ");
        num3=entrada.nextInt();
        
        Orden.orden(num1, num2, num3); //Invoco el metodo
        
    }
    
}
