/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;


public class Ejercicio18Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor;
        int password;
        password= 123456789;
        int conteo;
        conteo = 0; //Declaro las variables
        Scanner entrada = new Scanner (System.in); //Inicializo el scanner
        
        System.out.println("Introduce la contraseña");
        
       
        
        do{
            
             valor = entrada.nextInt();
            if(valor == password){ //Para que el bucle termine debe ser igual que la contraseña
            
                System.out.println("Enhorabuena has acertado la contraseña");
            }
            else {
                
                System.out.println("Vuelve a intentarlo"); //Sino se le pedira que vuelva a introducirla
                conteo++; //Actualizo la variable
                 
            }
                 
               if (conteo==3){ //SI el conteo es igual a 3, es decir se ha errado 3 veces la contraseña imprimira lo siguiente
                    System.out.println("Error de acceso");  
                }  
        }
        while(valor!=password||conteo==3);
        
        
    }
    
}
