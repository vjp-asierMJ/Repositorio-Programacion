/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Tienda> tienda = new ArrayList<>(); //Creamos la lista

        int eleccion = 0;

        do {//Bucle para el menu
            menu();//menu
            try { //excepciones

                eleccion = eleccion();

                switch (eleccion) {//switch case de la eleccion

                    case 1 ->
                        menuAdministracion(tienda); //Caso 1 menu de Administracion
                    case 2 ->
                        menuCompra(tienda); // Caso 2 menu de Compra
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> { //Opcion por defecto
                        System.out.println("Introduce un valore entre 1-3"); 
                    }
                }
            } catch (InputMismatchException e) { //Excepciones

                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 3);//Condicion del bucle

    }

    public static void introducirProductos(ArrayList<Tienda> tienda) {

        boolean seguir = false;

        String eleccion;

        Scanner entrada = new Scanner(System.in);

        do {//Bucle

            Tienda t = new Tienda(pedirNombre(), pedirPrecio(), pedirStock());//Guardamos en un objeto las caracteristicas del producto

            tienda.add(t);//Guardamos en la lista el objeto

            System.out.println("Quieres añadir otro producto s/n");

            eleccion = entrada.nextLine(); //Tomamos la eleccion de  si quiere seguir

            if (eleccion.equalsIgnoreCase("s")) {

                seguir = true;
            } else if (eleccion.equalsIgnoreCase("n")) {

                seguir = false;
            } else {

                System.out.println("Eleccion incorrecta debe ser s/n");

                seguir = false;
            }

        } while (seguir != false);

    }

    public static void mostrarProductos(ArrayList<Tienda> tienda) {//Metodo para mostrar los productos

        for (int i = 0; i < tienda.size(); i++) {
            System.out.println(tienda.get(i));//Recorremos la lista
        }

        if (tienda.isEmpty()) {//Si la lista esta vacia mostramos el mensaje

            System.out.println("No hay productos en el almacen");
        }

    }

    public static void eliminarProductos(ArrayList<Tienda> tienda) { //Metodo para eliminar productos

        boolean encontrado = false;

        Tienda itAux;

        String nombreBuscado = pedirNombre(); //Guardamos el nombre

        Iterator<Tienda> it = tienda.iterator();//Creamos un iterador

        while (it.hasNext()) {//Mientras que tenga productos

            itAux = it.next();//Vamos pasando por los productos

            if (itAux.getNombreProducto().equalsIgnoreCase(nombreBuscado)) {//Si un producto coincide con el que queremos eliminar

                it.remove();//Lo eliminamos

                encontrado = true;

            }

        }

        if (encontrado == false) { //Si no ha encontrado el producto

            System.out.println("No hay ningun producto con ese nombre : " + nombreBuscado);

        } else {

            System.out.println("Producto/s eliminado/s");
        }
    }

    public static String pedirNombre() { //Metodo para pedir el nombre

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre del producto :");

        return entrada.nextLine();
    }

    public static float pedirPrecio() { //Metodo para pedir el precio

        Scanner entrada = new Scanner(System.in);

        System.out.println("Precio del producto :");

        return entrada.nextFloat();
    }

    public static int pedirStock() {//Metodo para pedir el stock

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cantidad de stock :");

        return entrada.nextInt();

    }

    public static void comprarProducto(ArrayList<Tienda> tienda) {

        String producto;
        boolean continuar = true;
        String seguir;
        int i = 0;
        int unidades;
        int contador = 0;
        int auxStock;
        float precio = 0; //Variables
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Tienda> carrito = new ArrayList<>(); //Lista auxiliar para el carrito
        

        if(tienda.size() == 0){ //Si esta vacia error

            System.out.println("Error: Lista vacia");
            continuar = false;
        }

        else { // Sino
        
            while (continuar != false) {

            System.out.println("- Elije que productos quieres comprar");

            producto = pedirNombre(); //Tomamos el nombre
            
            if(tienda.get(i).getNombreProducto().equalsIgnoreCase(producto)) { //Si el producto introdicido es igual a uno de la lista
            
                
                
                do {
                    System.out.println("¿ Cuantas unidades quieres ?");
                    unidades = entrada.nextInt(); //Tomamos las unidades
                    entrada.nextLine(); 
                    
                    if(tienda.get(i).getStock()>= unidades) { //Si tenemos suficiente unidades
                    
                        carrito.add(tienda.get(i)); //Añadimos el objeto a la lista del carrito
                        contador++;//Contador para saber que hemos encontrado el objeto
                        
                        auxStock = tienda.get(i).getStock(); //guardamos el valor de stock en un aux
                        
                        if(auxStock  - unidades <0){ //Si el valor de stock menos las unidades es negativo
                        
                            tienda.get(i).setStock(0); // Le asignamos 0
                        }
                        
                        else { //Si no
                        
                            auxStock = auxStock - unidades; 
                            
                            tienda.get(i).setStock(auxStock); //Actualizamos el stock
                            
                            precio = precio + (carrito.get(i).getPrecio()*carrito.get(i).getStock()); //Actualizamos el precio
                        }
                        
                    }
                    i++; //Actualizamos el valor de i
                    
                    
                    System.out.println("¿Quieres otro producto? s/n"); //Preguntamos si quiere otro
                    seguir = entrada.nextLine();
                    
                    if(seguir.equalsIgnoreCase("s")) {
                    
                        continuar = true;
                    }
                    
                    else {
                        continuar = false;
                    }
                    
                }
                while(continuar);
                
                System.out.println("El importe total es de "+precio);
            }
        }
        
        if(contador == 0) { //Si el contador es 0 no ha encontrado productos
        
            System.out.println("No se ha encontrado ese producto");
        }
        }
        
      
        
    }

    public static void menu() { //Metodo para mostrar el menu principal

        System.out.println("========= MENU ==========");
        System.out.println("1.- Menu de Administracion");
        System.out.println("2.- Menu de compra");
        System.out.println("3.- Salir");
    }

    public static void mostrarMenuAdministracion() { //Metodo para mostrar el menu de administracion

        System.out.println("==== SUBMENU DE ADMINISTRACION ====");
        System.out.println("1.- Introducir productos en la lista");
        System.out.println("2.- Visualizar la lista de productos");
        System.out.println("3.- Eliminar productos de la lista");
        System.out.println("4.- Volver al menu principal");
    }

    public static void mostrarMenuCompra() { //Metodo para mostrar el menu de compra

        System.out.println("==== SUBMENU DE COMPRAS ====");
        System.out.println("1.- Comprar productos");
        System.out.println("2.- Volver al menu principal");
    }

    public static void menuAdministracion(ArrayList<Tienda> tienda) { //Menu para la tienda

        int eleccionAdmin;
        do {
            mostrarMenuAdministracion(); // Mostrar opciones
            eleccionAdmin = eleccion(); // Leer opción
            switch (eleccionAdmin) { //Switch case
                case 1 ->
                    introducirProductos(tienda);
                case 2 ->
                    mostrarProductos(tienda);
                case 3 ->
                    eliminarProductos(tienda);
                case 4 ->
                    System.out.println("Volviendo al menú principal...");
                default ->
                    System.out.println("Valor incorrecto, elija entre 1-4");
            }
        } while (eleccionAdmin != 4);

    }

    public static void menuCompra(ArrayList<Tienda> tienda) { //Menu para compra

        int eleccionCompra;

        do { //Bucle
            mostrarMenuCompra();
            eleccionCompra = eleccion();

            switch (eleccionCompra) {

                case 1 -> { //Caso 1
                    System.out.println(" - Lista de Productos -");
                    mostrarProductos(tienda);
                    comprarProducto(tienda);

                }
                case 2 -> { //Caso 2
                    System.out.println("Saliendo...");
                }
            }
        } while (eleccionCompra != 2);

    }

    public static int eleccion() { //Metodo para tomar la eleccion
        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }

}
