/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema7;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam = pedirTamano();
        int[] numeros = aleatorio(tam);
        mostrarVector(numeros);
    }

    public static int pedirTamano() { //Metodo para elegir el tamaño del vector
        int eleccion;
        eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        while (eleccion < 1 || eleccion > 10) { //Bucle para la eleccion del tamaño

            try { //Control de excepciones

                System.out.println("Introduce un numero del 1 al 10");

                eleccion = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero entero");
                entrada.next(); //Limpiamos el buffer para que no se quede en bucle
            }

        }
        return eleccion; //Devolvemos el tamaño del vector
    }

    public static int[] aleatorio(int eleccion) {
        int i;
        int[] vector = new int[eleccion]; //Asignamos el tamaño al array

        System.out.println("Tenemos un total de " + eleccion + " numeros");

        for (i = 0; i < vector.length; i++) { //Bucle para recorrer todas las posiciones

            vector[i] = (int) (Math.random() * 6) + 1; //Numero aleatorio entre 1 y 6
        }
        return vector; //Devolvemos el vector
    }

    public static void mostrarVector(int[] vector) { //Metodo para mostrar el resultado
        int i;

        System.out.println("Los numeros aleatorios son: ");
        for (i = 0; i < vector.length; i++) { //Recorremos las posiciones
            System.out.println(vector[i]); //Mostramos cafa una de ellas
        }

    }

}
