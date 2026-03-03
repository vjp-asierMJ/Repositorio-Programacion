/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7Tema10 {

    /**
     * @param args the command line arguments
     */
    public final static int SEMANAS = 4; //filas
    public final static int DIAS = 7; //columnas

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();

        String[] nombreDias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        int opcion = 0;

        do {

            try {

                System.out.println("1.- Rellenar Temperaturas");
                System.out.println("2.- Mostrar las temperaturas");
                System.out.println("3.- Visualizar temperatura media del mes");
                System.out.println("4.- Dia o dias más calurosos del mes");
                System.out.println("5.- Salir del programa");

                opcion = pedirOpcion();

                switch (opcion) {

                    case 1 ->
                        rellenar(temperaturas);
                    case 2 ->
                        mostrar(temperaturas, nombreDias);
                    case 3 ->
                        calcularMedia(temperaturas);
                    case 4 ->
                        mostrarTemperaturasMaximas(temperaturas, nombreDias);
                    case 5 ->
                        System.out.println("Gracias por usar el programa");
                    default ->
                        System.out.println("Introduce uma eleccion entre 1 - 5");

                }
            } catch (InputMismatchException e) {

                System.out.println("Error : Introduzca un numero entero entre 1 - 5");
            }
        } while (opcion != 5);

    }

    /**
     * Rellena una lista de lista con 28 temperaturas
     *
     * @param temperaturas
     */
    public static void rellenar(ArrayList<ArrayList<Integer>> temperaturas) {

        for (int i = 0; i < SEMANAS; i++) {
            ArrayList<Integer> dias = new ArrayList<>(); //ArrayList de temperaturas de la semana

            for (int j = 0; j < DIAS; j++) {

                dias.add((int) (Math.random() * 15)); //Relleno el arrayList de temperaturas 
            }

            temperaturas.add(dias); //Inserto las temperaturas de la semana en la lista
        }

    }

    /**
     * Muestra las temperaturas del mes
     *
     * @param temperaturas
     * @param nombreDias
     */
    public static void mostrar(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {

        if (temperaturas.isEmpty()) {

            System.out.println("No hay temperaturas registradas en el mes");
        } else {

            for (int i = 0; i < SEMANAS; i++) {

                System.out.println("Semana " + (i + 1));

                for (int j = 0; j < DIAS; j++) {

                    System.out.println(nombreDias[j] + " : " + temperaturas.get(i).get(j) + " ºC");
                }
            }
        }
    }

    /**
     * Metodo para calcular la temperatura media
     *
     * @param temperaturas
     */
    public static void calcularMedia(ArrayList<ArrayList<Integer>> temperaturas) {

        int media = 0;

        if (temperaturas.isEmpty()) {

            System.out.println("No hay temperaturas registradas en el mes");
        } else {

            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {

                    media += temperaturas.get(i).get(j);
                }
            }
        }

        media /= SEMANAS * DIAS;

        System.out.println("La temperatura media del mes es" + media);

    }

    public static void mostrarTemperaturasMaximas(ArrayList<ArrayList<Integer>> temperaturas, String[] nombreDias) {

        int maxTemp = 0, tempActual;
        if (temperaturas.isEmpty()) {

            System.out.println("No hay temperaturas registradas en el mes");
        } else {

            for (int i = 0; i < SEMANAS; i++) {

                for (int j = 0; j < DIAS; j++) {

                    tempActual = temperaturas.get(i).get(j);

                    if (tempActual > maxTemp) {

                        maxTemp = tempActual;
                    }

                }
            }
        

        System.out.println("Los dias con mas temperaturas son : ");

        for (int i = 0; i < SEMANAS; i++) {

            for (int j = 0; j < DIAS; j++) {

                if (temperaturas.get(i).get(j) == maxTemp) {

                    System.out.println("El " + nombreDias[j] + " de la semana " + (i + 1) + " con " + maxTemp + " ºC");
                }
            }
        }

    }
    }

    public static int pedirOpcion() {

        Scanner entrada = new Scanner(System.in);

        return entrada.nextInt();
    }
}
