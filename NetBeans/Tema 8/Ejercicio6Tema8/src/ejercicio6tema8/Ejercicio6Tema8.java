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

        Empleados[] empleado = new Empleados[eleccion]; //Objeto

        //Metodos
        rellenarEmpleados(empleado);
        mostrarEmpleados(empleado);
    }

    public static int numeroEmpleados() { //Metodo para el tamaño del array
        int eleccion;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos empleados desea introducir?");
        eleccion = entrada.nextInt(); //Tomamos el tamaño

        return eleccion; //Lo devolvemos

    }

    public static void rellenarEmpleados(Empleados[] empleado) { //Metodo para rellenar el array

        int i;
        Scanner entrada = new Scanner(System.in);
        for (i = 0; i < empleado.length; i++) { //Lo recorremos

            System.out.println("Introduzca el nombre del empleado " + (i + 1) + ":");
            String nombre = entrada.nextLine(); // Tomamos los valores

            System.out.println("Cuantas horas trabajo este mes?");
            int horas = entrada.nextInt(); // Tomamos los valores

            System.out.println("Cual es la tarifa por hora de trabajo?");
            int tarifa = entrada.nextInt(); // Tomamos los valores

            empleado[i] = new Empleados(nombre, horas, tarifa); //Los asignamos a cada posicion del objeto
            
            entrada.nextLine(); // Ponemos el scanner en Line para evitar posibles errores
        }

    }

    public static void mostrarEmpleados(Empleados[] empleado) { //Metodo para mostrar el array

        int i;

        for (i = 0; i < empleado.length; i++) { //Lo recorremos

            System.out.println(empleado[i].getNombre() + " trabajo " + empleado[i].getNumeroHoras() + " horas , cobra " 
                    + empleado[i].getTarifa() + " euros la hora, por lo que le corresponde un sueldo de " 
                    + Empleados.tarifaPorHoras(empleado[i].getNumeroHoras(), empleado[i].getTarifa()));
        }

    }

}
