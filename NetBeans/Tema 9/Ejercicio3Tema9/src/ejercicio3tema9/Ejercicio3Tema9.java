/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio3Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        String caracter; //Variables
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de caracteres");
        
        caracter = entrada.nextLine();
        
        char array[] = caracter.toCharArray(); //Creamos un array y lo asignamos al valor
        
        for(i=0;i<caracter.length();i++){ //Recorrer el tamaño del valor introducido
        
            System.out.println(array[i]);//Mostramos cada letra
        }
    }
    
    }
    

