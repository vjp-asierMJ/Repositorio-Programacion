/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema11;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();

        LocalDate fecha = LocalDate.now();

        int eleccion = 0;

        do {

            try {
                menu();
                eleccion = pedirInt("Valor: ");

                switch (eleccion) {
                    case 1 ->
                        realizarSorteo(sorteos, fecha);
                    case 2 ->
                        repetirSorteo(sorteos, fecha);
                    case 3 ->
                        mostrarSorteosMes(sorteos);
                    case 4 ->
                        mostrarSorteosPorFecha(sorteos);
                    case 5 ->
                        crearSorteosPorFecha(sorteos);
                    case 6 ->
                        mostrarSorteos(sorteos);
                    case 7 -> {
                        System.out.println("Saliendo...");
                    }

                    default -> {
                        System.out.println("Introduce una opción entre 1 - 7");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 7);
    }

    //Metodo para hacer un sorteo
    public static void realizarSorteo(TreeMap<LocalDate, Sorteo> sorteos, LocalDate fecha) {

        int[] numeros = new int[4];

        Sorteo s;

        for (int i = 0; i < numeros.length; i++) { //recorremos el array

            numeros[i] = (int) (Math.random() * 100) + 1; //lo rellenamos de numeros aleatorios

        }

        s = new Sorteo(fecha, numeros); //guardamos los datos en el objeto

        sorteos.put(fecha, s); //metemos los valores de la fecha y el objeto en el mapa

        System.out.println("Sorteo realizado, buena suerte");
    }

    public static void repetirSorteo(TreeMap<LocalDate, Sorteo> sorteos, LocalDate fecha) {

        sorteos.remove(fecha); //borramos el sorteo de hoy

        int[] numeros = new int[4];

        Sorteo s;

        for (int i = 0; i < numeros.length; i++) { //recorremos el array

            numeros[i] = (int) (Math.random() * 100) + 1; //lo rellenamos de numeros aleatorios

        }

        s = new Sorteo(fecha, numeros); //guardamos los datos en el objeto

        sorteos.put(fecha, s); //metemos los valores de la fecha y el objeto en el mapa

        System.out.println("Se ha repetido el sorteo, buena suerte");
    }

    //Metodo para mostrar los sorteos del mes actual
    public static void mostrarSorteosMes(TreeMap<LocalDate, Sorteo> sorteos) {

        int mesActual = LocalDate.now().getMonthValue();//guardamos el numero del mes actual

        if (sorteos.isEmpty()) {
            System.out.println("No hay ningun sorteo");
        } else {
            for (LocalDate clave : sorteos.keySet()) {//recorremos los sorteos

                if (sorteos.get(clave).getFechaSorteo().getMonthValue() == mesActual) { //si el mes del sorteo es igual al mes actual
                    System.out.println(sorteos.get(clave));//mostramos
                }
            }
        }

    }

    //Mostrar sorteos por fecha
    public static void mostrarSorteosPorFecha(TreeMap<LocalDate, Sorteo> sorteos) {

        int dia, mes, anio;

        dia = pedirInt("Dia: ");
        mes = pedirInt("Mes: ");
        anio = pedirInt("Año: "); //guardamos los valores

        LocalDate fecha = LocalDate.of(anio, mes, dia); //guardamos en un LocalDate la fecha

        if (sorteos.containsKey(fecha)) {// si la contiene la fecha lo mostramos
            System.out.println(sorteos);
        }

    }

    //Crear sorteos dada una fecha
    public static void crearSorteosPorFecha(TreeMap<LocalDate, Sorteo> sorteos) {

        int dia, mes, anio;

        dia = pedirInt("Dia: ");
        mes = pedirInt("Mes: ");
        anio = pedirInt("Año: "); //guardamos los valores

        LocalDate fecha = LocalDate.of(anio, mes, dia); //guardamos en un LocalDate la fecha

        int[] numeros = new int[4]; //array de numeros ganadores

        for (int i = 0; i < numeros.length; i++) { //rellenamos con numeros aleatorios

            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        if (sorteos.containsKey(fecha)) { //si hay un sorteo para la fecha mensaje
            System.out.println("Ya existe un sorteo para esa fecha");
        } else {//si no

            Sorteo s = new Sorteo(fecha, numeros); //guardamos en un objeto la fecha y los numeros premiados

            sorteos.put(fecha, s);//guardamos en el mapa la fecha y el objeto
        }
    }

    //Metodo para mostrar todos los sorteos
    public static void mostrarSorteos(TreeMap<LocalDate, Sorteo> sorteos) {

        if (sorteos.isEmpty()) {
            System.out.println("No hay sorteos");
        } else {
            for (LocalDate clave : sorteos.keySet()) {

                System.out.println(sorteos.get(clave));
            }
        }
    }

    //Metodo para el menu
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Realizar sorteo");
        System.out.println("2.- Repetir sorteo");
        System.out.println("3.- Mostrar sorteos del mes");
        System.out.println("4.- Mostrar sorteos de una fecha ");
        System.out.println("5.- Realizar sorteos por fecha");
        System.out.println("6.- Mostrar todos los sorteos");
        System.out.println("7.- Salir");
    }

    //Metodo para pedir un entero
    public static int pedirInt(String texto) {
        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextInt();

        entrada.nextLine();

        return valor;
    }

}
