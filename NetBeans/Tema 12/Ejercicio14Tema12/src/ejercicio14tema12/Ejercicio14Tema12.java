/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Ejercicio14Tema12 {

    public static final String FICHERO = "../Ejercicio13Tema12/DatosBeca.txt"; //ruta del fichero

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<String> datos = new ArrayList<>();//lista auxiliar

        try {//excepciones

            leerFichero(datos); //metodo
            calcularBeca(datos);
        } catch (FileNotFoundException e) {

            System.out.println("Error: Error fichero no encontrado");
        } catch (IOException e) {

            System.out.println("Error: Error en la entrada/salida de datos");
        }

    }

    //metodo para leer el fichero
    public static void leerFichero(ArrayList<String> datos) throws IOException, FileNotFoundException {

        String linea;
        String nombre;
        int i = 0;

        try (
                FileReader fr = new FileReader(FICHERO); //readers
                BufferedReader br = new BufferedReader(fr);) {

            linea = br.readLine(); //leemos la linea

            while (linea != null) {

                //[1] despues del split nos permite tomar la segunda parte del split
                //.trim lo que hace es borrar cada espacio
                if (!linea.isEmpty()) {
                    datos.add(linea.split(": ")[1].trim());   //nombre                

                    linea = br.readLine(); // sexo

                    linea = br.readLine(); // edad
                    if (linea != null && !linea.isEmpty()) {
                        datos.add(linea.split(": ")[1].trim());
                    }

                    linea = br.readLine(); // suspensos
                    if (linea != null && !linea.isEmpty()) {
                        datos.add(linea.split(": ")[1].trim());
                    }

                    linea = br.readLine(); // residencia
                    if (linea != null && !linea.isEmpty()) {
                        datos.add(linea.split(": ")[1].trim());
                    }

                    linea = br.readLine(); // ingresos
                    if (linea != null && !linea.isEmpty()) {
                        datos.add(linea.split(": ")[1].trim());
                    }

                    linea = br.readLine(); // avanzar al siguiente bloque
                }

            }
        }

    }

    //metodo para calcular la beca
    public static void calcularBeca(ArrayList<String> datos) {

        String nombre; //variables
        int edad;
        int suspensos;
        String residencia;
        int ingresos;
        int beca = 1500;
        Boolean tieneBeca = true;

        for (int i = 0; i < datos.size(); i += 5) {//recorremos la lista

            nombre = datos.get(i); //guardamos cada valor en las variables
            edad = Integer.parseInt(datos.get(i + 1));
            suspensos = Integer.parseInt(datos.get(i + 2));
            residencia = datos.get(i + 3);
            ingresos = Integer.parseInt(datos.get(i + 4));

            beca = 1500;

            // ingresos
            if (ingresos <= 12000) {
                beca += 500;
            }

            // edad
            if (edad < 23) {
                beca += 200;
            }

            // suspensos
            if (suspensos == 0) {
                beca += 500;
            } else if (suspensos == 1) {
                beca += 200;
            } else {
                tieneBeca = false;
            }

            // residencia
            if (residencia.equals(" NO")) {
                beca += 1000;
            }

            // salida
            if (tieneBeca) {
                System.out.println(nombre + " tiene beca de: " + beca + "€");
            }
        }

    }

}
