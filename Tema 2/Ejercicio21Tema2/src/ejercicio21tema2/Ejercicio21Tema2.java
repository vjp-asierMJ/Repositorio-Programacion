/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema2;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio21Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo;
        int horas,minutos,segundos,sobrante;
        
        
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduce un numero de segundos");
        
        tiempo = entrada.nextInt();
        
        horas = tiempo/3600; //Calculo las horas
        
        sobrante = tiempo%3600;//Defino lo que sobra
        
        minutos = sobrante/60; //El sobrante lo divido entre 60 para que me de los minutos
        
        segundos = sobrante%60;
        
        
        System.out.println("Son :"+horas+" horas , "+minutos+" minutos y "+segundos+" segundos");
    }
    
}
