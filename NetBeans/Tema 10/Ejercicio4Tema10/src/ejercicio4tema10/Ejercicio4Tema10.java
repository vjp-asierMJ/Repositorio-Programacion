/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio4Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Integer> lista = new ArrayList<>();
        
        rellenarLista(lista);
        mostrarLista(lista);
        listaSinRepetidos(lista);
    }
    
    
    public static void rellenarLista(ArrayList <Integer> lista){
    
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
        
            System.out.println("Introduce el numero (para finalizar debe ser negativo)");
        
            num = entrada.nextInt();
            
        
            if(num>=0){ //para que no añada el negativo a la lista
                lista.add(num);
            }
          
        }
        
        while (num >= 0);
        
        
    }
    
    public static void mostrarLista(ArrayList <Integer> lista){
    
        int i;
        
        System.out.println("========= LISTA ORIGINAL =========");
        
        for(i=0;i<lista.size();i++){
        
            System.out.println(lista.get(i));
        }
    }
    
    public static void listaSinRepetidos(ArrayList <Integer> lista){
    
    
        int i;
        int j;
        
        System.out.println("========== LISTA SIN REPETIDOS ==========");
        
        for(i=0;i<lista.size();i++){
        
            
            for(j=0;j<lista.size();j++){
            
                if(i!=j && lista.get(i).equals(lista.get(j))) {
                
                    lista.set(i, 0);
                    lista.set(j, 0);
                }
                
            }
        }
        
        for(i=0;i<lista.size();i++){
        
            System.out.println(lista.get(i));
        }
    }
    
    
    
    
    
}
