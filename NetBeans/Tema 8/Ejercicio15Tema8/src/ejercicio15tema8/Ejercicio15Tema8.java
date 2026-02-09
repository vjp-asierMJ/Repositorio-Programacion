/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema8;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero = 0;

        numero = numeroPeliculas();

        Pelicula[] pelicula = new Pelicula[numero];
//        Socio[] socio = new Socio[4];

        int eleccion = 0;

        do {
            mostrarMenu();
            eleccion = eleccion();
            try {

                switch (eleccion) {

                    case 1:
                        rellenarPeliculas(pelicula);
                        break;

                    case 2:
                        mostrarPeliculas(pelicula);
                        break;

                    case 3:
                        peliculaMasRentable(pelicula);
                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:

                        break;

                    case 7:
                        System.out.println("Saliendo....");
                        break;

                    default:

                        System.out.println("Introduce una opcion entre 1 - 7");
                }
            } catch (InputMismatchException e) {

                System.out.println("Valor incorrecto");
            }
        } while (eleccion != 7);

    }

    public static int numeroPeliculas() {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas peliculas quieres hacer");

        numero = entrada.nextInt();

        return numero;
    }

    public static void rellenarPeliculas(Pelicula[] pelicula) {

        int i;
        int j;
        String titulo;
        int coste;
        String nombreSocio;
        int precioAbonado;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < pelicula.length; i++) {

            System.out.println("Nombre de la pelicula");

            titulo = entrada.nextLine();

            System.out.println("Coste de licencia");

            coste = entrada.nextInt();
            
            entrada.nextLine();

            pelicula[i] = new Pelicula(titulo, coste); //Rellenamos los valores

            for (j = 0; j < pelicula[i].getSocio().length; j++) {
                System.out.println("Nombre socio");

            nombreSocio = entrada.nextLine();

            System.out.println("Precio abonado");
            precioAbonado = entrada.nextInt();
            entrada.nextLine();

            pelicula[i].getSocio()[j] = new Socio(nombreSocio, precioAbonado);
            }
        }
    }

    public static void mostrarPeliculas(Pelicula[] pelicula) {

        int i;

        for (i = 0; i < pelicula.length; i++) {

            System.out.println(pelicula[i]);
        }
    }

    public static void peliculaMasRentable(Pelicula[] pelicula) {

        int i;
        int suma = 0;

        for (int j = 0; j < pelicula[0].getSocio().length; j++) {
            suma += pelicula[0].getSocio()[j].getPrecioAbonado();
        }

        int mayorBeneficio = suma - pelicula[0].getCosteLicencia();
        String titulo = pelicula[0].getTitulo();

        for (i = 1; i < pelicula.length; i++) {

            suma = 0;
            for (int j = 0; j < pelicula[i].getSocio().length; j++) {
                suma += pelicula[i].getSocio()[j].getPrecioAbonado();
            }

            int beneficio = suma - pelicula[i].getCosteLicencia();

            if (beneficio > mayorBeneficio) {
                mayorBeneficio = beneficio;
                titulo = pelicula[i].getTitulo();
            }
        }

        System.out.println("La peliculas mas rentable es " + titulo + " con un precio de " + mayorBeneficio + " euros");

    }
    
    

    public static int eleccion() {

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("");

        eleccion = entrada.nextInt();

        return eleccion;
    }

    public static void mostrarMenu() {

        System.out.println("========= MENU =========");
        System.out.println("1.- Rellenar Peliculas");
        System.out.println("2.- Mostrar peliculas");
        System.out.println("3.- Mostrar pelicula mas rentable");
        System.out.println("4.- Mostrar peliculas menos rentable");
        System.out.println("5.- Pedir nombre de peliculas y informacion");
        System.out.println("6.- Numero de socios con cantidad mayor a la pedida");
        System.out.println("7.- Salir");

    }

}
