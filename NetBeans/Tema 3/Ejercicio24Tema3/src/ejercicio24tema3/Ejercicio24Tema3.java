/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio24Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inicio;
        int ultimo;
        int actualizador=1;
        int contador=0;
        
        inicio = 1;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        ultimo=entrada.nextInt();
        
        while(ultimo<0){
            System.out.println("Introduce un numero correcto");
            ultimo=entrada.nextInt();
        }
        
        while(actualizador<=ultimo){
        if(actualizador%3==0){
            System.out.println(actualizador);
        }
       actualizador++;
       contador++;
        }
        System.out.println("El numero de veces que se ha repetido es : "+contador);
        
    }
    
}
