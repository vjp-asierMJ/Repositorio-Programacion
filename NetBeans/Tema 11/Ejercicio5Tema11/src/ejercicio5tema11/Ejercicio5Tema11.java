/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class Ejercicio5Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Map<Integer, String> treeMap = new TreeMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        rellenarMapa(meses,treeMap,linkedHashMap);
        mostrarMapa(meses,treeMap,linkedHashMap);
    }

    public static void rellenarMapa(String[] meses, Map<Integer, String> treeMap, Map<Integer, String> linkedHashMap) {

        for (int i = meses.length - 1; i > 0; i--) {

            treeMap.put(i, meses[i]);
            linkedHashMap.put(i, meses[i]);
        }
    }

    public static void mostrarMapa(String[] meses, Map<Integer, String> treeMap, Map<Integer, String> linkedHashMap) {

        // Mostrar TreeMap
        System.out.println("Contenido de TreeMap:");

        for (Map.Entry<Integer, String> entrada : treeMap.entrySet()) {

            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        // Mostrar LinkedHashMap
        System.out.println("\nContenido de LinkedHashMap:");

        for (Map.Entry<Integer, String> entrada : linkedHashMap.entrySet()) {

            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

    }

}
