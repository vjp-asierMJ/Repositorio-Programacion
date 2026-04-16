/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema12;

/**
 *
 * @author alumno
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5Tema12 {
public final static String AGENDA = "agenda.txt";    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion = 0;
        
        do{
            try{ //menu
                menu();
                eleccion = pedirInt("Valor: ");
                switch (eleccion) {
                    case 1-> insertarContacto();
                    case 2-> leerContacto();
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Introduce un valor del 1-3");
                    }
                }
            }
            
            catch(FileNotFoundException e){ //Excepciones
                System.out.println("Error: Fichero no encontrado");
            }
            catch(IOException e){
                System.out.println("Error en la entrada o salida de datos");
            }
            
            catch(InputMismatchException e){
                System.out.println("Error: Valor incorrecto");
            }
            
            catch(Exception e){
                System.out.println("Error: Error desconocido");
            }
            
        }
        while(eleccion!=3); //condicion
    }
    
    //metodo para leer el contacto
    public static void leerContacto()  throws IOException, FileNotFoundException {
    
        try(
                FileReader fr = new FileReader("agenda.txt"); //creamos los reader
                BufferedReader br = new BufferedReader(fr);
                )
        {
            String linea = br.readLine(); //guardamos la linea
            
            while(linea != null) {//mientras no este vacia
                
                System.out.println(linea+";");//mostramos
                
                linea = br.readLine(); //pasamos a la siguiente linea
            }
        }
    }
    
    //metodo para insertar linea
    public static void insertarContacto() throws IOException, FileNotFoundException, InputMismatchException {
    
        try(
                FileWriter fw = new FileWriter("agenda.txt"); //creamos los writers
                PrintWriter pw = new PrintWriter(fw);
                
            )
        {
            pw.println(pedirString("Nombre: ")); //escribimos los valores
            pw.println(pedirInt("Edad: "));
            pw.println(pedirInt("Numero de telefono: "));
        }
    }
    
    
    //metodo para pedir String
    public static String pedirString(String texto) throws InputMismatchException {
    
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
    
    //metodo para mostrar el menu
    public static void menu(){
    
        System.out.println("========== MENU ==========");
        System.out.println("1.- Añadir contacto");
        System.out.println("2.- Mostrar contacto");
        System.out.println("3.- Salir");
    }
    
}
