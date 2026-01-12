/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio2Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = pedirDatos(); //Llamamos a los metodos
        mostrarDatos(numeros);
        cambiarOrden(numeros);
    }

    public static int[] pedirDatos() { //Metodo para pedir los datos
        int numero;
        int i;
        int[] vector = new int[7]; //Declaramos el tamaño del vector

        for (i = 0; i < vector.length; i++) { //Bucle que recorre todas las posiciones del vector
            System.out.println("Introduce un numero");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();

            vector[i] = numero; //Asigno el valor a cada posicion
        }
        return vector;
    }

    public static void mostrarDatos(int[] vector) { //Metodo para mostrar el resultado
        int i;
        System.out.println("El orden original es : ");
        for (i = 0; i < vector.length; i++) { //Bucle que recorre todas las posciones
            System.out.println(vector[i]);
        }
    }

    public static void cambiarOrden(int[] vector) { //Bucle para cambiar el orden
        int aux;
        int i;

        aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux; //Cambio de orden, el 2º con el 4º

        System.out.println("Despues de intercambiar la 2º y la 4º posicion, el nuevo orden es : ");
        for (i = 0; i < vector.length; i++) { //Recorremos todos los valores del vector
            System.out.println(vector[i]); //Mostramos el vector
        }

    }

}
