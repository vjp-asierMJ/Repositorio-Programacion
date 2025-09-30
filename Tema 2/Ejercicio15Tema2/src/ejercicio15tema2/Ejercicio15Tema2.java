/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema2;

/**
 *
 * @author Asier
 */
public class Ejercicio15Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo=10000;
        int horas,sobrante;
        int minutos,segundos;
           
        horas = tiempo/3600; //Dividimos en horas
        sobrante = tiempo%3600; //Calculamos el resto de la division 
        
        
        minutos= sobrante/60; //Dividimos el resto en minutos
        segundos = sobrante%60; //Calculamos el resto de los minutos
        
       
        System.out.println("HORAS:"+horas);   
        System.out.println("MINUTOS:"+minutos);
        System.out.println("SEGUNDOS"+segundos);
         
        
       // System.out.println(horas);
      
        
        
    }
    
}
