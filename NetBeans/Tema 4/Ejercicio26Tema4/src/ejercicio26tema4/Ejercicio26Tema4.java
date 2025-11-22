/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema4;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio26Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean resultado; //Creamos resultado
        
        resultado = esPrimo(); //Lo igualamos al metodo
        
        if (resultado == true) { //Si es cierto, el numero es primo
            System.out.println("El numero introducido es primo");
        }
        else{ //Sino, es falso
            System.out.println("El numero introducido es compuesto");
        }     
   }
    public static boolean esPrimo(){
        boolean primo;
        int num;
        int i;
        int contador;
        contador = 0;
        i=0;//Declaro las variables
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero");
        num = entrada.nextInt(); //Recojo el numero del usuario
        
        while(i<num&&contador!=3){ //Mientras que i sea menor que el numero y contador diferente de 3 continuara el bucle
            i++; //Actualizamos i
            if(num%i==0) { //Si el numero entre i da resto 0, actualizamos el contador
            contador ++;
            }
              
        }
        if (contador == 2) { //Si contador = 2, por que los primos solo se pueden dividir entre 2 numeros, entonces si es 2 sabemos que es primo
               primo = true; //Es primo
               
           }
           else {
                 primo = false; //Sino es compuesto
           }
    
    return primo;} //Devolvemos el valor al main
    
}
