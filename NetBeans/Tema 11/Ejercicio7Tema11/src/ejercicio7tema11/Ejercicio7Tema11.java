/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema11;

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
        
        int eleccion;
        
        Campania campania = new Campania();
        
        
         do { //Bucle
            try {//Excepciones
                menu();
                eleccion = eleccion();

                switch (eleccion) {

                    case 1 ->
                        
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
    
    public static void añadirCampaña(Campania campania){
    
    
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
