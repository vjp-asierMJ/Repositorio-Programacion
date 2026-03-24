/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+

        int eleccion = 0;

        ArrayList<Campania> campanias = new ArrayList<>();

        do { //Bucle
            try {//Excepciones
                menu();
                eleccion = eleccion();

                switch (eleccion) {

                    case 1 ->
                        añadirCampaña(campanias);

                    case 2 ->
                        añadirDonacion(campanias);

                    case 3 ->
                        mostrarCampañas(campanias);

                    case 4 ->
                        mostrarPorNombre(campanias);

                    case 5 ->
                        totalRecuadado(campanias);
                        
                    case 6 -> mayorDonacion(campanias);
                        
                    case 7 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {//Opcion por defecto
                        System.out.println("Introduce un valor entre 1 - 7");
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Valor invalido");
            }
        } while (eleccion != 7);//Condicion

    }

    //Metodo para añadir una campaña
    public static void añadirCampaña(ArrayList<Campania> campanias) {

        String nombre;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre Campaña :");

        nombre = entrada.nextLine();

        campanias.add(new Campania(nombre));

    }

    //Metodo para añadir una donacion a una campaña
    public static void añadirDonacion(ArrayList<Campania> campanias) {

        Scanner entrada = new Scanner(System.in);
        Campania campaniaSeleccionada = null;
        String nombre;
        int cantidad;
        int i = 0;
        boolean parar = false;

        // Elegir campaña
        while (campaniaSeleccionada == null) {
            System.out.println("Nombre de la Campaña:");
            String campaniaBuscada = entrada.nextLine();
            boolean encontrado = false;
                   i = 0;//Actualizamos el valor por cada camapaña
                   
            while (i < campanias.size() && !encontrado) { //Mientras que haya valores y no se haya encontrado
                Campania c = campanias.get(i);//Creamos un objeto y guardamos el valor de la lista
                if (c.getNombreCampania().equalsIgnoreCase(campaniaBuscada)) {//Si coincide con el nombre
                    campaniaSeleccionada = c;//Guardamos en la campaniaSeleccionada la actual
                    encontrado = true;
                }
                i++;//Actualizamos el valor
            }

            if (!encontrado) {//Si no se ha encontrado mostramos el mensaje
                System.out.println("Campaña no encontrada. Intente nuevamente.");
            }
        }

        // Añadir donaciones
        while (!parar) {
            System.out.println("Quieres introducir una donación s/n");
            String donar = entrada.nextLine();

            if (donar.equalsIgnoreCase("s")) {
                System.out.println("Nombre del donante: ");
                nombre = entrada.nextLine();
                System.out.println("Cantidad a donar: ");
                cantidad = entrada.nextInt();
                entrada.nextLine(); // Limpiar buffer

                campaniaSeleccionada.getDonaciones().add(new Donacion(nombre, cantidad));
                System.out.println("Donación añadida correctamente.\n");
            } else {
                parar = true;
            }
        }
    }
    //Metodo para mostrar las campañas

    public static void mostrarCampañas(ArrayList<Campania> campanias) {

        for (int i = 0; i < campanias.size(); i++) {//Recorremos la lista

            Campania c = campanias.get(i);//Guardamos cada valor a un objeto

            System.out.println("Campaña : " + c.getNombreCampania() + " Donacion: " + c.getDonaciones());//Lo mostramos
        }
    }

    //Metodo para mostrar campañas por nombre
    public static void mostrarPorNombre(ArrayList<Campania> campanias) {

        boolean parar = false;
        String nombre = "";
        boolean encontrado = false;
        int i = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Campaña/s por el nombre");

        System.out.println("Nombre buscado: ");

        nombre = entrada.nextLine(); //Tomamos el nombre

        while (parar != true && i < campanias.size()) {//Mientras que no se encuentre y queden campañas

            Campania c = campanias.get(i); //Guardamos el valor de la posicion de la lista en un objeto

            if (c.getNombreCampania().equalsIgnoreCase(nombre)) {//Si contiene el nombre

                System.out.println(" Campaña: " + nombre + " " + c.getDonaciones());//Lo mostramos
                encontrado = true;
                parar = true;
            }
            i++;//Actualizamos el valor del bucle

        }

        if (encontrado == false) {//Si no se ha encontrado

            System.out.println("No se ha encontrado la campaña " + nombre);
        }
    }

    //metodo para sumar el total de donaciones
    public static void totalRecuadado(ArrayList<Campania> campanias) {

        int total = 0;

        for (int i = 0; i < campanias.size(); i++) { //Recorremos las campañas

            Campania c = campanias.get(i);

            // Recorremos las donaciones con índice usando ArrayList
            ArrayList<Donacion> listaDonaciones = new ArrayList<>(c.getDonaciones());//La pasamos el conjunto por parametro a una nueva lista,
                                                                                     // entonces esta lista unciamente tiene el conjunto

            for (int j = 0; j < c.getDonaciones().size(); j++) { //Recorremos la lista de donaciones

                total += listaDonaciones.get(j).getCantidad();//Actualizamos el valor
            }
        }

        System.out.println("Total de dinero recuadado: " + total);
    }

    //Metodo para la mayor donacion
    public static void mayorDonacion(ArrayList<Campania> campanias) {

        int mayor = -1;

        for (int i = 0; i < campanias.size(); i++) { //Recorremos la lista

            Campania c = campanias.get(i);//Guardamos cada posicion de la lista en un objeto

            ArrayList<Donacion> listaDonaciones = new ArrayList<>(c.getDonaciones());//La pasamos el conjunto por parametro a una nueva lista,
                                                                                     // entonces esta lista unciamente tiene el conjunto

            for (int j = 0; j < c.getDonaciones().size(); j++) { //Recorremos la lista de donaciones que contiene el conjunto de donaciones

                if (listaDonaciones.get(j).getCantidad() > mayor) {//Si la donacion actual es mayor  a la anterior

                    mayor = listaDonaciones.get(j).getCantidad();
                }
            }
        }

        if (mayor == -1) {//Si no hay donaciones

            System.out.println("No hay ninguna donacion");
        } else {//sino

            System.out.println("La mayor donacion es: " + mayor + " euros");
        }

    }
    //Metodo para mostrar el menu
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir campaña");
        System.out.println("2.- AÑadir donacion");
        System.out.println("3.- Mostrar campañas con donaciones");
        System.out.println("4.- Mostrar campañas por nombre");
        System.out.println("5.- Mostrar total dinero recaudado");
        System.out.println("6.- Mostrar mayor donacion/es");
        System.out.println("7.- Salir");
    }

    //Método para la eleccion del menú
    public static int eleccion() {

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;

    }

}
