/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio4Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] valores = array();
        arrayPares(valores);

    }

    public static int[][] array() { //Metodo para mostrar el array
        int inicio, fin, rango, i, j; //Variables

        int[][] array = new int[4][3]; //Creamos el array

        inicio = 100;
        fin = 200;

        rango = fin - inicio; //Creamos el rango para el ramdom

        System.out.println("===== Numeros Generados =====");

        for (i = 0; i < array.length; i++) { //Bucle para recorrer las filas

            for (j = 0; j < array[0].length; j++) { //Bucle para recorrer las columnas de las filas

                array[i][j] = (int) (Math.random() * rango) + inicio; //Crear el numero random entre 100 y 200

                System.out.println("[" + i + j + "]" + array[i][j]); //Imprimimos el numeros
            }
        }

        return array;
    }

    public static void arrayPares(int[][] array) {

        int i, j;

        System.out.println("===== Numeros Pares =====");
        for (i = 0; i < array.length; i++) { //Bucle para recorrer las filas

            for (j = 0; j < array[0].length; j++) { //Bucle para recorrer las columnas

                if (array[i][j] % 2 == 0) { //Si algun valor de la columna es par lo imprimer
                    System.out.println("[" + i + j + "]" + array[i][j]);
                }

            }
        }
    }

}
