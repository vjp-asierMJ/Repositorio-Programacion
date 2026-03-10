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

        ArrayList<Tienda> tienda = new ArrayList<>();

        int eleccion = 0;
        int eleccionAdmin = 0;

        do {
            menu();
            try {

                eleccion = eleccion();

                switch (eleccion) {

                    case 1 -> {
                        do {
                            menuAdministracion();
                            eleccionAdmin = eleccion();
                            switch (eleccionAdmin) {
                                case 1 ->
                                    introducirProductos(tienda);
                                case 2 ->
                                    mostrarProductos(tienda);
                                case 3 ->
                                    eliminarProductos(tienda);
                                case 4 -> {
                                    System.out.println("Saliendo...");
                                }
                                default -> {
                                    System.out.println("Valor incorrecto, elija entre 1-4");
                                }
                            }
                        } while (eleccionAdmin != 4);

                    }
//                case 2 ->
//                case 3 ->
                }
            } catch (InputMismatchException e) {

                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 3);

    }

    public static void introducirProductos(ArrayList<Tienda> tienda) {

        boolean seguir = false;

        String eleccion;

        Scanner entrada = new Scanner(System.in);

        do {

            Tienda t = new Tienda(pedirNombre(), pedirPrecio(), pedirStock());

            tienda.add(t);

            System.out.println("Quieres añadir otro producto s/n");

            eleccion = entrada.nextLine();

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

    public static void mostrarProductos(ArrayList<Tienda> tienda) {

        for (int i = 0; i < tienda.size(); i++) {
            System.out.println(tienda.get(i));
        }

        if (tienda.isEmpty()) {

            System.out.println("No hay productos en el almacen");
        }

    }

    public static void eliminarProductos(ArrayList<Tienda> tienda) {

        boolean encontrado = false;

        Tienda itAux;

        String nombreBuscado = pedirNombre();

        Iterator<Tienda> it = tienda.iterator();

        while (it.hasNext()) {

            itAux = it.next();

            if (itAux.getNombreProducto().equalsIgnoreCase(nombreBuscado)) {

                it.remove();

                encontrado = true;

            }

        }

        if (encontrado == false) {

            System.out.println("No hay ningun producto con ese nombre : " + nombreBuscado);

        } else {

            System.out.println("Producto/s eliminado/s");
        }
    }

    public static String pedirNombre() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre del producto :");

        return entrada.nextLine();
    }

    public static float pedirPrecio() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Precio del producto :");

        return entrada.nextFloat();
    }

    public static int pedirStock() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cantidad de stock :");

        return entrada.nextInt();

    }

    public static void menu() {

        System.out.println("========= MENU ==========");
        System.out.println("1.- Menu de Administracion");
        System.out.println("2.- Menu de compra");
        System.out.println("3.- Salir");
    }

    public static void menuAdministracion() {

        System.out.println("==== SUBMENU DE ADMINISTRACION ====");
        System.out.println("1.- Introducir productos en la lista");
        System.out.println("2.- Visualizar la lista de productos");
        System.out.println("3.- Eliminar productos de la lista");
        System.out.println("4.- Volver al menu principal");
    }

    public static void menuCompra() {

        System.out.println("==== SUBMENU DE COMPRAS ====");
        System.out.println("1.- Comprar productos");
        System.out.println("2.- Volver al menu principal");
    }

    public static int eleccion() {
        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }

}
