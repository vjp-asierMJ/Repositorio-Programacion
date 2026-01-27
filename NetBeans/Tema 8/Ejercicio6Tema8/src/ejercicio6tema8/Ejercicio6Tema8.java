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
        
        //Metodos
        
        rellenarEmpleados(empleado);
        mostrarEmpleados(empleado);
    }
    
    
    public static int numeroEmpleados(){
        int eleccion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuantos empleados desea introducir?");
        eleccion = entrada.nextInt();
        
        return eleccion;
        
    }
    
    public static void rellenarEmpleados(Empleados[] empleado){
    
        int i;
        Scanner entrada = new Scanner(System.in);
        for(i=0;i<empleado.length;i++){
            
            entrada.nextLine();
            
            System.out.println("Introduzca el nombre del empleado " + (i + 1) + ":");
            String nombre = entrada.nextLine();

            System.out.println("¿Cuántas horas trabajó este mes?");
            int horas = entrada.nextInt();

            System.out.println("¿Cuál es la tarifa por hora de trabajo?");
            int tarifa = entrada.nextInt();
            
            
            
            
//            empleado[i] = new Empleados(nombre,horas,tarifa);
        }
        
    }
    
    public static void mostrarEmpleados(Empleados[] empleado){
    
        int i;
        
        for(i=0;i<empleado.length;i++){
        
            System.out.println(nombre+" trabajo"+ Empleados.get + " horas, cobra "+tarifa+" euros la hora, por lo que le corresponde un sueldo de "+Empleados.tarifaPorHoras(horas, tarifa));
        }
    
    }
    

    
    
    
}
