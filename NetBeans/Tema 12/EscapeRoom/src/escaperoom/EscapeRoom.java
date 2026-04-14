/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escaperoom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EscapeRoom {

    public static final String FICHERO = "datos_empleados.txt"; //fichero inicial
    public static final String FICHERO_ZONAS = "fichero_zonas0.txt"; //fichero donde introduciremos los datos
    public static final String FICHERO_ENCRIPTADO = "04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt";//fichero encriptado
    public static final String FICHERO_DESENCRIPTADO = "fichero_desencriptado.txt";//fichero desencriptado

    public static void main(String[] args) {

        int tamanio = 0; //variable para saber el tamaño que tiene el archivo
        String linea = ""; //variable linea para escribir en el archivo
        int eleccion = 0;

        ArrayList<Character> clave = new ArrayList<>();

        try { //excepciones
            do { //bucle
                menu();
                eleccion = pedirInt("Valor:");
                linea = "";
                tamanio = 0;
                switch (eleccion) {

                    case 1 ->
                        leerFichero(tamanio, linea);
                    case 2 ->
                        leerPassword(linea, tamanio, clave);
                    case 3 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Introduce un valor entre 1-3");
                    }
                }
            } while (eleccion != 3);
        } catch (FileNotFoundException e) { //Excepciones
            System.out.println("Error: Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error: Al introducir o leer datos");
        } catch (Exception e) {
            System.out.println("Error: Desconocido");
        }

    }

    //metodo para leer el fichero
    public static void leerFichero(int tamanio, String linea) throws FileNotFoundException, IOException, Exception {

        try (
                FileReader fr = new FileReader(FICHERO); //declaro el reader y el buffered
                 BufferedReader br = new BufferedReader(fr);) {
            linea = br.readLine(); //leo la linea

            while (linea != null) { //leo hasta que no queden lineas

                if (linea.contains("Zona Cero")) {//si la linea actual contine zona cero

                    escribirFichero(tamanio, linea); //llamamos al metodo de escribir

                    tamanio++; //aumento el tamaño para el metodo escribirFichero
                }
                linea = br.readLine(); //paso a la siguiente linea

            }
        }
    }

    public static void escribirFichero(int tamanio, String linea) throws FileNotFoundException, IOException, Exception {

        try (
                FileWriter fw = new FileWriter(FICHERO_ZONAS, true); //declaro los writers apuntando al fichero que quiero escribir
                 PrintWriter pw = new PrintWriter(fw);) {
            for (int i = 0; i < tamanio; i++) { //escribo mientras i sea menor que el numero de lineas

                pw.println(linea); //escribo

            }
        }
    }

    //metodo para leer el archivo encriptado
    public static void leerPassword(String linea, int tamanio, ArrayList<Character> clave) throws FileNotFoundException, IOException {

        int contador = 0;
        char actual = 0;

        ArrayList<String> lineaActual = new ArrayList<>();

        try (
                FileReader fr = new FileReader(FICHERO_ENCRIPTADO); BufferedReader br = new BufferedReader(fr);) {
            linea = br.readLine();

            while (linea != null) { //leo hasta que no queden lineas

                lineaActual.add(linea);

                for (int i = 0; i < lineaActual.size(); i++) { //recorro la linea actual

                    for (int j = 0; j < lineaActual.size(); j++) { //dentro de la linea recorremos el tamaño

                        if (Character.isDigit(actual)) { //si el valor actual es un digito
                                
                            clave.add(actual); //lo guardamos el la lista de la clave

                            contador++; //actualizamos el contador
                        } else { //si no
                            contador = 0; //
                            clave.removeAll(clave); //borramos los valores de la lista
                            System.out.println("Paso1");
                        }

                        if (contador == 8) { //si encontramos los 8 digitos
//                        escribirPassword(tamanio,clave); //llamamos al metodo de escribir

                            System.out.println("Paso2");

                            tamanio++; //aumento el tamaño para el metodo escribirFichero

                        }
                    }
                }
                System.out.println("Paso3");

            }
            linea = br.readLine(); //paso a la siguiente linea
        }

    }

    //metodo para escribir la contraseña
    public static void escribirPassword(int tamanio, ArrayList<Character> clave) throws FileNotFoundException, IOException {

        try (
                FileWriter fw = new FileWriter(FICHERO_DESENCRIPTADO, true); //declaro los writers apuntando al fichero que quiero escribir
                 PrintWriter pw = new PrintWriter(fw);) {
            for (int i = 0; i < tamanio; i++) { //escribo mientras i sea menor que el numero de lineas

                pw.println(clave); //escribo

            }
        }

    }

    //metodo para pedir un entero
    public static int pedirInt(String texto) {

        int valor;

        Scanner entrada = new Scanner(System.in);

        valor = entrada.nextInt();
        entrada.nextLine();

        return valor;
    }

    //metodo para mostrar menu
    public static void menu() {
        System.out.println("1.- Leer datos empleados y escribirlos");
        System.out.println("2.- Leer contraseña encriptada");
        System.out.println("3.- Salir");
    }

}
