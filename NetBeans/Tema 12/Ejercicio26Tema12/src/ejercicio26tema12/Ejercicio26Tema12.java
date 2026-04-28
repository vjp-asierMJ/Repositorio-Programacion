/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26Tema12 {

  public final static String FICHERO = "tienda.obj";
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Bebida> productos = new ArrayList<>(); //lista para guardar los objetos
    }
   
    public static void introducirBebidas(ArrayList<Bebida> productos){
    
        Bebida b;
        
        do{
        
            productos.add(b = new Bebida(pedirString("Nombre de la bebida: "),pedirFloat("Precio: "),pedirInt("Stock: ")));
        }
        while(pedirString("¿Deseas continuar? s/n").equalsIgnoreCase("s"));
        
        
        try(
                FileOutputStream fos = new FileOutputStream(FICHERO);
                )
        {}
    }
    
    //metodo para mostrar el menu
    public static void menu(){
    
        System.out.println("========== MENU ==========");
        System.out.println("1.- Introduccion de bebidas");
        System.out.println("2.- Comprar Productos");
        System.out.println("3.- Salir de la tienda");
    }
    
    //metodo para pedir un string
    public static String pedirString(String texto){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        return entrada.nextLine();
    }
    
    //metodo para pedir un entero
    public static int pedirInt(String texto) throws InputMismatchException{
    
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        valor = entrada.nextInt();
        
        entrada.nextLine();
        
        return valor;
    }
    
    //metodo para pedir un float
    public static float pedirFloat(String texto) throws InputMismatchException{
    
        float valor;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(texto);
        
        valor = entrada.nextFloat();
        
        entrada.nextLine();
        
        return valor;
    }
    
}
