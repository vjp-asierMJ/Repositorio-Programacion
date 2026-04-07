/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet <Alumno> alumnos = new HashSet<>();
        int eleccion = 0;
        
        do {
            try{
                menu();
                eleccion= pedirInt("Valor");
                
                switch (eleccion){
                    case 1-> insertarAlumno(alumnos);
                    case 2->mostrarAlumnos(alumnos);
                    
                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Inserte un valor entre 1 - 5");
                    }
                }
            }
            catch(InputMismatchException e){
                System.out.println("Error: Valor incorrecto");
            }
        }
        while(eleccion !=5);
        
    }
    
    //Método para crear un alumno
    public static void insertarAlumno(HashSet <Alumno> alumnos){
        
        //Creo el alumno con los valores 
        Alumno alumno = new Alumno(pedirString("DNI: "),pedirInt("Numero Expediente: "),pedirFloat("Nota Media:"));
        
        
        alumnos.add(alumno); //meto el alumno en el conjunto
        
    }
    
    //Método para mostrar los alumnos ordenados de menor a mayor
    
    public static void mostrarAlumnos(HashSet <Alumno> alumnos){
    
        ArrayList<Integer> alumnosOrdenados = new ArrayList<>();
        
        for(Alumno a : alumnos){ //recorremos todos los valores
        
            alumnosOrdenados.add(a.getNumeroExpediente());
        }
        
        alumnosOrdenados.sort((s1,s2) -> Integer.compare(s2, s1)); //Vamos comparando cada valor
    }
    
    //Método para mostrar el menu
    public static void menu(){
    
        System.out.println("========== MENÚ ==========");
         System.out.println("1.- Añadir alumno");
         System.out.println("2.- Mostrar alumnos ordenados");
         System.out.println("3.- Buscar por número de expediente");
         System.out.println("4.- Mostrar alumnos por nota");
         System.out.println("5.- Salir");
    }
    
    //Método para pedir int
    public static int pedirInt(String texto){
    
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        valor = entrada.nextInt();
        
        entrada.nextLine();
        
        return valor;
    }
    
    //Método para pedir float
    public static float pedirFloat(String texto){
    
        float valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        valor = entrada.nextFloat();
        
        entrada.nextLine();
        
        return valor;
    }
    
    //Método para pedir String
    public static String pedirString(String texto){
    
        String datos;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        datos = entrada.nextLine();
        
        return datos;
    }
    
}
