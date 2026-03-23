/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Ejercicio6Tema11 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion =0;
        Campania campania = new Campania();
        Donacion donacion = new Donacion();

        LinkedHashSet<Donacion> donaciones = new LinkedHashSet<>(); //Conjunto

        do{
            try {
                menu();
                eleccion = eleccion();
                
                switch (eleccion) {
                
                    case 1 -> añadirDonacion(campania,donacion,donaciones);
                    case 2 -> mostrarDonaciones(campania,donaciones);
                    case 3 -> mostrarPorNombre(campania,donaciones);
                    case 4 -> mostrarNumeroDonaciones(donaciones);
                    case 5 -> mostrarTotalRecaudado(donaciones);
                    case 6 -> ordenarDonaciones(donaciones);
                    case 7 -> {System.out.println("Saliendo...");}
                    default -> {System.out.println("Introduce un valor entre 1 - 7");}
                
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Error: Valor invalido");
            }
        }
        while(eleccion !=7);

    }

    //Método para añadir donaciones
    public static void añadirDonacion(Campania campania, Donacion donacion, LinkedHashSet<Donacion> donaciones) {

        String eleccion;
        String nombre;
        String nombreCampaña;
        int cantidad;
        Scanner entrada = new Scanner(System.in);

        do { //Bucle
            System.out.println("Nombre: ");
             nombre = entrada.nextLine();
             System.out.println("Cantidad : ");
             cantidad = entrada.nextInt();
             entrada.nextLine();
             
            donacion = new Donacion(nombre, cantidad);
            //Creo un objeto de donacion y guardo la informacion

            donaciones.add(donacion);//Asigno el objeto al conjunto

            if (campania.getNombreCampania().isEmpty()) { //Si no hay ninguna camapaña
                
                System.out.println("Nombre Campaña :");
                nombreCampaña = entrada.nextLine();
                campania.setNombreCampania(nombreCampaña);
            }
            donaciones.add(donacion);
            campania.setDonaciones(donaciones);
            
            System.out.println("¿Quieres añadir otra donacion? s/n");

            eleccion = entrada.nextLine();
        } while (eleccion.equalsIgnoreCase("s"));
    }
    
    //Método para mostrar todas las donaciones

    public static void mostrarDonaciones(Campania campania, LinkedHashSet<Donacion> donaciones) {

        for (Donacion donacion : donaciones) {
            System.out.println(donacion.toString());
        }

    }
    //Método para mostrar por nombre
    public static void mostrarPorNombre(Campania campania, LinkedHashSet<Donacion> donaciones) {

        String nombre;
        boolean encontrado = false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre buscado :");
        nombre = entrada.nextLine();

        for (Donacion donacion : donaciones) { //Usamos un for por que puede haber varias personas que se llamen igual, sino utilizariamos un while

            if (donacion.getNombre().equalsIgnoreCase(nombre)) {//Si el nombre buscado lo encontramos

                System.out.println(donacion.toString());
                
                encontrado = true;
            }
        }
        
        if(encontrado == false){ //Si encontrado esta en falso
            System.out.println("No se ha encontrado el nombre "+nombre);
        }

    }
    //Método para mostrar el número total de donaciones
    public static void mostrarNumeroDonaciones(LinkedHashSet<Donacion> donaciones){
    
        int contador = 0;
        
        for(Donacion donacion : donaciones){ //Recorremos las donaciones
        
            contador++;
        }
        
        System.out.println("El número total de donaciones es : "+contador);
    }
    //Método para mostrar el total recaudado
    public static void mostrarTotalRecaudado( LinkedHashSet <Donacion> donaciones){
    
        int total = 0;
        int i = 0;
        
        for(Donacion donacion : donaciones) {//Recorremos las donaciones
        
            total+= donacion.getCantidad(); //Actualizamos el valor
        }
        
        System.out.println("El total recaudado es : "+total);
    }
    
    public static void ordenarDonaciones(LinkedHashSet <Donacion> donaciones) {
    
        Donacion [] aux;
        int mayor = 0;
        
        for(Donacion donacion : donaciones ){
        
            for (Donacion donAux : donaciones) {
            
                if(donAux.getCantidad() > mayor) {
                    mayor = donAux.getCantidad();
                }
            }
            
            
        }
    }

    //Método para mostrar el menú
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir donación");
        System.out.println("2.- Mostrar donaciones");
        System.out.println("3.- Mostrar donaciones por nombre");
        System.out.println("4.- Mostrar número de donaciones");
        System.out.println("5.- Mostrar total dinero recaudado");
        System.out.println("6.- Ordenar donaciones");
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
