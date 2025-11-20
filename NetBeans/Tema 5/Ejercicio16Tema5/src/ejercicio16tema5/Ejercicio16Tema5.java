/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        Alumno a1 = crearAlumno(entrada);
        Alumno a2 = crearAlumno(entrada);
        Alumno a3 = crearAlumno(entrada);

        mostrarResultado(a1);
        mostrarResultado(a2);
        mostrarResultado(a3);

    }

    public static Alumno crearAlumno(Scanner entrada) {
        int nota;
        String nombre;
        nota = 0;
        nombre = "";

        try {
            System.out.println("Introduce el nombre");
            nombre = entrada.nextLine();
            System.out.println("Introduce la nota");
            nota = entrada.nextInt();
            
            entrada.nextLine();

            while (10 < nota || nota < 0) {

                System.out.println("Introduce un valor correcto para la nota");
                nota = entrada.nextInt();
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor correcto");
            entrada.next();

        }
        return new Alumno(nombre, nota);
    }

    public static void mostrarResultado(Alumno a) {
        System.out.println(a.toString());
    }

}
