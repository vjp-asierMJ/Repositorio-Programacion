/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema7;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int eleccion;

        int[] numero = new int[12]; //Creamos un array

        do {
            eleccion = menu(); //Llamamos al menu
            switch (eleccion) { //Switch case con el valor de la eleccion

                case 1:
                    numero = rellenarArray();
                    break;

                case 2:
                    mostrarVentas(numero);
                    break;

                case 3:
                    mostrarVentasReves(numero);
                    break;

                case 4:
                    mostrarTotal(numero);
                    break;

                case 5:
                    mostrarTotalMesesPares(numero);
                    break;

                case 6:
                    masVentas(numero);
                    break;

                case 7:
                    System.out.println("Cerrando.....");
                    break;

                default:

                    System.out.println("Introduce la eleccion del 1 - 7");

            }
        } while (eleccion != 7);
    }
    
    
    public static int menu() { //Metodo para mostrar el menu
        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        try { //Control de excepciones

            System.out.println("========== MENU ==========");
            System.out.println("1.- Rellenar array");
            System.out.println("2.- Mostrar ventas");
            System.out.println("3.- Mostrar ventas al reves");
            System.out.println("4.- Mostrar total de ventas");
            System.out.println("5.- Mostrar venta meses pares");
            System.out.println("6.- Mostrar mes con mas ventas");
            System.out.println("7.- Salir");
            System.out.println("========= MENU ==========");

            eleccion = entrada.nextInt();

        } catch (InputMismatchException e) {
            entrada.next(); //Limpiamos el buffer
        }
        return eleccion; //Devolvemos la eleccion

    }

    public static int[] rellenarArray() { //Metodo para rellenar los valores
        int[] array = new int[12];
        int i;
        int aleatorio;
        int inicio, fin;
        int rango; //Variables

        inicio = 10;
        fin = 100;
        rango = fin - inicio; //Rango para el numero aleatorio

        for (i = 0; i < array.length; i++) {

            aleatorio = (int) (Math.random() * rango) + inicio; //Asignamos el rango

            array[i] = aleatorio; //Asignamos el numero al array

        }
        System.out.println("Rellenado.");
        return array; //Devolvemos el valor

    }

    public static void mostrarVentas(int[] array) { //Mostrar el array

        int i;

        for (i = 0; i < array.length; i++) {
            System.out.println(i + " .- Mes :" + array[i]); //Recorre las posiciones 
        }
    }

    public static void mostrarVentasReves(int[] array) { //Mostrar al reves

        int i;

        System.out.println("Ventas al reves");

        for (i = array.length - 1; i > 0; i--) { //Bucle para mostrarlo al reves
            System.out.println(array[i]);
        }

    }

    public static void mostrarTotal(int[] array) { //Metodo para sumar los valores

        int i;
        int total = 0;

        for (i = 0; i < array.length; i++) { //Recorremos las posiciones
            total = total + array[i]; //Vamos sumando y actualizando el valor
        }
        System.out.println("El total de ventas es de : " + total);

    }

    public static void mostrarTotalMesesPares(int[] array) { //Metodo para los meses pares

        int i;

        int total = 0;

        for (i = 0; i < array.length; i++) { //Bucle para recorrer las posiciones

            if (array[i] % 2 != 0) { //Si es impar
                total = total + array[i]; //Sumamos
            }
        }
        System.out.println("El total de ventas de los meses pares es de : " + total);

    }

    public static void masVentas(int[] array) { //Metodo para el mes de mas ventas

        int i;
        int mes = 0;
        int max;

        max = array[0]; //Asignamos el primer valor del array a una variable
        //Creamos el array de ventas
        String[] ventas = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (i = 0; i < array.length; i++) { //Recorremos el bucle

            if (array[i] > max) { //Si un valor del array es mayor al actual

                max = array[i]; //Asignamos el mayor

                mes = i; //Igualamos el valor del mes a la posicion de i que se encuentre
                         // Esto para asignar la posicion para el array de ventas

            }

        }
        System.out.println("El mes con mas ventas es : " + ventas[mes]+" con un total de : "+array[mes]);
        
    }

}
