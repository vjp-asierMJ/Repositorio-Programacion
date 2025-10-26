/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner; //Importo los paquetes
public class Ejercicio15Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero; //Inicializo la variable
        int i;
        int valor;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        
        numero=entrada.nextInt(); //Hago el scanner
        
        for(i=0;i<=10;i++){ //Hago el bucle
        valor = numero*i; //Multiplico el numero por el valor del bucle en cada momento
            System.out.println(numero+" x "+i+" = "+valor); //Imprimo los valores
        }
    }
    
}
