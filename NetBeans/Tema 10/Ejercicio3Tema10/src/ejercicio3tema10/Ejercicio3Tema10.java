/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tema10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio3Tema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList<>(); //Lista

        rellenarLista(numeros);
        mostrarLista(numeros);
        mostrarListaDesordenada(numeros); //Metodos
    }

    public static void rellenarLista(ArrayList<Integer> numeros) {

        int numero;
        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        try { //Excepciones
            do { //Bucle

                System.out.println("Introduce un numero");

                numero = entrada.nextInt();

                numeros.add(numero); //Tomamos el numero

                System.out.println("Desea introducir otro numero");
                System.out.println("1.- Si");
                System.out.println("2.- No"); //Pedimos si quiere seguir con el programa

                eleccion = entrada.nextInt();

                if (eleccion != 1 && eleccion != 2) { //Comprobamos que la eleccion este entre 1 y 2

                    System.out.println("Introduce un valor correcto");
                    eleccion = entrada.nextInt();
                }

            } while (eleccion != 2); //Condicion del bucle
            
        } catch (InputMismatchException e) {//Excepcion
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {//Excepcion
            System.out.println(e);
        }
    }

    public static void mostrarLista(ArrayList<Integer> numeros) {//Metodo para mostrar la lista

        int i;

        System.out.println("==========  LISTA ORIGINAL =========");

        for (i = 0; i < numeros.size(); i++) { //Recorremos la lista

            System.out.println((i + 1) + " .- " + numeros.get(i));
        }
    }

    public static void mostrarListaDesordenada(ArrayList<Integer> numeros) { //Metodo para mostrar la lista desordenada

        int i;

        int aux;

        System.out.println("========== LISTA DESORDENADA =========");

        if (numeros.size() >= 4) { //Si la lista tiene mas de 4 valores

            aux = numeros.get(1); //Guardamos el valor  de la posicion 2 en aux
            numeros.set(1, numeros.get(3)); //asignamos a la posicion 2 el valor de la posicion 4
            numeros.set(3, aux); //asignamos a la poscicion 4 el valor de la 2

            for (i = 0; i < numeros.size(); i++) {

                System.out.println(numeros.get(i)); //Recorremos la lista
            }
        } else {
            System.out.println("No tiene el tamaño suficiente para intercambiar posiciones");
        }

    }

}
