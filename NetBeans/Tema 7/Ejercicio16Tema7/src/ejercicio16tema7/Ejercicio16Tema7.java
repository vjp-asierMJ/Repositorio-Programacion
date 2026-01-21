/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema7;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] array = new int[6][4];

        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};

        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};

        int eleccion = 0;
        do {

            mostrarMenu();

            eleccion = pedirEleccion();

            switch (eleccion) {

                case 1:

                    rellenarArray(array, alumnos, asignaturas);

                    break;

                case 2:
                    mostrarArray(array, alumnos, asignaturas);

                    break;

                case 3:
                    mejorMedia(array, alumnos, asignaturas);
                    break;

                case 4:
                    alumnoMasSuspensos(array, alumnos, asignaturas);
                    break;

                case 5:
                    peorAsignatura(array, alumnos, asignaturas);
                    break;

                case 6:

                    System.out.println("Saliendo....");

                    break;

                default:

                    System.out.println("Introduce una opcion valida");

            }
        } while (eleccion != 6);

    }

    public static void rellenarArray(int[][] array, String[] alumnos, String[] asignaturas) {

        int i, j;
        int nota;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < array.length; i++) {
            System.out.println("Alumno: " + alumnos[i]);
            for (j = 0; j < array[0].length; j++) {

                System.out.println("Asignatura : " + asignaturas[j]);

                nota = entrada.nextInt();

                array[i][j] = nota;

            }
        }

    }

    public static void mostrarArray(int[][] array, String[] alumnos, String[] asignaturas) {

        int i, j;

        for (i = 0; i < array.length; i++) {

            for (j = 0; j < array[0].length; j++) {

                System.out.println("Asignatura : " + asignaturas[j] + ", alumno " + alumnos[i] + ", nota : " + array[i][j]);

            }
        }
    }

    public static void mejorMedia(int[][] array, String[] alumnos, String[] asignaturas) {

        int i, j;

        float mayorMedia = array[0][0];
        float media;
        int alumno = 0;
        float suma = 0;

        for (i = 0; i < array.length; i++) {

            suma = 0;

            for (j = 0; j < array[0].length; j++) {

                suma = suma + array[i][j];

            }

            media = suma / array[i].length;

            if (media > mayorMedia) {

                mayorMedia = media;

                alumno = i;

            }

        }

        System.out.println("Alumno con mejor media: " + alumnos[alumno] + " : " + mayorMedia);

    }
    
    
    public static void alumnoMasSuspensos(int[][] array, String[] alumnos, String[] asignaturas){
    
        int i,j;
        int suspenso = 0;
        int maxSuspenso = -1;
        int contador=0;
        int alumno = 0;
    
        for(i=0;i<array.length;i++) {
            
            contador=0;
        
            for(j=0;j<array[0].length;j++) {
            
                if(array[i][j]<5) {
                    contador++;
                }
            }
            
            if(contador>maxSuspenso){
            
                maxSuspenso = contador;
                
                alumno = i;
            }
        }
        System.out.println("El alumno con mas suspensos es "+alumnos[alumno]+ " con un total de "+maxSuspenso+" suspenos");
    
    }
    
    
    public static void peorAsignatura(int[][]array, String[]alumnos, String[]asignaturas){
    
     int i,j;
        int maxSuspenso = -1;
        int contador=0;
        int asignatura = 0;
    
        for(j=0;j<array[0].length;j++) {
            
            contador = 0;
        
            for(i=0;i<array.length;i++) {
            
                if(array[i][j]<5) {
                    contador++;
                }
            }
            
            if(contador>maxSuspenso){
            
                maxSuspenso = contador;
                
                asignatura = j;
            }
        }
        
        System.out.println("La asignatura mas dificil es : "+asignaturas[asignatura]+ " con un total de : "+maxSuspenso + " suspensos");
    
    }
    
    
    
    
    public static void mostrarMenu() {

        System.out.println("========== MENU ==========");
        System.out.println("1.- Rellenar Notas");
        System.out.println("2.- Mostrar Notas");
        System.out.println("3.- Media mas Alta");
        System.out.println("4.- Alumno con mas Suspensos");
        System.out.println("5.- Asignatura mas dificil");
        System.out.println("6.- Salir del programa");
        System.out.println("==========================");
    }

    public static int pedirEleccion() {

        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("");
            eleccion = entrada.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Introduce un valor correcto");
        }

        return eleccion;
    }
}
