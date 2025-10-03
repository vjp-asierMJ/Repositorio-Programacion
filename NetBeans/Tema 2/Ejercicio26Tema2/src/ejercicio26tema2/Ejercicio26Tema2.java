/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema2;

/**
 *
 * @author alumno
 */
import java.util.*;


public class Ejercicio26Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int milesima,centena,decena,unidad,resto;
      
        
        System.out.println("Introduce 1 numero de 4 cifras cada uno");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el numero ");
        
        numero=entrada.nextInt();
       
      milesima=numero/1000; //Dividimos entre 1000 para la primera cifra
       
      resto=numero%1000; //Tomamos el resto 
       
      centena=resto/100; // Dividimos el resto entre 100 para la segunda cifra
     
      decena=(numero/10)%10; //Dividimos el numero entre 10 y tomamos el resto 
       
       unidad = resto%10;
       
       
       //Mostramos el mensaje por pantall
        System.out.println("La primera cifra es :"+milesima);
         System.out.println("La segunda cifra es :"+centena);
          System.out.println("La tercera cifra es :"+decena);
           System.out.println("La cuarta cifra es :"+unidad);
       
    }
    
}
