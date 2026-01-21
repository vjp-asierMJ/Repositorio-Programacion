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

        int[][] matriz = new int[6][4]; //Matriz

        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"}; //Array

        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"}; //Array

        int eleccion = 0;
        do { //Bucle para el menu

            mostrarMenu();

            eleccion = pedirEleccion(); //Tomamos la eleccion

            switch (eleccion) { //Switch case de la eleccion

                case 1:

                    rellenarArray(matriz, alumnos, asignaturas); //Caso 1 rellenar la matriz

                    break;

                case 2:
                    mostrarArray(matriz, alumnos, asignaturas); // Caso 2 mostrar matriz

                    break;

                case 3:
                    mejorMedia(matriz, alumnos, asignaturas); //Caso3 mostrar la mejor media
                    break;

                case 4:
                    alumnoMasSuspensos(matriz, alumnos, asignaturas); //Caso 4 alumno con mas suspensos
                    break;

                case 5:
                    peorAsignatura(matriz, alumnos, asignaturas); //Caso 5 asignatura con mas suspensos
                    break;

                case 6:

                    System.out.println("Saliendo...."); //Caso 6 salir del programa

                    break;

                default:

                    System.out.println("Introduce una opcion valida"); //Opcion por defecto

            }
        } while (eleccion != 6); //Condicion del bucle

    }

    public static void rellenarArray(int[][] matriz, String[] alumnos, String[] asignaturas) { //Rellenar la matriz

        int i, j;
        int nota;

        Scanner entrada = new Scanner(System.in); //Scanner

        for (i = 0; i < matriz.length; i++) { //Filas 
            System.out.println("Alumno: " + alumnos[i]);
            for (j = 0; j < matriz[0].length; j++) { //Columnas

                System.out.println("Asignatura : " + asignaturas[j]);

                nota = entrada.nextInt();

                matriz[i][j] = nota; //Rellenamos cada posicion con el valor del usuario

            }
        }

    }

    public static void mostrarArray(int[][] matriz, String[] alumnos, String[] asignaturas) { //Metodo para mostrar la matriz

        int i, j;

        for (i = 0; i < matriz.length; i++) { //Filas

            for (j = 0; j < matriz[0].length; j++) { //Columnas

                System.out.println("Asignatura : " + asignaturas[j] + ", alumno " + alumnos[i] + ", nota : " + matriz[i][j]); //Mostramos los valores

            }
        }
    }

    public static void mejorMedia(int[][] matriz, String[] alumnos, String[] asignaturas) { //Metodo para la mejor media

        int i, j;

        float mayorMedia = matriz[0][0];
        float media;
        int alumno = 0;
        float suma = 0; //Variables

        for (i = 0; i < matriz.length; i++) { //Filas

            suma = 0; //Actualizamos el valor por cada alumno

            for (j = 0; j < matriz[0].length; j++) { //Columnas

                suma = suma + matriz[i][j]; //Actualizamos el valor

            }

            media = suma / matriz[i].length; //Dividimos en el numero de asignatura

            if (media > mayorMedia) { //Si el valor actual es mayor que el anterior lo sobreescribimos

                mayorMedia = media;

                alumno = i; //Guardamos la posicion del alumno para poder imprimir el nombre del mismo

            }

        }

        System.out.println("Alumno con mejor media: " + alumnos[alumno] + " : " + mayorMedia);

    }
    
    
    public static void alumnoMasSuspensos(int[][] matriz, String[] alumnos, String[] asignaturas){ //Metodo para el alumno con mas suspensos
    
        int i,j;
        int maxSuspenso = -1;
        int contador=0;
        int alumno = 0; //Variables
    
        for(i=0;i<matriz.length;i++) {//FIlas
            
            contador=0; //Actualizamos el valor por alumno
        
            for(j=0;j<matriz[0].length;j++) { //Columnas
            
                if(matriz[i][j]<5) { //SI es menor que 5
                    contador++; //Sumamos 1 al numero de suspensos
                }
            }
            
            if(contador>maxSuspenso){ //Si el valor nuevo es mayor que el actual lo sobreescribimod
            
                maxSuspenso = contador; 
                
                alumno = i; //Guardamos el nombre del alumno
            }
        }
        System.out.println("El alumno con mas suspensos es "+alumnos[alumno]+ " con un total de "+maxSuspenso+" suspenos");
    
    }
    
    
    public static void peorAsignatura(int[][]array, String[]alumnos, String[]asignaturas){ //Metodo para saber que asignatura tiene mas suspensos
    
     int i,j;
        int maxSuspenso = -1;
        int contador=0;
        int asignatura = 0; //Variables
    
        for(j=0;j<array[0].length;j++) { //Columnas 
            
            contador = 0; //ACtualizamos el contador por cada alumno
        
            for(i=0;i<array.length;i++) { //FIlas ya que queremos saber las asignaturas primero
            
                if(array[i][j]<5) { //SI es menor que 5 +1 a los suspensos
                    contador++;
                }
            }
            
            if(contador>maxSuspenso){ //Si el valor actual es mayor que el anterior los cambiamos
            
                maxSuspenso = contador; 
                
                asignatura = j; //Guardamos la asignatura con mas suspensos
            }
        }
        
        System.out.println("La asignatura mas dificil es : "+asignaturas[asignatura]+ " con un total de : "+maxSuspenso + " suspensos");
    
    }
    
    
    
    
    public static void mostrarMenu() { //Metodo para mostrar el menu

        System.out.println("========== MENU =========="); //Opciones
        System.out.println("1.- Rellenar Notas");
        System.out.println("2.- Mostrar Notas");
        System.out.println("3.- Media mas Alta");
        System.out.println("4.- Alumno con mas Suspensos");
        System.out.println("5.- Asignatura mas dificil");
        System.out.println("6.- Salir del programa");
        System.out.println("==========================");
    }

    public static int pedirEleccion() { //Metodo para la eleccion del menu

        int eleccion = 0;

        Scanner entrada = new Scanner(System.in);

        try { //Control de excepciones
            System.out.println("");
            eleccion = entrada.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Introduce un valor correcto");
        }

        return eleccion; //Devolvemos la eleccion al metodo principal
    }
}
