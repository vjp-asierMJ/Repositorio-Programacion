/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15tema8;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio15Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pelicula[] pelicula = new Pelicula[4];
        Socio[] socio = new Socio[4];
        
        int eleccion = 0;
        
        do {
            mostrarMenu();
            eleccion = eleccion();
            try{
            
                switch (eleccion){
                
                    case 1:
                        rellenarPeliculas(pelicula,socio);
                    break;
                    
                    case 2:
                         mostrarPeliculas(pelicula);
                    break;
                    
                    case 3:
                        
                    break;
                    
                    case 4:
                        
                    break;
                    
                    case 5:
                        
                    break;
                    
                    case 6:
                        
                    break;
                    
                    case 7:
                        System.out.println("Saliendo....");
                    break;
                    
                    default:
                        
                        System.out.println("Introduce una opcion entre 1 - 7");
                }
            }
            catch(InputMismatchException e){
            
                System.out.println("Valor incorrecto");
            }
        }
        while (eleccion != 7);
        
    }
    
    public static void rellenarPeliculas(Pelicula[] pelicula, Socio[] socio){
    
        int i;
        String titulo;
        int coste;
        String nombreSocio;
        int precioAbonado;
        
        Scanner entrada = new Scanner(System.in);
        
        for (i=0;i<pelicula.length;i++){
        
            System.out.println("Nombre de la pelicula");
            
            titulo = entrada.nextLine();
            
            System.out.println("Coste de licencia");
            
            coste = entrada.nextInt();
           
            
            System.out.println("Nombre socio");
             entrada.nextLine();
            
            nombreSocio = entrada.nextLine();
            
            System.out.println("Precio abonado");
            precioAbonado = entrada.nextInt();
            entrada.nextLine();
            
            socio[i] = new Socio(nombreSocio,precioAbonado);
            pelicula [i] = new Pelicula(titulo,coste,socio); //Rellenamos los valores
            
           
        }
    }
        
        public static void mostrarPeliculas(Pelicula[]pelicula){
        
            int i;
            
            for(i=0;i<pelicula.length;i++){
            
                System.out.println(pelicula[i].getSocio());
            }
        }
        
        public static void peliculaMasRentable(Socio[] socio){
        
            int i;
            int menorCosto = socio[0].getPrecioAbonado();
            
            for(i=0;i<socio.length;i++){
            
                
            }
        
        }
        
        
        public static int eleccion(){
            
            int eleccion;
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("");
            
            eleccion = entrada.nextInt();
            
            return eleccion;
        }
        
        public static  void mostrarMenu(){
        
            System.out.println("========= MENU =========");
            System.out.println("1.- Rellenar Peliculas");
            System.out.println("2.- Mostrar peliculas");
            System.out.println("3.- Mostrar pelicula mas rentable");
            System.out.println("4.- Mostrar peliculas menos rentable");
            System.out.println("5.- Pedir nombre de peliculas y informacion");
            System.out.println("6.- Numero de socios con cantidad mayor a la pedida");
            System.out.println("7.- Salir");
        
        }
    
    
}
