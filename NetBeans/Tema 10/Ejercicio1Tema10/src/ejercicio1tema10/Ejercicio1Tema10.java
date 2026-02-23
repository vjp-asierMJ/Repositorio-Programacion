/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> nombres = new ArrayList<>(); //Creamos la lista

         rellenarLista(nombres); //Llamamos a los metodos
         mostrarLista(nombres);
    }

    public static void rellenarLista(ArrayList<String>nombres) { //Metodo para rellenar la lista
       
        String nombre;
        int eleccion = 0; //variables

        do {//bucle
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el nombre");
            nombre = entrada.nextLine(); //tomamos el nombre

            nombres.add(nombre);//lo guardamos el la lista

            System.out.println("¿Quieres introducir otro nombre?");
            System.out.println("1.- Si");
            System.out.println("2.- No");

            eleccion = entrada.nextInt();

        } while (eleccion != 2);
    }
    
    public static void mostrarLista(ArrayList<String>nombres){ //Metodo para mostrar la lista
    
       int i;
       
        System.out.println("Nombres Introducidos");
       for(i=0;i<nombres.size();i++){
       
           System.out.println(nombres.get(i)); //mostramos la lista
       }
     
    }

}
