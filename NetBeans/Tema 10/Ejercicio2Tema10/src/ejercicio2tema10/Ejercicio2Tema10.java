/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        rellenarLista(numeros);
        mostrarLista(numeros);
        mostrarMayor(numeros);
        mostrarMenor(numeros);
        mostrarSuma(numeros); //Llamada de metodos
    }
    
    public static void rellenarLista( ArrayList<Integer> numeros){ //Metodo para rellenar
    
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        try{ //Excepciones
        System.out.println("Introduce un numero");
        
        numero = entrada.nextInt(); //Tomamos el numero
        
      if(numero>=0){
          
             numeros.add(numero); //Si es mayor que 0 lo guardamos
      
            do {
            System.out.print("Introduce un numero (negativo para salir): ");
                numero = entrada.nextInt(); //Bucle hasta que ponga un negativo

            if (numero >= 0) {
                numeros.add(numero); //Si es positivo lo guardamos
            }

        } while (numero >= 0);  // se repite mientras el número sea positivo o cero
      }
      
      else {
          System.out.println("Has introducido un numero negativo");
      }
        }
        catch(IndexOutOfBoundsException e){ //Control de excepciones
            System.out.println(e);
        }
    
    }
    
    public static void mostrarLista( ArrayList<Integer> numeros){
    
        int i;
              
        
        for(i=0;i<numeros.size();i++){ //Recorremos las posiciones de la lista
        
            System.out.println(numeros.get(i));
        }
    }
    
    public static void mostrarMayor( ArrayList<Integer> numeros){
    
        int mayor;
        int i;
        
        mayor = numeros.get(0); //Asignamos el mayor al primer valor
        
        for(i=0;i<numeros.size();i++){
        
            if(numeros.get(i) > mayor) { //Si hay otro mayor lo cambiamos
            
                mayor = numeros.get(i);
            }
        }
        
        System.out.println("El mayor numero introducido es : "+mayor);
    
    }
    
    public static void mostrarMenor( ArrayList<Integer> numeros){
    
    
        int menor;
        int i;
        
        menor = numeros.get(0); //Asignamos el menor al primer valor
        
        for(i=0;i<numeros.size();i++){ 
        
            if(numeros.get(i) < menor) {
            
                menor = numeros.get(i); //Si hay otro menor lo cambiamos
            }
        }
        
        System.out.println("El mayor numero introducido es : "+menor);
    }
    
    public static void mostrarSuma( ArrayList<Integer> numeros){
    
    
        int i;
        
        int suma = 0;
        
        for(i=0;i<numeros.size();i++){ //Recorremos la lista
        
            suma+=numeros.get(i); //Actualizamos el valor de la suma
        }
        
        System.out.println("La suma total de los valores es : "+suma);
    }
    
}
