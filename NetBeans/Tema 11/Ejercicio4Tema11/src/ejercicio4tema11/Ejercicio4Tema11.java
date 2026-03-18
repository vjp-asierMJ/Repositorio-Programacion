/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema11;

/**
 *
 * @author alumno
 */
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Ejercicio4Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nomviembre","Diciembre"};
    
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>(); //Creo los conjuntos
        
        rellenarConjunto(meses,hashSet,linkedHashSet);
        mostrarConjunto(meses,hashSet,linkedHashSet);
    }
    
    public static void rellenarConjunto(String [] meses,Set<String> hashSet,Set<String> linkedHashSet){ //Metodo para rellenar el conjunto
    
    
        for(int i = 0; i<meses.length;i++){
        
            hashSet.add(meses[i]);
            linkedHashSet.add(meses[i]);
        }
    }
    
    public static void mostrarConjunto(String [] meses,Set<String> hashSet,Set<String> linkedHashSet){ //Metodo para mostrar el conjunto
    
         System.out.println("Contenido de HashSet:");
        for(String mes : hashSet) {
            System.out.println(mes);
        }
        
        System.out.println("\nContenido de LinkedHashSet:");
        for(String mes : linkedHashSet) {
            System.out.println(mes);
        }
    
    }
    
}
