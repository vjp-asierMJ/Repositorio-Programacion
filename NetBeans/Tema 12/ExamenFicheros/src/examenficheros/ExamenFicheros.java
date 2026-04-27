/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenFicheros {

    public final static String FICHERO = "inventario.txt"; //fichero para el ejercicio

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Producto> productos = new ArrayList<>(); //Lista de productos

        int eleccion = 0;

        do { //bucle

            try { //excepciones

                menu(); //menú

                eleccion = pedirInt(""); //pedimos la eleccion

                switch (eleccion) { //switch case

                    case 1 -> //casos
                        rellenarInventario(productos);
                    case 2 ->
                        guardarDatos(productos);
                    case 3 ->
                        leerYProcesarInventario(productos);
                }
            } catch (FileNotFoundException e) { //Excepción de fichero no encontrado

                System.out.println("Error: Fichero no encontrado");

            } catch (IOException e) {//excepción de entrada/salida de datos

                System.out.println("Error: Fallo en la entrada/salida de datos");

            } catch (InputMismatchException e) {//excepción de valor incorrecto

                System.out.println("Error: Valor introducido incorrecto");

            } catch (Exception e) {//excepción general

                System.out.println("Error: Fallo desconocido");
            }

        } while (eleccion != 4); //condición

    }

    /**
     * Método para rellenar la lista de productos
     *
     * @param productos
     */
    public static void rellenarInventario(ArrayList<Producto> productos) {

        do {

            Producto p = new Producto(pedirString("Nombre: "), pedirInt("Cantidad: "), pedirFloat("Precio: ")); //creamos el objeto

            productos.add(p);//lo añadimos a la lista

        } while (pedirString("¿Deseas continuar s/n?").equalsIgnoreCase("s"));//hasta que el usuario ponga n

    }

    /**
     * Método para escribir los datos en el fichero
     *
     * @param productos
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void guardarDatos(ArrayList<Producto> productos) throws IOException, FileNotFoundException {

        try (
                FileWriter fw = new FileWriter(FICHERO); PrintWriter pw = new PrintWriter(fw);) { //writers

            for (Producto p : productos) {//recorremos todos los datos

                pw.println(p.getNombre() + "#" + p.getCantidad() + "#" + p.getPrecio());//escribimos los datos
            }

            System.out.println("Inventario actualizado"); //mensaje

        }
    }

    /**
     * Método para mostrar los productos y el total
     *
     * @param productos
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void leerYProcesarInventario(ArrayList<Producto> productos) throws IOException, FileNotFoundException {

        String linea;

        String[] partes; //creamos un array auxiliar

        String nombre; //variables
        int cantidad;
        float precio;
        float total = 0;

        try (
                FileReader fr = new FileReader(FICHERO); BufferedReader br = new BufferedReader(fr);) {//readers

            linea = br.readLine(); //leemos la linea actual

            while (linea != null) { //mientras la linea no sea nula

                partes = linea.split("#"); //dividimos la linea en 3 y la añadimos al array

                nombre = partes[0]; //asingamos cada variable al valor correspondiente
                cantidad = Integer.parseInt(partes[1]);  //pasamos el string a entero
                precio = Float.parseFloat(partes[2]);  //pasamos el string a float

                System.out.println("Producto: " + nombre); //mostramos los datos
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Precio: " + precio + " €");
                System.out.println(""); //espacion en blanco

                total += precio; //actualizamos el total

                linea = br.readLine(); //pasamos a la siguiente linea
            }

            System.out.println("Precio total de productos: " + total + " €"); //mostramos

        }
    }

    /**
     * Método para pedir un string
     *
     * @param texto
     * @return
     */
    public static String pedirString(String texto) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        return entrada.nextLine();
    }

    /**
     * Método para pedir un entero
     *
     * @param texto
     * @return
     */
    public static int pedirInt(String texto) throws InputMismatchException {

        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextInt();

        entrada.nextLine();

        return valor;
    }

    /**
     * Método para pedir un float
     *
     * @param texto
     * @return
     */
    public static float pedirFloat(String texto) throws InputMismatchException {

        float valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextFloat();

        entrada.nextLine();

        return valor;
    }

    /**
     * Método para mostrar el menú
     */
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Rellenar Inventario");
        System.out.println("2.- Guardar inventario en el fichero");
        System.out.println("3.- Leer y Procesar inventario");
        System.out.println("4.- Salir");
    }

}
