/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio5Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList<>();

    }

    public static void rellenarLista(ArrayList<Integer> numeros) {

        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos numeros quieres introducir?");

        eleccion = entrada.nextInt();

        for (int i = 0; i < eleccion; i++){
        
            System.out.println("Introduce el numeros");
            
            numeros.set(i, entrada.nextInt());
            
        }
        
    }
    
    public static void mostrarLista(ArrayList<Integer> numeros){
    
        int i;
        
        for(i=0;i<numeros.size();i++) {
        
            System.out.println(numeros.get(i));
        }
    }
    
    public static void buscarPar(ArrayList<Integer> numeros){
    
        int mayor = 0;
        
    }
    
    public static void mayorPar(ArrayList<Integer> numeros){
    
        int i=0;
        
        int mayor = 0;
        
        boolean encontrado = false;
        
        
        while(encontrado != true) { //Encontrar par
        
            if(numeros.get(i)%2 == 0) {
            
                encontrado = true;
                mayor = numeros.get(i);
            }
            i++;
        }
        
        for(int j =0;j<numeros.size();j++){ //Asignar el mayor par
        
            if(numeros.get(i)> mayor && numeros.get(i)%2==0) {
            
                mayor = numeros.get(i);
            }
            
        }
    }
    
    public static void menorImpar(ArrayList<Integer> numeros){
    
        
    }
    
    
    }
    

