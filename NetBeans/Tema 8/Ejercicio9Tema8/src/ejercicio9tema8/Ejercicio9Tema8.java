/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio9Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nombreAlumnos = {"Pepe", "Juan", "Marta"}; //Array auxiliar
        Alumno[] alumnos = new Alumno[3]; //Objeto

        int eleccion = 0;

        do { //Bucle para el menu

            try {

                mostrarMenu(); //Menu
                eleccion = eleccion();

                switch (eleccion) { //Switch case para el menu

                    case 1:
                        rellenar(alumnos, nombreAlumnos); //Caso 1 rellenar el array
                        break;
                    case 2:
                        mostrar(alumnos); // Caso 2 mostrarlo
                        break;

                    case 3:

                        mejorAlumno(alumnos); //Caso 3 el mejor alumno
                        break;

                    case 4:

                        peorAlumno(alumnos); //Caso 4 el peor alumno
                        break;

                    case 5:

                        asignaturaMasDificil(alumnos); //Caso 5 peor asignatura
                        break;

                    case 6:

                        System.out.println("Saliendo...."); //Opcion 6 salir
                        break;

                    default: //Opcion por defecto

                        System.out.println("Introduce una opcion entre 1 - 6");
                }
            } catch (InputMismatchException e) { //Control de excepciones

                System.out.println("Error " + e);
            }
        } while (eleccion != 6);//Condicion del bucle    

    }

    public static void rellenar(Alumno[] alumnos, String[] nombreAlumnos) { //Metodo rellenar

        for (int i = 0; i < alumnos.length; i++) {//Recorremos el array

            alumnos[i] = new Alumno(nombreAlumnos[i]);//Vamos creando objetos
            alumnos[i].rellenarNotas();//Llamamos al metodo de alumno
        }
    }

    public static void mostrar(Alumno[] alumnos) { //Mostramos el array

        for (Alumno alumno : alumnos) {//Recorremos

            System.out.println(alumno);//Mostramos el alumno
        }
    }

    public static void mejorAlumno(Alumno[] alumnos) {//Metodo para mejor media

        Alumno mejorAlumno = new Alumno();//Creamos un objeto para guardar el mejor alumno
        float mejorMedia = 0;

        for (int i = 0; i < alumnos.length; i++) {//Recorremos el array

            if (alumnos[i].calcularMedia() > mejorMedia) {//Si la media actual es mejor a la anterior

                mejorMedia = alumnos[i].calcularMedia();//La asignamos
                mejorAlumno = alumnos[i];//Guardamos el nombre en el objeto
            }
        }

        System.out.println("El mejor alumno es " + mejorAlumno + " con una media de " + mejorMedia);
    }

    //Alumno con mas suspensos
    public static void peorAlumno(Alumno[] alumnos) {

        int i = 0;
        int j = 0;
        int contador = 0;
        int suspensos = 0;
        String peorAlumno = "";
        for (i = 0; i < alumnos.length; i++) { //Recorremos cada alumno

            contador = 0; //Reinciamos el contador

            for (j = 0; j < alumnos[i].getNotas().length; j++) {//Recorremos las notas

                if (alumnos[i].getNotas()[j].getNota() < 5) { //Si la nota es suspensa

                    contador++; //Sumamos 1 al contador
                }

                if (contador > suspensos) { //Si el valor actual de suspensos es mayor al anterior

                    suspensos = contador; //Los cambiamos

                    peorAlumno = alumnos[i].getNombre(); //Guardamos el nombre del alumno
                }
            }
        }

        System.out.println("El alumno con mas suspensos es " + peorAlumno + " con " + suspensos + " suspensos");

    }

    //Asignatura mas dificil
    public static void asignaturaMasDificil(Alumno[] alumnos) {

        float media = 0;
        float suma = 0;
        float peor = 10;
        String nombrePeor = "";

        for (int j = 0; j < alumnos[0].getNotas().length; j++) {//Recorremos los alumnos

            suma = 0;

            for (int i = 0; i < alumnos.length; i++) { //Recorremos cada asignatura

                //Calcular media de asignatura sumando la de los alumnos y dividiendo entre 4
                suma += alumnos[i].getNotas()[j].getNota();//Actualizamos el valor de la suma
            }
            media = suma / alumnos.length;//Hacemos la media

            if (media < peor) {//Si la media es menor a la nota peor

                peor = media;//La guardamos

                nombrePeor = alumnos[0].getNotas()[j].getNombre();//Guardamos el nombre de la asignatura

            }

        }

        System.out.println("La peor nota es la de " + nombrePeor + " con una media de " + peor);

        //Comparto para encotrnar la mas dificil
    }

    public static int eleccion() { //Metodo para la opcion del menu
        int eleccion;
        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;//Devolvemos la opcion
    }

    public static void mostrarMenu() {//Metodo para mostrar el menu

        System.out.println("========= MENU =========");
        System.out.println("1.- Rellenar Notas");
        System.out.println("2.- Mostrar Notas");
        System.out.println("3.- Mejor alumno");
        System.out.println("4.- Peor alumno");
        System.out.println("5.- Asignatura mas dificil");
        System.out.println("6.- Salir");
    }

}
