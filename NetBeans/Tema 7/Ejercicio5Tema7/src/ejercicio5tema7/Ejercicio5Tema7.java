/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio5Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] valores = introducirValores(); //Llamada a los metodos

        mostrarArray(valores);
        mayorArray(valores);
        menorArray(valores);
        sumaArray(valores);
    }

    public static int[][] introducirValores() { //Metodo para insertar los valores

        int numero, i, j;

        int[][] array = new int[4][2]; //Creamos el array

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < array.length; i++) { //Bucle para recorrer las filas

            for (j = 0; j < array[0].length; j++) { //Bucle para recorrer las columnas

                System.out.println("Introduce un numero");
                numero = entrada.nextInt();

                array[i][j] = numero; //Asignamos al array el valor del numero introducido
            }
        }

        return array; //Devolvemos el array

    }

    public static void mostrarArray(int[][] array) { //Metodo para mostrar el array

        int i, j;

        System.out.println("===== Valores Introducidos =====");

        for (i = 0; i < array.length; i++) { //Recorremos las filas

            for (j = 0; j < array[0].length; j++) { // Las columnas
                System.out.println("[" + i + j + "]" + array[i][j]); //Mostramos los valores introducidos 
            }
        }
    }

    public static void mayorArray(int array[][]) { //Metodo para mostrare el mayor

        int mayor, i, j;

        i = 0;
        j = 0;

        mayor = array[i][j]; //Asignamos el numero mayor a la primera posicion del array

        for (i = 0; i < array.length; i++) { //Recorremos las filas

            for (j = 0; j < array[0].length; j++) { //Recorremos las columnas

                if (array[i][j] > mayor) { //Si el valor actual es mayor al anterior

                    mayor = array[i][j]; // lo cambiamos
                }
            }
        }
        System.out.println("El numero mayor es el : " + mayor);
    }

    public static void menorArray(int array[][]) { //Metodo para mostrar el menor

        int menor, i, j;

        i = 0;
        j = 0;

        menor = array[i][j]; // Asignamos el menor a la posicion 00 del array

        for (i = 0; i < array.length; i++) { //Recorremos las filas

            for (j = 0; j < array[0].length; j++) { //Recorremos las columnas

                if (array[i][j] < menor) { //Si el valor actual es menor que el anterior lo intercambiamos

                    menor = array[i][j]; //Intercambio
                }
            }
        }
        System.out.println("El numero menor es el : " + menor);
    }

    public static void sumaArray(int array[][]) { //Metodo para sumar todos los valores del array

        int suma, i, j;

        suma = 0; //Creamos e inicializamos una variable suma

        for (i = 0; i < array.length; i++) {//Filas

            for (j = 0; j < array[0].length; j++) {//Columnas

                suma =  suma + array[i][j] ; //Actualizamos el valor de lsa suma
            }
        }

        System.out.println("La suma total es : " + suma);
    }

}
