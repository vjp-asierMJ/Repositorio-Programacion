/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema12;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Agenda> lista = new ArrayList<>();

        int eleccion = 0;

        do {
            try {
                menu();
                eleccion = pedirInt("");
                switch (eleccion) {
                    case 1 -> insertarContactos(lista);
                    case 2 -> mostrarContactos(lista);
                    case 3 -> eliminarContactos(lista);
                    case 4 -> mostrarContactosOrdenados(lista);
                    case 5 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Introduce un valor entre 1 - 5");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 5);
    }

    //metodo para añadir contactos a la lista
    public static void insertarContactos(ArrayList<Agenda> lista) throws InputMismatchException {

        //añadimos a la lista un objeto con los datos dados por el usuario
        lista.add(new Agenda(pedirString("Nombre: "), pedirInt("Edad: "), pedirInt("Número de móvil: ")));
    }

    //metodo para visualizar la lista
    public static void mostrarContactos(ArrayList<Agenda> lista) {

        if (lista.isEmpty()) { //si esta vacia 
            System.out.println("La lista esta vacia"); //mensaje
        } else {
            for (Agenda a : lista) { //recorremos la lista
                System.out.println(a);
            }
        }
    }

    //metodo para eliminar contactos de una lista
    public static void eliminarContactos(ArrayList<Agenda> lista) throws InputMismatchException {

        boolean encontrado = false;

        int i = 0;

        while (i < lista.size() && encontrado != true) { //mientras que que haya lista y no se encuentre

            if (lista.get(i).getNumero() == pedirInt("Numero: ")) { //si el numero de la lista es igual al numero introducido

                lista.remove(i); //lo borramos

                System.out.println("[v] Numero Eliminado");

                encontrado = true;
            }

            i++;

        }

        if (encontrado == false) { //si no lo encontramos

            System.out.println("[E] Numero no encontrado");
        }
    }

    //metodo para ordenar por edad
    public static void mostrarContactosOrdenados(ArrayList<Agenda> lista) {

        ArrayList<Agenda> listaOrdenada = new ArrayList<>(lista); //creo una nueva lista y le paso la anterior

        listaOrdenada.sort((e1, e2) -> Integer.compare(e1.getEdad(), e2.getEdad())); //comparamos los valores

        System.out.println(listaOrdenada);
    }

    //metodo para pedir un string
    public static String pedirString(String texto) throws InputMismatchException {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        return entrada.nextLine();
    }

    //metodo para pedir un entero
    public static int pedirInt(String texto) throws InputMismatchException{

        int valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextInt();

        entrada.nextLine();

        return valor;
    }

    //metodo para mostrar el menu
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir contactos");
        System.out.println("2.- Visualizar contactos");
        System.out.println("3.- Eliminar contactos");
        System.out.println("4.- Mostrar contactos ordenados por edad");
        System.out.println("5.- Salir");
    }

}
