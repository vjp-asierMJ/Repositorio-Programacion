/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26tema12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

        int eleccion = 0;

        do {//bucle

            try {//excepciones

                menu();//menu

                eleccion = pedirInt("");

                switch (eleccion) {//switch case de eleccion

                    case 1 -> //casos
                        introducirBebidas(productos);
                    case 2 ->
                        comprarProductos(productos);
                    case 3 -> {

                        System.out.println("Saliendo...");
                    }

                    default -> {
                        System.out.println("Introduce una opción entre 1-3");
                    }

                }

            } catch (FileNotFoundException e) {//fichero no encontradao

                System.out.println("Error: Fichero no encontrado");
            } catch (ClassNotFoundException e) {//clase no encontrada

                System.out.println("Error: Clase no encontrada");
            } catch (IOException e) {//fallo en la entrada/salida de datos

                System.out.println("Error: Fallo en la entrada/salida de datos");
            } catch (InputMismatchException e) {//fallo en la entrada del usuario

                System.out.println("Error: Valor introducido invalido");
            } catch (Exception e) {//errro general

                System.out.println("Error: Error desconocido");
            }

        } while (eleccion != 3); //condicion
    }

    //metodo para introducir y escribir productos
    public static void introducirBebidas(ArrayList<Bebida> productos) throws FileNotFoundException, IOException, ClassNotFoundException {

        Bebida b;

        do {//bucle

            //creo un objeto y lo añado a la lista
            productos.add(b = new Bebida(pedirString("Nombre de la bebida: "), pedirFloat("Precio: "), pedirInt("Stock: ")));
        } //condicion
        while (pedirString("¿Deseas continuar? s/n").equalsIgnoreCase("s"));

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); //writers
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(productos); //escribo la lista

            System.out.println("Productos añadidos a la tienda");
        }
    }
    
    //metodo para comprar productos
    public static void comprarProductos(ArrayList<Bebida> productos) throws FileNotFoundException, ClassNotFoundException,IOException {
    
        ArrayList<Bebida> productosActualizados = new ArrayList<>(productos);
    
        String nombreProducto;
        
        int cantidadProducto;
        
        do{
        
            for(Bebida be : productos) {
            
                System.out.println(be);
            }
            
            nombreProducto = pedirString("Nombre del producto: ");
            cantidadProducto = pedirInt("Cantidad deseada: ");
            
            for(Bebida b : productos) {
            
                if(b.getNombre().equalsIgnoreCase(nombreProducto) && b.getStock()>= cantidadProducto){
                
                    
                }
            }
        }
        while(pedirString("¿Desea continuar? s/n").equalsIgnoreCase("s"));
    
    }

    //metodo para mostrar el menu
    public static void menu() {

        System.out.println("========== MENU ==========");
        System.out.println("1.- Introduccion de bebidas");
        System.out.println("2.- Comprar Productos");
        System.out.println("3.- Salir de la tienda");
    }

    //metodo para pedir un string
    public static String pedirString(String texto) {

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

    //metodo para pedir un float
    public static float pedirFloat(String texto) throws InputMismatchException {

        float valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextFloat();

        entrada.nextLine();

        return valor;
    }

}
