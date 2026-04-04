/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tema11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio8Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Ciudad> ciudades = new ArrayList<>();

        int eleccion = 0;

        do { //bucle para el menu

            try { //excepciones
                menu();
                eleccion = pedirInt("Valor: ");

                switch (eleccion) {
                    case 1 ->
                        insertarCiudad(ciudades);
                    case 2 ->
                        mostrarCiudades(ciudades);
                    case 3 ->
                        mostrarSedesSuperiorMedia(ciudades);
                    case 4 -> {
                        boolean encontrado = buscarSedePorNombre(ciudades); // guarda el resultado
                        System.out.println("Sede encontrada: " + encontrado);
                    }
                    case 5->
                        insertarSede(ciudades);
                    case 6->
                        mostrarSedesOrdenadas(ciudades);
                    case 7 -> {
                        System.out.println("Saliendo...");
                    }
                    default -> {
                        System.out.println("Introduce una opcion entre 1 - 7");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: valor incorrecto");
            }
        } while (eleccion != 7);
    }

    //Metodo para insertar una ciudad
    public static void insertarCiudad(ArrayList<Ciudad> ciudades) {

        LinkedHashSet<Sede> sedes = new LinkedHashSet<>();//creamos el conjunto

        String ciudad;
        String nombre;
        int ingresos;
        String continuar;

        ciudad = pedirString("Ciudad: "); //pedimos los datos

        do {// bucle

            nombre = pedirString("Nombre Sede:");

            ingresos = pedirInt("Ingresos:");

            Sede s = new Sede(nombre, ingresos); //Lo guardamos en un objeto de sede

            sedes.add(s); //guardamos el objeto en el conjunto

            continuar = pedirString("Quieres continuar? s/n"); //preguntamos si quiere continuar

        } while (continuar.equalsIgnoreCase("s"));

        Ciudad c = new Ciudad(ciudad, sedes); //Creamos el oobjeto de ciudad con el nombre y el conjunto de sedes

        ciudades.add(c); //guardamos el objeto de ciudad en la lista
    }

    // Metodo para mostrar las ciudades y las sedes
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades) {

        for (Ciudad c : ciudades) {//Recorremos las ciudades

            System.out.println("Ciudad: " + c.getNombre());

            for (Sede s : c.getSedes()) { //Tomamos la sede de cada ciudad

                System.out.println(" " + s);
            }
        }
    }

    // Metodo para mostrar las sedes con ingresos superiores a la media
    public static void mostrarSedesSuperiorMedia(ArrayList<Ciudad> ciudades) {

        int media = 0;
        int total = 0;

        for (Ciudad c : ciudades) { // bucle para saber la media ingresos

            for (Sede s : c.getSedes()) {

                media += s.getIngresos();
                total++; //contamos las sedes que hay
            }
        }

        media = media / total;

        for (Ciudad ci : ciudades) { //recorremos las ciudades

            for (Sede se : ci.getSedes()) { //recorremos las sedes

                if (se.getIngresos() > media) { //si la sede actual tiene mayor ingresos a la media

                    System.out.println("Sede: " + se.getNombre() + " con una media de : " + se.getIngresos() + " euros");
                }
            }
        }
    }

    //Metodo para buscar sedes por nombre
    public static boolean buscarSedePorNombre(ArrayList<Ciudad> ciudades) {

        LinkedHashSet<Sede> sedes;
        String nombre = pedirString("Nombre de la sede: ");

        int i = 0;// índice para ciudades
        boolean encontrado = false;

        while (i < ciudades.size() && !encontrado) {   // mientras queden ciudades y no haya encontrado

            Ciudad c = ciudades.get(i);
            int j = 0; // índice para sedes

            // recorrer las sedes de la ciudad actual
            sedes = c.getSedes();
            Sede[] arraySedes = sedes.toArray(new Sede[0]); // convertimos a array para usar índices

            while (j < arraySedes.length && !encontrado) {
                Sede s = arraySedes[j];
                if (s.getNombre().equalsIgnoreCase(nombre)) {
                    encontrado = true; // encontramos
                }
                j++;
            }

            i++;
        }

        return encontrado; // devolvemos el resultado
    }

    //Metodo para insertar una sede a una ciudad existente
    public static void insertarSede(ArrayList<Ciudad> ciudades) {
                
        String nombre;
        String nombreSede;
        int ingresos;
        int i = 0;
        boolean parar = false;
  

        do {
           if(ciudades.size()==0){ // si no hay ciudades
               System.out.println("No hay ciudades introducidas");
               parar = true;
           }
              
           else {
               i = 0; //reiniciamos el valor de i 
              nombre = pedirString("Nombre Ciudad: ");
               
               while(i<ciudades.size()) {
                   
                   if(ciudades.get(i).getNombre().equalsIgnoreCase(nombre)) {
                   
                       nombreSede = pedirString("Nombre Sede : ");
                       ingresos = pedirInt("Ingresos: ");
                       
                        LinkedHashSet<Sede> sedes = ciudades.get(i).getSedes();//tomamos el conjunto
                       
                       Sede s = new Sede(nombreSede,ingresos); //creo un objeto
                       
                       sedes.add(s);//lo guardo en el conjunto
                       
                       ciudades.get(i).setSedes(sedes);//inserto el conjunto en la lista de ciudades y en el objeto de la ciudad
                       
                       System.out.println("Se ha insertado correctamente la nueva sede");
                       
                       parar = true;
                   }

                   i++;
               }
           }
    }
        while (!parar);
        
    }
    
    //Metodo para mostrar las sedes ordenadas por ingresos
    public static void mostrarSedesOrdenadas(ArrayList<Ciudad> ciudades){
    
        ArrayList<Sede> listaSedes = new ArrayList<>(); //Creamos una lista auxiliar para ir guardando los valores ordenados
        
        for(Ciudad c : ciudades){ //Recorremos las ciudades
            
            listaSedes.addAll(c.getSedes()); //Insertamos el conjunto de sedes en la lista
        }
        
        listaSedes.sort((s1,s2) -> Integer.compare(s2.getIngresos(), s1.getIngresos())); //Vamos comparando cada valor
        
        
        for(Sede s : listaSedes){
        
            System.out.println("Sede: " + s.getNombre() + " - Ingresos: " + s.getIngresos() + " euros"); //Mostramos la lista ordenada
        }
    }

    //Metodo para mostrar el menu
    public static void menu() {

        System.out.println("========== MENÚ ==========");
        System.out.println("1.- Añadir ciudad");
        System.out.println("2.- Mostrar ciudades y sedes");
        System.out.println("3.- Nombre de sede e ingresos anuales superiores a la media");
        System.out.println("4.- Buscar sede por nombre");
        System.out.println("5.- Añadir sede");
        System.out.println("6.- Mostrar sedes ordenadas por ingresos");
        System.out.println("7.- Salir");
    }

    //Metodo para pedir un int
    public static int pedirInt(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(texto);   // muestra el mensaje
        int valor = entrada.nextInt();
        entrada.nextLine();         // limpiar buffer
        return valor;
    }

    //Metodo para pedir un String
    public static String pedirString(String texto) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(texto);    // muestra el mensaje
        return entrada.nextLine();
    }

}
