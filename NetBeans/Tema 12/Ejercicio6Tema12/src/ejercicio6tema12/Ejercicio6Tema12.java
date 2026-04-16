/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asier
 */
public class Ejercicio6Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numeros = new int[100]; //creamos el array
        String archivo = "";
        int eleccion = 0;
        
        do{ //bucle
        
            try{ //excepciones
                menu();
                eleccion = pedirInt("Valor: ");
                
                switch(eleccion){ //switch case
                    case 1 -> {
                        rellenarArray(numeros);
                        archivo = pedirString("Nombre del Archivo (con .txt): ");
                        insertarNumeros(numeros,archivo);
                    }
                    case 2 -> leerNumeros(archivo);
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                }
            }
            catch(InputMismatchException e){//captura de excepciones
            
                System.out.println("Error : Valor incorrecto");
            }
            catch(FileNotFoundException e){
                System.out.println("Error : Fichero no encontrado");
            }
            catch(IOException e){
                System.out.println("Error: No es posible leer o introducir informacion en el fichero");
            }
            catch(Exception e){
                System.out.println("Error: Error desconocido");
            }
        }
        while(eleccion !=3);
    }
    
    //metodo para rellenar el array con 100 pares
    public static void rellenarArray(int[] numeros){
    
        for(int i = 0; i < numeros.length;i++){
        
           numeros[i] = (i+1) * 2; //esto lo rellenara con todos los pares
        }
    }
    
    //metodo para escribir los numeros
    public static void insertarNumeros(int[] numeros,String archivo) throws IOException, FileNotFoundException {
        try(
            
                FileWriter fr = new FileWriter(archivo); //creamos los writers
                PrintWriter pr = new PrintWriter(fr);
            )
        {
            for(int numero : numeros){//recorremos el array y lo escribimos
                pr.println(numero);
            }
        }
    }
    
    //metodo para leer el archivo
    public static void leerNumeros(String archivo) throws IOException, FileNotFoundException{
    
        try(
               
            FileReader fr = new FileReader(archivo);//creamos los readers
            BufferedReader br = new BufferedReader(fr);
            )
        {
        
            String linea = br.readLine(); //leemos la linea actual
            
            while(linea != null){ //mientras que haya lineas
            
                System.out.println(linea); //mostramos
                
                linea = br.readLine(); //pasamos a la siguiente
            }
        }
    }
    
    //metodo para mostrar el menu
    public static void menu(){
    
        System.out.println("========== MENU ==========");
        System.out.println("1.- Escribir numeros");
        System.out.println("2.- Mostrar contenido");
        System.out.println("3.- Salir");
    }
    
    //metodo para pedir un string
    public static String pedirString(String texto) throws InputMismatchException{
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        return entrada.nextLine();
    }
    
    //metodo para pedir un entero
    public static int pedirInt(String texto) throws InputMismatchException {
    
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        valor = entrada.nextInt();
        
        entrada.nextLine();
        
        return valor;
    }
    
}
