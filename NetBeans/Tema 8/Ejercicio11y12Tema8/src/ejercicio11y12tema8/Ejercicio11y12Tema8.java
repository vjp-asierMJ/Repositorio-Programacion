/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12tema8;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11y12Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int eleccion = 0;

        Muebles[] mueble = new Muebles[4]; //Objeto

        do { //Menu

            try { //Control de excepciones

                mostrarMenu(); //Mostramos el menu
                eleccion = pedirEleccion(); //Tomamos la eleccion

                switch (eleccion) { //Switch con la eleccion

                    case 1:
                        rellenarVector(mueble); //Caso 1 rellenamos

                        break;

                    case 2:
                        mostrarVector(mueble); //Caso 2 mostramos el objeto
                        break;
                    case 3:

                        mostrarPorPrecio(mueble); //Caso 3 mostramos el objeto filtrando por el precio
                        break;
                    case 4:

                        System.out.println("Saliendo...."); // Caso 4 salimos
                        break;

                    default:
                        System.out.println("Introduce una eleccion valida"); //Opcion por defecto

                }
            } catch (InputMismatchException e) { //Control de excepciones

                System.out.println("Error " + e);
            }
        } while (eleccion != 4); //Condicion del bucle
    }

    public static void rellenarVector(Muebles[] mueble) { //Metodo para rellenar el objeto

        int i;
        int precio;
        String descripcion; //Variables
        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < mueble.length; i++) { //Recorremos el array
            System.out.println("Mueble " + (i + 1));
            System.out.println("1.- Precio : ");
            precio = entrada.nextInt(); //Tomamos el precio
            entrada.nextLine();
            System.out.println("2.- Descripcion :");
            descripcion = entrada.nextLine(); //Tamomos la descripcion
            mueble[i] = new Muebles(precio, descripcion); //Asignamos valores al objeto

        }
    }

    public static void mostrarVector(Muebles[] mueble) { //Metodo para mostrar el array

        int i;

        for (i = 0; i < mueble.length; i++) { //Lo recorremos y lo mostramos

            System.out.println((i + 1) + " .- " + " Precio: " + mueble[i].getPrecio() + " | Descripcion : " + mueble[i].getDescripcion());
        }

    }

    public static void mostrarPorPrecio(Muebles[] mueble) { //Metodo para filtrar por precio

        int i;
        int precio; //Variables
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el precion del mueble que buscas");

        precio = entrada.nextInt(); //Recogemos el precio

        for (i = 0; i < mueble.length; i++) { //Recorremos el array

            if (mueble[i].getPrecio() <= precio) { //Si el precio del array es menor al insertado
                                                    //Lo mostramos

                System.out.println((i + 1) + " .- Precio : " + mueble[i].getPrecio() + " | Descripcion : " + mueble[i].getDescripcion());

            } else { //Sino 

                System.out.println("No existe ningun mueble por el precio de " + precio + " euros ");
            }
        }
    }

    public static int pedirEleccion() { //Metodo para tomar la eleccion para el menu

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion; //Devolvemos la eleccion
    }

    public static void mostrarMenu() { //Metodo para mostrar el menu

        System.out.println("========= MENU ==========");
        System.out.println("1.- Rellenar muebles");
        System.out.println("2.- Mostrar muebles");
        System.out.println("3.- Mostrar muebles por precio");
        System.out.println("4.- Salir");
    }

}
