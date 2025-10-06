/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio8Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dinero;
        int billetes50,billetes20,billetes10,billetes5,
                monedas2,monedas1,resto; //Declaramos las variables
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Porfavor indique una cantidad de dinero");
        
        dinero = entrada.nextInt();
        
        billetes50=dinero%50;
        resto=billetes50%20;
                
        billetes20=resto/20;
        resto=resto%10;
        
        billetes10=resto/10;
        resto=resto%5;
        
        billetes5=resto/5;
        resto=resto%2;
        
        monedas2=resto/2;
        
        monedas1= monedas2%2;
        
        
        System.out.println(dinero+" Euros se descomponen en:");
    }
    
}
