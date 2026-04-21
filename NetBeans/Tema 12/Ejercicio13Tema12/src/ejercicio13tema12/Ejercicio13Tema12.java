/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema12;

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
 * @author alumno
 */
public class Ejercicio13Tema12 {

    public final static String FICHERO = "DatosBeca.txt";

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            leerFichero();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Error, fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error: Error, en la entrada/salida de datos");
        } catch (InputMismatchException e) {

            System.out.println("Error: Error, valor introducido incorrecto");
        }

    }

    //metodo para leer el fichero
    public static void leerFichero() throws IOException, FileNotFoundException {

        String linea;

        try (
                FileReader fr = new FileReader(FICHERO); 
                BufferedReader br = new BufferedReader(fr);
                
            ) 
        {

            linea = br.readLine();

            while (linea != null) {
                linea = br.readLine();

            }

            if (linea == null) {
                escribirFichero();
            }
        }
    }

    public static void escribirFichero() throws IOException, FileNotFoundException {

        try (
                FileWriter fw = new FileWriter(FICHERO);
                PrintWriter pw = new PrintWriter(fw);
                
            ) 
        {
            pw.println("Nombre y Apellido del becario: " + pedirString("Nombre y Apellido del becario"));
            pw.println("Sexo: " + pedirString("Sexo (H-M)"));
            pw.println("Edad: " + pedirInt("Edad (20-60)"));
            pw.println("Numero de suspensos: " + pedirInt("Numero de suspensos 0-4"));
            pw.println("Residiencia Familiar: " + pedirString("Residencia Familiar SI-NO"));
            pw.println("Ingresos Anuales: " + pedirInt("Ingresos Anuales: "));
        }

    }

    //metodo para pedir un string
    public static String pedirString(String texto) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        return entrada.nextLine();
    }

    //metodo para pedir un entero
    public static int pedirInt(String texto) throws InputMismatchException {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        int valor = entrada.nextInt();

        entrada.nextLine();

        return valor;
    }
}
