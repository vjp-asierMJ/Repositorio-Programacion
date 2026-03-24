/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Ciudad> ciuadades = new ArrayList<>();
        LinkedHashSet<Sede> sedes = new LinkedHashSet<>();
        
        int eleccion = 0;
        
        do {
        
            try {
                menu();
                eleccion = pedirInt();
                
                switch(eleccion){
                
                    
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: valor incorrecto");
            }
        }
        while(eleccion!=7);
    }
    
    public static void insertarCiudad(ArrayList<Ciudad>ciudades,LinkedHashSet<Sede> sedes){
    
           String ciudad;
           String nombre;
           int ingresos;
           
           ciudad = pedirString("Ciudad: ");
           
           nombre=pedirString("Nombre:");
           ingresos=pedirInt("Ingresos");
           
           Sede s = new Sede(nombre,ingresos);
           
           sedes.add(s);
           
           ciudades.add(sedes);
    }
    
    //Metodo para mostrar el menu
    public static void menu(){
    
        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir ciudad");
        System.out.println("2.- Mostrar ciudades y sedes");
        System.out.println("3.- Nombre de sede e ingresos anuales superiores a la media");
        System.out.println("4.- Buscar sede por nombre");
        System.out.println("5.- Añadir sede");
        System.out.println("6.- Mostrar sedes ordenadas por ingresos");
        System.out.println("7.- Salir");
    }
    
    //Metodo para pedir un int
    public static int pedirInt(String texto){
    
        int valor;
        Scanner entrada = new Scanner(System.in);
                
        valor=  entrada.nextInt();   
        entrada.nextLine();
        return valor;
    }
    
    //Metodo para pedir un String
    public static String pedirString(String texto){
    
        Scanner entrada = new Scanner(System.in);
        
        return entrada.nextLine();
        
    }
    
}
