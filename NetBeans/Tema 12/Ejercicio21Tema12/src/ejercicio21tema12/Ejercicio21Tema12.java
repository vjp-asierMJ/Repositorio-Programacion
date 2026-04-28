/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21tema12;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio21Tema12 {

    public final static String FICHERO = "notas.txt";

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Asignatura> asignaturas = new ArrayList<>();//lista auxiliar para calcular la media
        
        
        try{
        
            escribirFichero(asignaturas);
            leerFichero(asignaturas);
        }
        
       
        
        catch(FileNotFoundException e ){//fichero no encontradao
        
            System.out.println("Error: Fichero no encontrado");
        }
        
        catch(ClassNotFoundException e){//clase no encontrada
        
            System.out.println("Error: Clase no encontrada");
        }
        
         catch(IOException e){//fallo en la entrada/salida de datos
         
             System.out.println("Error: Fallo en la entrada/salida de datos");
         }
        
        catch(InputMismatchException e){//fallo en la entrada del usuario
        
            System.out.println("Error: Valor introducido invalido");
        }
        
        catch(Exception e){//errro general
        
            System.out.println("Error: Error desconocido");
        }

    }

    //metodo para escribir los datos en el fichero
    public static void escribirFichero(ArrayList<Asignatura> asignaturas) throws FileNotFoundException, ClassNotFoundException, IOException {

        Asignatura a;

        try (
                FileOutputStream fos = new FileOutputStream(FICHERO); //writers
                ObjectOutputStream oos = new ObjectOutputStream(fos);) 
        
        {
            //vamos creando cada asignatura y la guardamos en la lista para poder calcular la media posteriormente
            System.out.println("Programacion: ");
            oos.writeObject(a = new Asignatura("Programacion: ", pedirFloat("Nota: ")));
            asignaturas.add(a);
            System.out.println("Lenguaje De Marcas: ");
            oos.writeObject(a = new Asignatura("Lenguaje De Marcas: ", pedirFloat("Nota: ")));
            asignaturas.add(a);
            System.out.println("Entornos de Desarrollo: ");
            oos.writeObject(a = new Asignatura("Entornos de Desarrollo: ", pedirFloat("Nota: ")));
            asignaturas.add(a);
            System.out.println("Sistemas Informaticos: ");
            oos.writeObject(a = new Asignatura("Sistemas Informaticos: ", pedirFloat("Nota: ")));
            asignaturas.add(a);
            System.out.println("Formacion y Orientacion Laboral: ");
            oos.writeObject(a = new Asignatura("Formacion y Orientacion Laboral: ", pedirFloat("Nota: ")));
            asignaturas.add(a);
            System.out.println("Base de Datos: ");
            oos.writeObject(a = new Asignatura("Base de Datos: ", pedirFloat("Nota: ")));
            asignaturas.add(a);

            System.out.println("***Notas almacenadas en el fichero***");

        }

    }

    //metodo para leer el fichero
    public static void leerFichero(ArrayList<Asignatura> asignaturas) throws FileNotFoundException, ClassNotFoundException, IOException {

        float media = 0;

        try (
                FileInputStream fis = new FileInputStream(FICHERO); //readers
                ObjectInputStream ois = new ObjectInputStream(fis);) 
        {

            Asignatura a;

            while (true) {//mientras sea verdad

                 a = (Asignatura) ois.readObject();//leemos cada objeto
            }
            
            

        } catch (EOFException e) {//excepcion cuando termina

            System.out.println("...Leyendo fichero y calculando media...");
        }
        
        for (Asignatura asig : asignaturas) {//recorremos las asignaturas

                media += asig.getNota();//actualizamos la media
            }
        
        media /= asignaturas.size();// dividmos entre el numero de asignaturas

        System.out.println("Su nota media del curso es de: " + media);//mostramos la media
    }

    //metodo para pedir un float
    public static float pedirFloat(String texto) throws InputMismatchException {

        float valor;

        Scanner entrada = new Scanner(System.in);

        System.out.println(texto);

        valor = entrada.nextFloat();

        entrada.nextLine();

        return valor;
    }

}
