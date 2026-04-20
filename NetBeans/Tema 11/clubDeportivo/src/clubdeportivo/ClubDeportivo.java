/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubdeportivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ClubDeportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Deporte> deportes = new ArrayList<>(); //lista de deportes
        int eleccion = 0;

        do {// bucle para el menú

            try {//control de excepciones
                menu(); //menú

                eleccion = pedirInt(""); //pedimos la eleccion

                switch (eleccion) { //switch case de la elección

                    case 1 ->
                        insertarDeporte(deportes);
                    case 2 ->
                        mostrarDeportesYEquipos(deportes);
                    case 3 ->
                        buscarEquipoPorNombre(deportes);
                    case 4 ->
                        mostrarMapaEquipos(deportes);
                    case 5 ->
                        equiposPorTrofeos(deportes);
                    case 6 -> {
                        System.out.println("Saliendo...");
                    }

                    default -> {//opción por defecto
                        System.out.println("Introduce una opcion entre 1 - 6");
                    }
                }
            } catch (InputMismatchException e) { //excepciones

                System.out.println("Error: Valor incorrecto");
            }
        } while (eleccion != 6); //condición del bucle

    }

    //método para añadir un deporte
    public static void insertarDeporte(ArrayList<Deporte> deportes) {

        HashSet<Equipo> equipos = new HashSet<>(); //creo un conjunto de equipo

        String nombreDeporte = pedirString("Nombre del Deporte: "); //pido el nombre del deporte

        String seguir;

        do {
            //creo un objeto de equipo
            Equipo e = new Equipo(pedirInt("Codigo de equipo: "), pedirString("Nombre del equipo: "), pedirInt("Trofeos del equipo: "));

            //lo añado al conjunto
            equipos.add(e);

            //creo un objeto de deporte con el nombre y el conjunto de equipos
            Deporte d = new Deporte(nombreDeporte, equipos);

            //añado el objeto al conjunto de deportes
            deportes.add(d);

            seguir = pedirString("¿Seguir? s/n"); //pido seguir

        } while (seguir.equalsIgnoreCase("s"));

    }

    //método para mostrar los deportes y equipos
    public static void mostrarDeportesYEquipos(ArrayList<Deporte> deportes) {

        if (deportes.isEmpty()) {//si está vacio mostramos el mensaje

            System.out.println("No hay ningun equipo ni deporte");
        } else {

            for (Deporte d : deportes) { //recorremos los deportes

                System.out.println(d);
            }
        }

    }

    //método para buscar un equipo y mostrar el deporte que hace
    // lo hacemos con un for ya que pueden existir varios equipos con el mismo nombre en diferentes deportes
    public static void buscarEquipoPorNombre(ArrayList<Deporte> deportes) {

        String nombre = pedirString("Nombre del Equipo: "); //pedimos el nombre

        boolean encontrado = false;

        for (Deporte d : deportes) { //recorremos los deportes

            for (Equipo e : d.getEquipos()) { //recorremos los equipos

                if (e.getNombreEquipo().equalsIgnoreCase(nombre)) { //si el nombre coincide

                    System.out.println("El equipo " + nombre + " realiza el deporte de: " + d.getNombre()); //lo mostramos

                    encontrado = true; //encontrado pasa a true
                }

            }
        }

        if (encontrado == false) {//si no lo encuentra

            System.out.println("No se ha encontrado el equipo " + nombre);
        }
    }

    //método para mostrar un mapa de los equipos
    public static void mostrarMapaEquipos(ArrayList<Deporte> deportes) {

        HashMap<Integer, String> mapaEquipos = new HashMap<>(); //creamos el mapa
        int cod; //variable

        if (deportes.isEmpty()) {//si esta vacio mostramos el mensaje

            System.out.println("No hay ningún equipo con más de 3 trofeos ganados");
        } else {

            for (Deporte d : deportes) { //recorremos los deportes

                for (Equipo e : d.getEquipos()) {//recorremos los equipos

                    if (e.getTrofeos() > 3) { //si el equipo tiene mas de 3 trofeos

                        mapaEquipos.put(e.getCodigoEquipo(), e.getNombreEquipo()); //guardamos el código y el nombre del equipo en el mapa
                    }
                }
            }

            Iterator<Integer> it = mapaEquipos.keySet().iterator(); //creamos un iterador para el mapa

            while (it.hasNext()) {//mientras existan valores

                cod = it.next(); //guardamos el valor

                System.out.println("Código: " + mapaEquipos.keySet() + " Nombre : " + mapaEquipos.get(cod)); //lo mostramos
            }

        }
    }

    //método para ordenar los equipos por trofeos
    public static void equiposPorTrofeos(ArrayList<Deporte> deportes) {

        ArrayList<Equipo> equiposOrdenados = new ArrayList<>(); //creo una lista de equipos

        if (deportes.isEmpty()) {//si está vacio mostramos el mensaje

            System.out.println("No hay equipos introducidos");
        } else {

            for (Deporte d : deportes) { //recorro los deportes

                for (Equipo e : d.getEquipos()) { //recorro los equipos de cada deporte

                    equiposOrdenados.add(e); //añado el equipo a la lista
                }

                equiposOrdenados.sort((e1, e2) -> Integer.compare(e2.getTrofeos(), e1.getTrofeos())); //ordeno la lista por cantida de trofeos
            }

            System.out.println(equiposOrdenados); //muestro la lista

        }
    }
    //método para mostrar el menú

    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir deporte");
        System.out.println("2.- Mostrar deportes y equipos");
        System.out.println("3.- Buscar equipo en deporte");
        System.out.println("4.- Mostrar mapa de equipos");
        System.out.println("5.- Mostrar equipos de todos los deportes ordenados por trofeos");
        System.out.println("6.- Salir");
    }

    //método para pedir un string
    public static String pedirString(String texto) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        return entrada.nextLine();
    }

    //método para pedir un entero
    public static int pedirInt(String texto) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        int valor = entrada.nextInt();

        entrada.nextLine();

        return valor;

    }

}
