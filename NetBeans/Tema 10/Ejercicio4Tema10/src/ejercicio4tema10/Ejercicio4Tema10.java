/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema10;

import java.util.ArrayList;
import java.util.HashSet;
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
        
        ArrayList <Integer> lista = new ArrayList<>(); //Creamos la lista
        
        rellenarLista(lista);
        mostrarLista(lista);
        sustituirRepetido(lista);
        mostrarLista(lista);
    }
    
    /**
     * Metodo para rellenar la lista
     * @param lista 
     */
    
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
        
        while (num >= 0); //mientras que sea mayor a 0
        
        
    }
    
    /**
     * Metodo para mostrar la lista
     * @param lista 
     */
    public static void mostrarLista(ArrayList <Integer> lista){
    
        int i;
        
        System.out.println("========= LISTA ORIGINAL =========");
        
        for(i=0;i<lista.size();i++){ //Bucle
        
            System.out.println(lista.get(i));//Lo mostramos
        }
    }
    
    /**
     * Metodo para comprobar la lista sin números repetidos
     * @param lista 
     */
    
    public static boolean comprobarRepetidos(ArrayList<Integer> lista,int num) {
    
        boolean repetido = false;
        
            if(lista.indexOf(num) != lista.lastIndexOf(num)) { //Si los valores son diferentes significa que hay varios repetidos
            
                repetido = true;
            }
            
            return repetido;
            
        }
    
    /**
     * Metodo para sustituir los repetidos
     * @param lista 
     */
    
        public static void sustituirRepetido(ArrayList<Integer> lista){ 
        
            int actual;
            
            for(int i = 0;i<lista.size();i++){ //Recorremos la lista
                
                actual = lista.get(i); //Guardamos el valor actual en un aux
                if (comprobarRepetidos(lista,actual) == true) { //Si hay repetidos
                
                    for(int j = 0;j<lista.size();j++){ //Otro bucle para comparar el valor actual con cada uno de los otros
                    
                        if(lista.get(j) == actual) { //Si son iguales
                        
                            lista.set(j, 0); //Lo sustituimos por 0
                        }
                    }
                }
            }
        }
    }
    
    
    
    
    

