/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio10Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int[] rellenarArray(){
    
        int[] array = new int [10];
        int i;
        int inicio, fin, rango;
        
        inicio = 1;
        fin = 8;
        rango = fin-inicio;
        
        for(i=0;i<array.length;i++) {
        
        array[i] = (int)(Math.random() * rango) + inicio;
        
        }
        return array;
    
    }
    
    public static void mostrarArray(int[] array){
        
        int i;
        
        for(i=0;i<array.length;i++){
            System.out.println(i+".- "+array[i]);
        }
    }
    public static int[] eliminarRepetidos(int[] array){
        int i;
        int j;
    
        boolean repetido = false;
        
        for(i=0;i<array.length;i++){
        
                       
        
        }
    
    
    }
}
