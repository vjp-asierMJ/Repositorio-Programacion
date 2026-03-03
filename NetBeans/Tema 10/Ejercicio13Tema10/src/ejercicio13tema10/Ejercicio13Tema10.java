/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13Tema10 {

    /**
     * @param args the command line arguments
     */
    public final static int MESES = 12;

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Venta> ventas = new ArrayList<>();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        
        int eleccion = 0;

do { // Menú

    try { // Excepciones

        menu(); // Mostrar el menú

        eleccion = eleccion(); // Método que lee la opción del usuario

        switch (eleccion) { // Switch moderno (Java 14+)

            case 1 -> rellenar(ventas, meses);          // Introducir ventas
            case 2 -> mostrar(ventas);                 // Mostrar ventas
            case 3 -> totalVentas(ventas);                   // Suma total de ventas
            case 4 -> ventaMesesA(ventas);                  // Ventas meses que empiezan por A
            case 5 -> mesMasVentas(ventas);               // Mes con más ventas
            case 6 -> System.out.println("Saliendo...");     // Salir del programa
            default -> System.out.println("Introduce un valor entre 1 y 6");

        }

    } catch (InputMismatchException e) {
        System.out.println("Error: introduce un número válido"); }

} while (eleccion != 6);

    }

    /**
     * Metodo para las ventas del objeto
     *
     * @return
     */
    public static int ventasCoche() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ventas : ");

        return entrada.nextInt();
    }

    /**
     * Metodo para rellenar la lista
     *
     * @param ventas
     * @param meses
     */

    public static void rellenar(ArrayList<Venta> ventas, String[] meses) {

        for (int i = 0; i < MESES; i++) {

            System.out.println(meses[i]);

            Venta v = new Venta(meses[i], ventasCoche());//Guardo los valores en un objeto

            ventas.add(v); //Guardo el objeto en la lista
        }
    }

    /**
     * Metodo para mostrar la lista
     *
     * @param ventas
     */

    public static void mostrar(ArrayList<Venta> ventas) {

        if (ventas.isEmpty()) { // Si esta vacia error

            System.out.println("Error : no hay ventas introducidas");
        } else {

            for (int i = 0; i < MESES; i++) {

                System.out.println(ventas.get(i).toString());
            }
        }
    }

    /**
     * Mostrar el total de ventas
     *
     * @param ventas
     */
    public static void totalVentas(ArrayList<Venta> ventas) {

        if (ventas.isEmpty()) { //Si esta vacio error

            System.out.println("Error : no hay ventas introducidas");
        } else { //Sino

            int total = 0;

            for (int i = 0; i < MESES; i++) {

                total += ventas.get(i).getVentasCoches(); //ctualizamos el valor
            }

            System.out.println("El total de ventas es de : " + total);
        }
    }

    /**
     * Metodo para mostrar las ventas de los meses que contienen la a
     *
     * @param ventas
     */
    public static void ventaMesesA(ArrayList<Venta> ventas) {

        if (ventas.isEmpty()) { //Si esta vacio error

            System.out.println("Error: no hay ventas introducidas");
        } else {

            int total = 0;

            for (int i = 0; i < MESES; i++) { //Recorremos la lista

                if (ventas.get(i).getNombreMes().contains("a") || ventas.get(i).getNombreMes().contains("A")) { //Si contiene a || A

                    total += ventas.get(i).getVentasCoches(); //Lo sumamos

                }
            }

            System.out.println("El total de ventas de meses que contengan a es de " + total);
        }
    }

    /**
     * Metodo para mostrar el mes con mas ventas
     *
     * @param ventas
     */
    public static void mesMasVentas(ArrayList<Venta> ventas) {

        if (ventas.isEmpty()) {//Si esta vacio error

            System.out.println("Error: no hay ventas introducidas");
        } else {

            int mayor = ventas.get(0).getVentasCoches(); //Guardamos el primer valor de la lista

            String mes = ventas.get(0).getNombreMes(); //Guardamos el primer mes de la lista

            for (int i = 0; i < MESES; i++) {

                if (ventas.get(i).getVentasCoches() > mayor) { //Si el valor actual es mayor al anterior

                    mayor = ventas.get(i).getVentasCoches(); //Guardamos el valor

                    mes = ventas.get(i).getNombreMes();//Guardamos el mes
                }
            }

            System.out.println("El mes con mas ventas es " + mes + " con un total de " + mayor + " ventas");
        }
    }

    public static int eleccion() {

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }
    
    public static void menu() {
    System.out.println("========= MENÚ =========");
    System.out.println("1.- Introducir las ventas de coches de cada mes del año");
    System.out.println("2.- Mostrar las ventas introducidas");
    System.out.println("3.- Mostrar la suma total de ventas de coches del año");
    System.out.println("4.- Mostrar las ventas totales de los meses que empiezan por la letra 'A'");
    System.out.println("5.- Mostrar el nombre del mes con más ventas");
    System.out.println("6.- Salir del programa");
    System.out.print("Seleccione una opción: ");
}

}
