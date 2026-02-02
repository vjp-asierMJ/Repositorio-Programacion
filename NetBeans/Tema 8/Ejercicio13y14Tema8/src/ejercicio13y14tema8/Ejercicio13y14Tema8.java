/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13y14tema8;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio13y14Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion = 0;
        Alumno[] alumno = new Alumno[5];
         do { //Menu

            try { //Control de excepciones

                mostrarMenu(); //Mostramos el menu
                eleccion = pedirEleccion(); //Tomamos la eleccion

                switch (eleccion) { //Switch con la eleccion

                    case 1:
                        rellenarVector(alumno); //Caso 1 rellenamos

                        break;

                    case 2:
                        mostrarVector(alumno); //Caso 2 mostramos el objeto
                        break;
                    case 3:

                        mostrarPorPrecio(alumno); //Caso 3 mostramos el objeto filtrando por el precio
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
        }
        while (eleccion != 4); //Condicion del bucle
    }
    
    public static void rellenarVector(Alumno[] alumno){
    
        int i;
        int posicion = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for(i=0;i<alumno.length;i++){
        
            System.out.println("Introduce que posicion quieres guardar el alumno");

            posicion = entrada.nextInt();
            
         
            
            System.out.println("Alumno "+(i+1));
            
            
               alumno[posicion] = new Alumno();
            
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
