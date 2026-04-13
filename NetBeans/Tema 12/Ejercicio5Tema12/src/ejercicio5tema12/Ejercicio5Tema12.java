/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema12;

/**
 *
 * @author alumno
 */
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio5Tema12 {
public final static String AGENDA = "agenda.txt";    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    
    public static void insertarContacto() throws IOException, FileNotFoundException {
    
        try(
                FileWriter fw = new FileWriter("agenda.txt");
                PrintWriter pw = new PrintWriter(fw);
                
            )
        {
            pw.println(pedirString("Nombre: "));
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
