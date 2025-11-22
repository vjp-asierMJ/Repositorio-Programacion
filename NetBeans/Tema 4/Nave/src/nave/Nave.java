/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nave;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner; //Importo el Scanner y la excepción

public class Nave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion;
        float volumen; //Declaro las variables

        do { //Bucle para el menu funcionara hasta que pulse 4
            mostrarMenu(); //Llamo al metodo que muestra el menu
            eleccion = pedirEleccion(); //Asigno la eleccion al metodo

            switch (eleccion) { //Switch case de la eleccion
                case 1:
                    tomarSeñal(); //Si es 1 toma la señal
                    break;
                case 2:
                    ajustarLanzamiento(); //Si es dos ajusta el lanzamiento
                    break;
                case 3:
                    volumen = volumenPlaneta(); //Si es 3, iguala la variable volumen al metodo y lo muestra
                    System.out.println("El volumen de la tierra es: " + volumen);
                    break;
                case 4:
                    System.out.println("Sesion cerrada"); //Si es 4 termina el bucle
                    break;
                default:
                    System.out.println("Introduce un valor entre el 1 y el 4"); //Si no es ninguna de las anteriores, muestra el mensaje

            }
        } while (eleccion != 4);
    }

    public static void tomarSeñal() { //Metodo que  toma el primer divisor
        int frecuencia;
        int i;
        int encontrado;
        encontrado = 0; //Variables

        Scanner entrada = new Scanner(System.in);

        try { //Control de excepciones
            System.out.println("Introduce la frecuencia de la señal: ");

            frecuencia = entrada.nextInt();
            for (i = 1; frecuencia >= i; i++) { //Bucle para tomar el valor
                do {
                    if (frecuencia % i == 0) {
                        encontrado++; //Si encuentra un divisor le suma 1
                    }
                    if (encontrado == 2) { //Si llega a 2, imprime i
                        System.out.println("La señal es : " + i);
                    }
                } while (encontrado == 2); //El bucle termna cuando encuentra 2;

            }
        } catch (InputMismatchException e) { //Capturamos la excepción
            System.out.println("Introduce un valor correcto");
            entrada.next(); //Limpiamos el buffer
        }

    }

    public static void ajustarLanzamiento() { //Metodo que ordena los valores
        int orden1, orden2, orden3;
        int i;
        int aux; //variables
        try { //control de excepciones

            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce el primer valor de potencia");
            orden1 = entrada.nextInt();
            System.out.println("Introduce el segundo valor de potencia");
            orden2 = entrada.nextInt();
            System.out.println("Introduce el tercer valor de potencia");
            orden3 = entrada.nextInt(); //Mensajes

            for (i = 0; i <= 2; i++) { //Bucle para ordenar el valor
                if (orden1 > orden2) {
                    aux = orden1;
                    orden1 = orden2;
                    orden2 = aux;
                }

                if (orden2 > orden3) {
                    aux = orden2;
                    orden2 = orden3;
                    orden3 = aux;
                }

            }
            System.out.println("El orden de potencias es :");
            System.out.println("1. " + orden1);
            System.out.println("2. " + orden2);
            System.out.println("3. " + orden3); //Imprimo el resultado

        } catch (InputMismatchException e) { //Tomo la excepción
            System.out.println("Introduce un valor correcto");
        }

    }

    public static float volumenPlaneta() { //Metodoc que calcula el volumen
        float radio;
        float volumen;
        volumen = 0; //Variables
        try { //Control de excepciones
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce el radio del planeta: ");
            radio = entrada.nextFloat();//Scanner

            volumen = (float) (4 / 3 * Math.PI * radio * radio * radio); //Formula para calcular el volumen y convertirlo a float

        } catch (InputMismatchException e) { //Capturo las excepciones
            System.out.println("Introduce un valor valido");
        }
        return volumen; //Devuelvo el volumen
    }

    public static void mostrarMenu() { //Metodo para mostrae las opciones
        System.out.println("==========PANEL DE CONTROL ==========");
        System.out.println("1.- Analizar la señal");
        System.out.println("2.- Ajustar las potencias de los motores");
        System.out.println("3.- Calcular volumen del planeta");
        System.out.println("4.- Salir del panel");
        System.out.println("=====================================");
    }

    public static int pedirEleccion() { //Metodo para tomar la elección
        int eleccion;
        eleccion = 0; //Variables

        try {
            Scanner entrada = new Scanner(System.in);
            eleccion = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Introduce un valor valido");
        }

        return eleccion; //Devuelvo la elección
    }

}
