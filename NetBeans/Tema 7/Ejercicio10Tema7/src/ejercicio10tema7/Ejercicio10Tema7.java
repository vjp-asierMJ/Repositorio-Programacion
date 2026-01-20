/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio10Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] array = new int[10]; //Creamos el array

        rellenarArray(array);
        mostrarArray(array);
        buscar(array);
        arraySinRepetidos(array);
    }

    public static void rellenarArray(int[] array) { //Rellenamos el array

        int i;
        int inicio, fin, rango;

        inicio = 1;
        fin = 8;
        rango = fin - inicio; //Rango de los numeros aleatorios

        for (i = 0; i < array.length; i++) { //Bucle para rellenar el array

            array[i] = (int) (Math.random() * rango) + inicio; //Lo rellenamos

        }
      

    }

    public static void mostrarArray(int[] array) { //Metodo para mostrar el array

        int i;

        for (i = 0; i < array.length; i++) { //Recorremos las posiciones
            System.out.println((i+1) + ".- " + array[i]); //Las mostramos
        }
    }

    public static void buscar(int[] array) {

        int i = 0;
        int j;


        while (i < array.length) { //Primer bucle para recorrer todas las posciones

            j = i + 1; //Asignamos un puesto por encima a la j

            while (j < array.length) { //Bucle para recorrer la j

                if (array[i] == array[j] && array[i] != 0) {//Si i = j y distinto de 0

                    array[j] = 0; //J pasa a 0
                }

                j++; //Actualizamos la posicion

            }
            i++; //Actualizamos la posicion
        }

    }

    public static void arraySinRepetidos(int[] array) {

        int i;
        System.out.println("ARRAY SIN REPETIDOS");
        for (i = 0; i < array.length; i++) { //Recorremos el array

            System.out.println((i+1) + " .- posicion " + array[i]); //Mostramos las posiciones del array
        }

    }

}
