/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio6Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int eleccion;
        eleccion = numeroEmpleados();
        
        Empleados[] empleado = new Empleados[eleccion];
    }
    
    
    public static int numeroEmpleados(){
        int eleccion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuantos empleados desea introducir?");
        eleccion = entrada.nextInt();
        
        return eleccion;
        
    }
    
}
