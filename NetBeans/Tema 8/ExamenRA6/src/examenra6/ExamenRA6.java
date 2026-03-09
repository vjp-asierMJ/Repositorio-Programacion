/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenRA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coche[] coche = new Coche[9]; //Objeto

        int eleccion = 0;

        do { //Bucle para el menú

            try { //Control de excepciones

                menu(); //Metodo menú

                eleccion = pedirEleccion(); //Tomamos la eleccion

                switch (eleccion) { //Switch case de elección

                    case 1:

                        aparcarCoche(coche); //Caso 1 rellenamos los coches
                        break;

                    case 2:
                        mostrarPlazasLibres(coche); // Caso 2 mostramos las posciones vacias
                        break;

                    case 3:
                        mostrarDatos(coche); // Caso 3 mostramos los datos de los coches
                        break;

                    case 4:
                        mostrarDatosPorNombre(coche); //Caso 4 mostramosl os datos por nombre
                        break;

                    case 5:
                        buscarMatricula(coche); //Caso 5 buscamos la matricula
                        break;

                    case 6:
                        estadoPlazasGaraje(coche); //Caso 6 mostramos la disposición del garaje
                        break;

                    case 7:
                        System.out.println("Saliendo..."); //Caso 7 salimos
                        break;

                    default:
                        System.out.println("Introduce una opcion entre 1-7"); //Opción por defecto

                }

            } catch (InputMismatchException e) { //Capturamos la excepción

                System.out.println("Valor introducido incorrecto");
            }
        } while (eleccion != 7); //Mientras que la eleccion se diferente a 7
    }

    /**
     * Método para rellenar los coches
     *
     * @param coche
     */
    public static void aparcarCoche(Coche[] coche) {

        String nombre, matricula;
        int posicion;

        int opcion = 0;
        int i = 0; //Variables

        Scanner entrada = new Scanner(System.in);

        do { //Bucle
            try { //Control de excepciones

                System.out.println("Nombre del titular");

                nombre = entrada.nextLine(); // guardamos el nombre

                System.out.println("Matricula del coche");

                matricula = entrada.nextLine(); // guardamos la matrícula

                System.out.println("Introduce la posición que quieres aparcar");

                posicion = entrada.nextInt(); // tomamos la posición en la que se va a guardar el coche

                if (posicion < 0 || posicion > 8) { // comprobamos que la posción sea valida

                    System.out.println("Posición invalida, debe estar entre 0-8");
                }

                if (coche[posicion] == null) {//Si la posción esta vacia

                    coche[i] = new Coche(nombre, matricula); //lo guardamos

                } else {

                    do {

                        System.out.println("Esa posición esta ocupada, introduzca otra");

                        posicion = entrada.nextInt(); // guardamos la posición

                        if (coche[posicion] == null) {

                            coche[i] = new Coche(nombre, matricula);
                        }
                    } while (coche[posicion] != null);
                }

                System.out.println("¿Quieres aparacar otro coche?");
                System.out.println("1.- Sí");
                System.out.println("2.- No");

                opcion = entrada.nextInt();

                entrada.nextLine();

                if (opcion != 1 && opcion != 2) { //Si la opcion no es correcta la volvemos a pedir

                    System.out.println("Opcion incorrecta, 1-2");

                    opcion = entrada.nextInt();
                }

            } catch (InputMismatchException e) { //Excepciones

                System.out.println("Caracter invalido");
            }

        } while (opcion != 2); //

    }

    /**
     * Método para mostrar las plazas que esten libres
     *
     * @param coche
     */
    public static void mostrarPlazasLibres(Coche[] coche) {

        int contador = 0;

        System.out.println("Plaza/s libres");

        for (int i = 0; i < coche.length; i++) { //Recorremos el array

            if (coche[i] == null) { // Si esta vacio

                System.out.println("[" + i + "]"); // lo mostramos

            } else {

                contador++;
            }

        }

        if (contador == 0) { //Si no ha encontrado ninguno vacio
            System.out.println("No hay ninguna plaza vacia"); //mensaje
        }
    }

    /**
     * Método para mostrar los datos de los coches
     *
     * @param coche
     */
    public static void mostrarDatos(Coche[] coche) {

        for (int i = 0; i < coche.length; i++) { //Recorremos el array

            if (coche[i] != null) { //Si los espacios estan ocupados

                System.out.println("Nombre del titular " + coche[i].getNombre()
                        + " matrícula : " + coche[i].getMatricula()); //Mostramos la información
            }
        }
    }

    /**
     * Metodo para mostrar los datos por nombre
     *
     * @param coche
     */
    public static void mostrarDatosPorNombre(Coche[] coche) {

        String texto;

        String[] nombres = new String[9]; //array auxiliar

        int j = 0; // Variable

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un texto");

        texto = entrada.nextLine(); //Tomamos el texto

        for (int i = 0; i < coche.length; i++) {//Bucle para guardar los que comiencen por el texto

            if (coche[i].getNombre().startsWith(texto)) { //Si el nombre empieza por el texto

                nombres[j] = new String(texto); //Lo guardamos en el array auxiliar

            }
        }

        for (int i = 0; i < coche.length; i++) { //Bucle para mostrarlo

            System.out.println(nombres[i] + "#");//Mostramos el nombre 
        }
    }

    /**
     * Método para buscar por una matrícula introducida
     *
     * @param coche
     */
    public static void buscarMatricula(Coche[] coche) {

        String matricula;

        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la matricula que busca");

        matricula = entrada.nextLine(); //Tomamos la matricula

        for (int i = 0; i < coche.length; i++) { //Recorremos el array

            if (coche[i].getMatricula().equalsIgnoreCase(matricula)) { //Si la matricula introducida coincide con una 

                System.out.println("Nombre del propietario " + coche[i].getNombre() + " matrícula : "
                        + coche[i].getMatricula() + " se encuentra en la posición : " + i); //Lo mostramos

                contador++; //Actualizamos el contador
            }
        }

        if (contador == 0) { //Si no ha encontrado ninguna matricula

            System.out.println("No se ha encontrado la matrícula buscada"); // mensaje
        }

    }

    /**
     * Mostrar el estado del garaje
     *
     * @param coche
     */
    public static void estadoPlazasGaraje(Coche[] coche) {

        String[][] plazas = new String[3][3]; //Matriz para las plazas

        String ocupado = "X";

        String libre = "L"; //Variables

        int contador = 0;

        for (int i = 0; i < plazas.length; i++) { //Recorremos las filas

            for (int j = 0; j < plazas[i].length; j++) { //Recorremos las columnas

                if (coche[contador] == null) {//Comprobamos cada poscion

                    plazas[i][j] = new String(libre);
                } else {

                    plazas[i][j] = new String(ocupado);
                }

                contador++;//Actualizamos el valor para las plazas
            }

        }
        //Bucle para mostrar la disposicion

        for (int i = 0; i < plazas.length; i++) { //Filas

            for (int j = 0; j < plazas[i].length; j++) {//Columnas

                System.out.print("[" + plazas[i][j] + "]");
            }
        }
    }

    /**
     * Método para mostrar el menú
     */
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Aparacar coche");
        System.out.println("2.- Mostrar plazas");
        System.out.println("3.- Mostrar datos de los coches aparcados");
        System.out.println("4.- Mostrar datos por texto");
        System.out.println("5.- Buscar por matrícula");
        System.out.println("6.- Mostrar plazas en forma de matriz");
        System.out.println("7.- Salir");
    }

    /**
     * Metodo para tomar la elección
     *
     * @return eleccion
     */
    public static int pedirEleccion() {

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }

}
