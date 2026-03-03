/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio6Tema10 {

    /**
     * @param args the command line arguments
     */
    public final static int MESES = 12;

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> ventas = new ArrayList<>();//Lista

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"};//Array auxiliar

        int eleccion = 0;

        do { //Menu

            try { //Excepciones

                menu();

                eleccion = eleccion();

                switch (eleccion) {//Switch case

                    case 1 ->
                        rellenar(ventas, meses);
                    case 2 ->
                        mostrar(ventas, meses);
                    case 3 ->
                        mostrarAlReves(ventas, meses);
                    case 4 ->
                        totalVentas(ventas);
                    case 5 ->
                        ventasMesesA(ventas, meses);
                    case 6 ->
                        mesesMasVentas(ventas, meses);
                    case 7 ->
                        System.out.println("Saliendo...");
                    default ->
                        System.out.println("Introduce un valor entre 1 - 7");

                }
            } catch (InputMismatchException e) {

                System.out.println("Error : introduce un caracter valido");
            }
        } while (eleccion != 7);
    }

    /**
     * Metodo para rellenar la lista
     *
     * @param ventas
     */
    public static void rellenar(ArrayList<Integer> ventas, String[] meses) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < MESES; i++) {

            System.out.println("Ventas del mes de " + meses[i]);

            ventas.add(entrada.nextInt());
        }
    }

    /**
     * Metodo para mostrar la lista
     *
     * @param ventas
     */
    public static void mostrar(ArrayList<Integer> ventas, String[] meses) {

        if (ventas.isEmpty()) {

            System.out.println("Error : no hay ventas introducidas");
        } else {

            for (int i = 0; i < MESES; i++) {

                System.out.println("Mes : " + meses[i] + " tiene " + ventas.get(i) + " ventas");
            }
        }
    }

    /**
     * Metodo para mostrar la lista
     *
     * @param ventas
     */
    public static void mostrarAlReves(ArrayList<Integer> ventas, String[] meses) {

        if (ventas.isEmpty()) {

            System.out.println("Error : no hay ventas introducidas");
        } else {

            for (int i = MESES - 1; i > 0; i--) {//-1 para que no desborde la lista

                System.out.println("Mes : " + meses[i] + " tiene " + ventas.get(i) + " ventas");
            }
        }
    }

    /**
     * Metodo para calcular el total de ventas
     *
     * @param ventas
     */
    public static void totalVentas(ArrayList<Integer> ventas) {

        int total = 0;

        if (ventas.isEmpty()) {

            System.out.println("Error : no hay ventas introducidas");
        } else {

            for (int i = 0; i < MESES; i++) {

                total += ventas.get(i); //actualizo el valor
            }

            System.out.println("El total de ventas es de " + total);
        }
    }

    /**
     * Metodo para calcular el total de ventas de meses que contengan a
     *
     * @param ventas
     * @param meses
     */
    public static void ventasMesesA(ArrayList<Integer> ventas, String[] meses) {

        int total = 0;

        if (ventas.isEmpty()) {

            System.out.println("Error : no hay ventas introducidas en los mes");
        } else {

            for (int i = 0; i < MESES; i++) {

                if (meses[i].contains("a") || meses[i].contains("A")) { //Si contiene a || A

                    total += ventas.get(i);//lo sumo

                }
            }

            if (total == 0) { //Si esta vacion no tiene meses
                System.out.println("No hay ventas en los meses que contengan a");
            } else { //Sino 

                System.out.println("El total de ventas es " + total);
            }
        }
    }

    /**
     * Mostrar meses de mayor ventas
     *
     * @param ventas
     * @param meses
     */

    public static void mesesMasVentas(ArrayList<Integer> ventas, String[] meses) {

        int max = 0;

        if (ventas.isEmpty()) {

            System.out.println("Error : no hay ventas introducidas");
        } else {

            for (int i = 0; i < MESES; i++) {//Bucle para encontrar la mayor temperatura

                if (ventas.get(i) > max) { //Si el valor actual es mayor al guardado lo sobreescribimos

                    max = ventas.get(i);
                }
            }

            System.out.println("Mes/s con mas ventas : ");

            for (int j = 0; j < MESES; j++) { //otro bucle para mostrar los repetidos de maxima temperatura

                if (ventas.get(j) == max) {//Si es igual lo mostramos

                    System.out.println("El mes " + meses[j] + " tiene un total de " + max + " ventas");
                }
            }
        }
    }

    /**
     * Metodo para la eleccion del menú
     *
     * @return
     */
    public static int eleccion() {

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }

    public static void menu() {

        System.out.println("========= MENU =========");
        System.out.println("1.- Introducir las ventas de coches");
        System.out.println("2.- Mostrar las ventas");
        System.out.println("3.- Mostrar las ventas introducidas al reves");
        System.out.println("4.- Total de ventas del año");
        System.out.println("5.- Ventas totales de meses que contengan a");
        System.out.println("6.- Mes/Meses con mas ventas");
        System.out.println("7.- Salir");

    }
}
