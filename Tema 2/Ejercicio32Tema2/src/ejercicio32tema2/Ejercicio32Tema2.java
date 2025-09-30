/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32tema2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio32Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        int billetes50,billetes20,billetes10,billetes5;
        
        int moneda2,moneda1;
        
        int resto;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Por favor, indique una cantidad de dinero : ");
        
       valor=entrada.nextInt();
       
       billetes50=valor/50; //Dividimos  el numero entre 50
       resto=valor%50; //Tomamos el resto y lo actualizamos para facilitar el proceso
      
               
       billetes20=resto/20;  //Dividimos  el numero entre 20
       resto=resto%20;  //Tomamos el resto y lo actualizamos para facilitar el proceso
       
       billetes10=resto/10;  //Dividimos  el numero entre 10
       resto=resto%10; //Tomamos el resto y lo actualizamos para facilitar el proceso
       
       billetes5=resto/5;  //Dividimos  el numero entre 5
       resto=resto%5; //Tomamos el resto y lo actualizamos para facilitar el proceso
       
       moneda2=resto/2;  //Dividimos  el numero entre 2
       resto=resto%2; //Tomamos el resto y lo actualizamos para facilitar el proceso
       
       moneda1= resto%2;
       
        System.out.println(valor+": Se descompone en "+billetes50+" billetes de 50 euros "+billetes20+" billetes de 20 euros "
                +billetes10+" billetes de 10 euros "+billetes5+" billetes de 5 euros "+moneda2+" monedas de 2 euros "+moneda1+" monedas de 1 euros ");
        
    }
    
}
