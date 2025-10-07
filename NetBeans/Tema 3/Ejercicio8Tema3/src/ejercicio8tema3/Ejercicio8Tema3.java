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
        
        billetes50=dinero/50; //Tomamos el resto y lo actualizamos
        resto=dinero%50;
                
        billetes20=resto/20;
        resto=resto%20;
        
        billetes10=resto/10;
        resto=resto%10;
        
        billetes5=resto/5;
        resto=resto%5;
        
        monedas2=resto/2;
        
       resto=resto%2;
        
       monedas1= resto;
       
       //Descomponemos
       
        System.out.println(dinero+" Se decompone en: ");
        
        //Hacemos el control de flujo
        
        
        if(billetes50>0){ //Si el valor es mayor que 0 imprimimos sino,no
        
           System.out.println(" Billetes de 50 : "+billetes50);
           }
           
         if(billetes20>0){
           System.out.println(" Billetes de 20 : "+billetes20);
           }
           
         if(billetes10>0){
           System.out.println(" Billetes de 10 : "+billetes10);
           }
           
          if(billetes5>0){
           System.out.println(" Billetes de 5 : "+billetes5);
           }
          
          if(monedas2>0){
           System.out.println(" Monedas de 2 : "+monedas2);
           }
         if(monedas1>0){
           System.out.println(" Monedas de 1 : "+monedas1);
           }
           
           
     
                   
    }
    
}