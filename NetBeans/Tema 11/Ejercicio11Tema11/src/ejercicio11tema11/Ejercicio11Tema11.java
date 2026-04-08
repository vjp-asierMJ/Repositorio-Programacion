/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tema11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashSet<Alumno> alumnos = new HashSet<>();
        int eleccion = 0;

        do { //bucle del menu
            try { //excepciones
                menu();
                eleccion = pedirInt("Valor");

                switch (eleccion) {
                    case 1 ->
                        insertarAlumno(alumnos);
                    case 2 ->
                        mostrarAlumnos(alumnos);
                    case 3 ->
                        buscarExpediente(alumnos);
                    case 4 ->
                        mostrarPorNota(alumnos);
                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Inserte un valor entre 1 - 5");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 5); //condicion del menu

    }

    //Método para crear un alumno
    public static void insertarAlumno(HashSet<Alumno> alumnos) {

        //Creo el alumno con los valores 
        Alumno alumno = new Alumno(pedirString("DNI: "), pedirInt("Numero Expediente: "), pedirFloat("Nota Media:"));

        alumnos.add(alumno); //meto el alumno en el conjunto

    }

    //Método para mostrar los alumnos ordenados de menor a mayor
    public static void mostrarAlumnos(HashSet<Alumno> alumnos) {

        ArrayList<Alumno> alumnosOrdenados = new ArrayList<>();

        for (Alumno a : alumnos) { //recorremos todos los valores

            alumnosOrdenados.add(a);
        }

        alumnosOrdenados.sort((s1, s2) -> Integer.compare(s1.getNumeroExpediente(), s2.getNumeroExpediente())); //Vamos comparando cada valor

        System.out.println(alumnosOrdenados);
    }

    //Método para buscar un alumno por numero de expediente
    public static void buscarExpediente(HashSet<Alumno> alumnos) {

        int expediente = pedirInt("Expediente Buscado: ");

        int i = 0;

        ArrayList<Alumno> lista = new ArrayList<>(alumnos); //creamos una lista y le pasamos el conjunto

        boolean encontrado = false;

        while (!encontrado && i < alumnos.size()) {

            if (lista.get(i).getNumeroExpediente() == expediente) {

                System.out.println("DNI: " + lista.get(i).getDni() + " Expediente: " + lista.get(i).getNumeroExpediente() + " Nota Media: " + lista.get(i).getNotaMedia());

                encontrado = true; //pasamos a verdadero
            }

            i++;

        }

        if (encontrado == false) { //si no lo encuntra

            System.out.println("El expediente " + expediente + " no existe");
        }
    }

    //Método para mostrar los alumnos por nota
    public static void mostrarPorNota(HashSet<Alumno> alumnos) {

        int nota = pedirInt("Nota: ");

        boolean encontrado = false;

        for (Alumno a : alumnos) { //recorremos el conjunto

            if (a.getNotaMedia() == nota) { //si encontramos la nota

                System.out.println("DNI: " + a.getDni() + " Expediente: " + a.getNumeroExpediente() + " Nota Media: " + a.getNotaMedia());

                encontrado = true;
            }
        }

        if (encontrado == false) {

            System.out.println("No hay alumnos con " + nota + " nota media");
        }
    }

    //Método para mostrar el menu
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir alumno");
        System.out.println("2.- Mostrar alumnos ordenados");
        System.out.println("3.- Buscar por número de expediente");
        System.out.println("4.- Mostrar alumnos por nota");
        System.out.println("5.- Salir");
    }

    //Método para pedir int
    public static int pedirInt(String texto) {

        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextInt();

        entrada.nextLine();

        return valor; //devolvemos el valor
    }

    //Método para pedir float
    public static float pedirFloat(String texto) {

        float valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextFloat();

        entrada.nextLine(); //limpiamos el buffer

        return valor; //devolvemos el valor
    }

    //Método para pedir String
    public static String pedirString(String texto) {

        String datos;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        datos = entrada.nextLine();

        return datos; //devolvemos el valor
    }

}
