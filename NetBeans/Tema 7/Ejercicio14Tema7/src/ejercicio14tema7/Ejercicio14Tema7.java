/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema7;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] array = new int[4][7]; //Creamos el array con los dias del mes
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}; //Creamos otro array para los dias de la semana

        int eleccion = 0; //Creamos una variable eleccion

        do {

            try {

                eleccion = mostrarMenu(); //Mostramos el menu

                switch (eleccion) { //Switch case de la eleccion del usuario

                    case 1:
                        rellenarArray(array); //Caso 1, rellenamos
                        break;

                    case 2:
                        mostrarArray(array, dias);// Caso 2 mostramos
                        break;

                    case 3:
                        mostrarMediaTemperatura(array); //Caso 3 mostramos la media
                        break;

                    case 4:
                        mostrarMayorTemperatura(array, dias); //Caso 4 mostramos la mayor temperatura
                        break;

                    case 5:

                        System.out.println("Saliendo....."); //Caso 5 salimos
                        break;

                    default:
                        System.out.println("Introduce una opcion valida"); //Opcion por defecto
                }
            } catch (InputMismatchException e) { //Control de excepciones

                System.out.println("Introduce un valor correcto");
            }

        } while (eleccion != 5); //Condicion del bucle

    }

    public static void rellenarArray(int[][] array) { //Metodo para rellenar el array

        int temperaturas;
        int i, j;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < array.length; i++) { //Bucle para filas

            for (j = 0; j < array[0].length; j++) { //Bucle para columnas

                System.out.println("Introduce las temperaturas");
                temperaturas = entrada.nextInt();

                array[i][j] = temperaturas; //Asignamos al array el valor introducido
            }
        }
    }

    public static void mostrarArray(int[][] array, String[] dias) { //Metodo para mostrar el array

        int i, j;
        int semana;

        for (i = 0; i < array.length; i++) { //Bucle para las filas

            for (j = 0; j < array[0].length; j++) { //Bucle para las columnas

                semana = i + 1; //Sumamos a la semana 1 para que no empice por 0

                System.out.println("El " + dias[j] + " de la semana " + semana + " hace una temperatura de : " + array[i][j] + " grados");//Mostramos el mensaje
            }
        }

    }

    public static void mostrarMediaTemperatura(int[][] array) { //Metodo para la media

        int i, j;
        float media = 0;
        int numeroDias = 28; //Vatrable

        for (i = 0; i < array.length; i++) {//Filas

            for (j = 0; j < array[0].length; j++) {//Semanas

                media = media + array[i][j]; //Actualizamos el valor
            }
        }

        media = media / numeroDias; //Dividmos entre el numero total de dias

        System.out.println("La media de temperatura es de " + media);
    }

    public static void mostrarMayorTemperatura(int[][] array, String[] dias) { //Mayor temperatura

        int i, j;

        int mayor;

        int semana = 0;

        int diaMayor = 0;

        mayor = array[0][0]; //Asignamos mayor a la primera posicion del array

        for (i = 0; i < array.length; i++) { //Filas

            for (j = 0; j < array[0].length; j++) {//Columnas

                if (array[i][j] > mayor) {//Si el valor actual es mayor al anterior lo intercambiamos

                    mayor = array[i][j];

                    semana = i; //Guardamos la semana

                    diaMayor = j; //Guardamos el dia
                }
            }
        }

        System.out.println("El  " + dias[diaMayor] + " de la semana " + (semana + 1) + " con " + mayor + " grados"); //Mostramos los valores

    }

    public static int mostrarMenu() { //Metodo para mostrar el menu

        int eleccion; //Variable

        Scanner entrada = new Scanner(System.in);
        System.out.println("========= MENU ==========");
        System.out.println("1.- Rellenar las temperaturas ");
        System.out.println("2.- Mostrar temperaturas");
        System.out.println("3.- Visualizar la temperatura media del mes");
        System.out.println("4.- Dia mas caluroso del mes");
        System.out.println("5.- Salir del programa");
        System.out.println("========= MENU ==========");

        eleccion = entrada.nextInt(); //Tomamos el valor

        return eleccion; //Devolvemos al main
    }

}
