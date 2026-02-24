/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_figuras;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int eleccion = 0;

        figura[][] figuras = new figura[3][3]; //Creo el objeto de 3 x 3

        do { //Bucle para el menu

            try { //Control de excepciones
                mostrarMenu();
                eleccion = eleccion(); //Guardamos la eleccion

                switch (eleccion) { //Switch case de la eleccion

                    case 1:

                        rellenarFiguras(figuras); //Caso 1 Rellenamos las figuras
                        break;

                    case 2:
                        mostrarFiguras(figuras);//Caso 2 Mostramos las figuras buscadas por el usuario                      
                        break;
                    case 3:
                        figuraMasValiosa(figuras);//Caso 3 Mostramos la figura mas valiosa                   
                        break;
                    case 4:
                        System.out.println("Saliendo...");//Caso 4 salimos
                        break;

                    default: //Opcion por defecto

                        System.out.println("Introduce un valor entre el 1 - 4");
                }

            } catch (InputMismatchException e) { //Excepciones

                System.out.println("Error " + e);
            }

        } while (eleccion != 4); //Condicion del bucle

    }

    public static void mostrarMenu() { //Metodo que muestra el menu

        System.out.println("========= MENU =========");
        System.out.println("1.- Rellenar Vitrina");
        System.out.println("2.- Mostrar figuras de una coleccion");
        System.out.println("3.- Mostrar figura mas valiosa");
        System.out.println("4.- Salir");
    }

    public static int eleccion() { //Metodo para tomar la opcion del menu

        int eleccion;

        Scanner entrada = new Scanner(System.in);

        eleccion = entrada.nextInt();

        return eleccion;
    }

    public static void rellenarFiguras(figura[][] figuras) { //Metodo para rellenar la matriz

        int i;
        int j;

        String nombre, coleccion;
        int valor; //Variables

        int posicion = 1;

        Scanner entrada = new Scanner(System.in); //Scanner

        for (i = 0; i < figuras.length; i++) { //Bucle para las filas

            for (j = 0; j < figuras[i].length; j++) {//Bucle para las columnas

                System.out.println("Nombre de la figura " + posicion);

                nombre = entrada.nextLine(); //Guardamos el nomnre

                System.out.println("Valor de la figura " + posicion);

                valor = entrada.nextInt(); //Guardamos el valor

                entrada.nextLine(); //Pasamos a nextLine para evitar posibles errores

                System.out.println("Coleccion de la figura " + posicion);

                coleccion = entrada.nextLine();//Guardamos la coleccion
                posicion++;

                figuras[i][j] = new figura(nombre, valor, coleccion);//Lo asignamos a cada objeto creado 

            }
        }
    }

    public static void mostrarFiguras(figura[][] figuras) { //Metodo para mostrar las figuras que busca el usuario

        int i;
        int j;

        String coleccionBuscada;

        int contador = 0; //Variables

        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Que coleccion estas buscando?");

        coleccionBuscada = entrada.nextLine(); //Guardamos la coleccion que busca

        for (i = 0; i < figuras.length; i++) {//Filas

            for (j = 0; j < figuras[i].length; j++) {//Columnas

                if (figuras[i][j] != null && figuras[i][j].getColeccion().equalsIgnoreCase(coleccionBuscada)) {

                    //Comparamos la coleccion buscada con las que tenemos y que no este vacia
                    System.out.println("Nombre : " + figuras[i][j].getNombre() + " | Valor : " + figuras[i][j].getValor()
                            + " | Coleccion : " + figuras[i][j].getColeccion()); //Mostramos

                    contador++;//Contador
                }
            }

        }

        if (contador == 0) {//Si el contador es 0, es decir no ha encontrado ninguna figura

            System.out.println("No hay ninguna figura de la coleccion " + coleccionBuscada);//Mostramos el mensaje
        }

    }

    public static void figuraMasValiosa(figura[][] figuras) {

        int i, j;

        int mayor;
        String nombre, coleccion;

        int fila = 0;
        int columna = 0;

        mayor = figuras[0][0].getValor(); //Asignamos el mayor a la primer valor de la matriz
        coleccion = figuras[0][0].getColeccion();//Asignamos tambien el nombre y la coleccion
        nombre = figuras[0][0].getNombre();

        for (i = 0; i < figuras.length; i++) { //Filas

            for (j = 0; j < figuras[i].length; j++) { //Columnas

                if (figuras[i][j].getValor() > mayor) {//Si el valor actual es mayor al asignado lo cambiamos

                    mayor = figuras[i][j].getValor();//Guardamos el valor
                    nombre = figuras[i][j].getNombre();//El nombre
                    coleccion = figuras[i][j].getColeccion();//La coleccion
                    fila = i; // Y la posicion
                    columna = j;
                }
            }
        }

        System.out.println("La figura mas valiosa se encuentra en la fila : " + fila + " columna : " + columna
                + " con el nombre : " + nombre + " de la coleccion : " + coleccion + " y un valor de : " + mayor + " euros");

    }

}
