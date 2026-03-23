/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
        
        Campania campania = new Campania();
        
        Donacion donacion = new Donacion();
        
        LinkedHashSet<Donacion> donaciones = new LinkedHashSet<>(); //Conjunto
        
        ArrayList<Campania> campanias = new ArrayList<>();
        
         do { //Bucle
            try {//Excepciones
                menu();
                eleccion = eleccion();

                switch (eleccion) {

                    case 1 -> añadirCampaña(campania);
                        
                    case 2 ->
                        
                    case 3 ->
                        
                    case 4 ->
                        
                    case 5 ->
                        
                    case 6 ->
                        
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
    
    public static void añadirCampaña(Campania campania){
    
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre Campaña :");
        
        nombre = entrada.nextLine();
        
        campania = new Campania(nombre);
        
    }
    
    //Metodo para añadir una donacion a una campaña
    public static void añadirDonacion(Campania campania,LinkedHashSet<Donacion> donaciones,ArrayList<Campania> campanias){
    
    Campania campaniaSeleccionada = null;
    Scanner entrada = new Scanner(System.in);

    // Mientras no encontremos la campaña
    while (campaniaSeleccionada == null) {
        
        
        System.out.println("Nombre de la Campaña:");
        String campaniaBuscada = entrada.nextLine();

        // Iterador para recorrer la lista
        Iterator<Campania> it = campanias.iterator();
        boolean encontrado = false;

        while (it.hasNext() && !encontrado) {
            Campania c = it.next();
            if (c.getNombreCampania().equalsIgnoreCase(campaniaBuscada)) {
                campaniaSeleccionada = c;
                encontrado = true; // Señalamos que encontramos la campaña
            }
        }

        if (!encontrado) {
            System.out.println("Campaña no encontrada. Intente nuevamente.");
        }
    }
    
    }
    
    
    
    
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
