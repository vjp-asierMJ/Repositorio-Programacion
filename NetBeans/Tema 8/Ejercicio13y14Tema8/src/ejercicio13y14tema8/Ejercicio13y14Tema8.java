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
                        rellenarAlumnos(alumno); //Caso 1 rellenamos

                        break;

                    case 2:
                        mostrarAlumnos(alumno); //Caso 2 mostramos el objeto
                        break;
                    case 3:

                        mostrarPorEncimaDeNota(alumno); //Caso 3 mostramos el objeto filtrando por el precio
                        break;

                    case 4:

                        mediaSuspensa(alumno);
                        break;

                    case 5:

                        buscarAlumno(alumno);

                    case 6:

                        System.out.println("Saliendo...."); // Caso 4 salimos
                        break;

                    default:
                        System.out.println("Introduce una eleccion valida"); //Opcion por defecto

                }
            } catch (InputMismatchException e) { //Control de excepciones

                System.out.println("Error " + e);
            }
        } while (eleccion != 4); //Condicion del bucle
    }

    public static void rellenarAlumnos(Alumno[] alumno) {

        int i;
        int posicion = 0;
        String nombre = "";
        float notaMedia = 0.0f;
        int edad = 0;

        Scanner entrada = new Scanner(System.in);

        for (i = 0; i < alumno.length; i++) { //Recorremos el objeto

            while (alumno[i] == null) { //Mientras que  la posicion este vacia 
                System.out.println("Introduce que posicion quieres guardar el alumno");
                posicion = entrada.nextInt(); //Guardamos la posicion que se quiere guardar el objeto

                if (posicion >= 0 && posicion <= 4) {//Condicion para que sea posicion correcta

                    entrada.nextLine(); //Pasamos el scanner a Line para que no de problemas

                    System.out.println("Introduce el nombre");

                    nombre = entrada.nextLine(); //Tomamos el nombre

                    System.out.println("Introduce la edad");

                    edad = entrada.nextInt();//Tomamos la edad

                    System.out.println("Introduce la nota media");

                    notaMedia = entrada.nextFloat(); //Tomamos la media

                } else {

                    System.out.println("Posicion invalidad, debe ser entre 0-4");
                }

                if (alumno[posicion] != null) { //Si la posicion no esta vacia mostramos el mensaje 

                    System.out.println("Esa posicion esta ocupada");
                } else { //Si la posicion esta libre insertamos los datos al objeto

                    alumno[posicion] = new Alumno(nombre, edad, notaMedia);
                }
            }

            System.out.println("Alumno " + (i + 1));

        }

    }

    public static void mostrarAlumnos(Alumno[] alumno) {

        int i = 0;

        for (i = 0; i < alumno.length; i++) {//Recorremos el array

            System.out.println(alumno[i]);//Lo mostramos
        }
    }

    public static void mostrarPorEncimaDeNota(Alumno[] alumno) { //Metodo para media

        int i;
        int nota = 0;
        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Que nota quieres buscar");

        nota = entrada.nextInt(); //Tomamos el valor de la media

        System.out.println("Alumnos encontrados con nota media superior a " + nota);

        for (i = 0; i < alumno.length; i++) { //Recorremos el objeto

            if (alumno[i].getNotaMedia() > nota) {//Filtramos por medias mayores al valor del usuario

                System.out.println(alumno[i].getNombre() + " con " + alumno[i].getNotaMedia() + " de media");
                //Si es mayor lo mostramos y sumamos 1 al contador
                contador++;
            }
        }

        if (contador == 0) { //Si no se ha encontrado ninguna nota es decir
            // el contador es 0

            System.out.println("Ningun alumno tiene una nota media superior a " + nota);//Mostramos el mensaje
        }
    }

    public static void mediaSuspensa(Alumno[] alumno) {//Mostrar los suspensos

        int i;
        int contador = 0; //Variables

        System.out.println("Alumnos suspensos : ");

        for (i = 0; i < alumno.length; i++) { //Recorremos el array

            if (alumno[i].getNotaMedia() < 5) { //Si la nota es menor a 5 la mostramos

                System.out.println(alumno[i].getNombre() + " con una media de " + alumno[i].getNotaMedia());
                contador++;//Sumamos 1 al contador
            }

            if (contador == 0) {//Si el contador es 0
                //quiere decir que no hay suspensos

                System.out.println("Ningun alumno ha suspendido");
            }
        }
    }

    public static void buscarAlumno(Alumno[] alumno) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del alumno a buscar:");
        String nombreBuscado = entrada.nextLine(); // Leemos el nombre

        boolean encontrado = false; //Boolean para saber si se encontro

        for (int i = 0; i < alumno.length; i++) {
            if (alumno[i] != null && alumno[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                encontrado = true; // Pasamos a true si encontramos
            }
        }

        // Mostramos el resultado después de recorrer todo el array
        if (encontrado) {
            System.out.println(nombreBuscado + " está matriculado.");
        } else {
            System.out.println(nombreBuscado + " NO está matriculado.");
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
        System.out.println("1.- Rellenar alumnos");
        System.out.println("2.- Mostrar alumnos");
        System.out.println("3.- Mostrar por nota media");
        System.out.println("4.- Mostrar alumnos suspensos");
        System.out.println("5.- Buscar alumnos");
        System.out.println("6.- Salir");
    }
}
