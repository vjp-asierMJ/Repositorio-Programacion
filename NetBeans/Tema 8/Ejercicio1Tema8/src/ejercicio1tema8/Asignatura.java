/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema8;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Asignatura {

    private String nombre;
    private int nota;

    //Constructores
    public Asignatura() {

        this.nombre = "";
        this.nota = 0;
    }

    public Asignatura(String nombre, int nota) {

        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters y Setters
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return this.nombre;
    }

    public void setNota(int nota) {

        this.nota = nota;
    }

    public int getNota() {

        return this.nota;
    }

    //Metodos
    public static int pedirNota() {

        int notas = 0;

        do { //Bucle para que meta un valor entre 0 y 10

            try { //Control de excepciones
                Scanner entrada = new Scanner(System.in);
                System.out.println("");

                notas = entrada.nextInt();

            } catch (InputMismatchException e) {

                System.out.println("Introduce un valor del 1 al 10");
                
            }
        } while (notas < 0 || notas > 10); //Mentras que sea entre 0 y 10

        return notas;

    }

    //To string
    @Override

    public String toString() {

        return " Nombre: " + this.nombre
                + " | Nota: " + this.nota;
    }
}
