/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio6Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] array = new int [80]; //Array
        
        rellenarArray(array); //Metodos
        mostrarArray(array);
    }
    
    public static void rellenarArray(int [] array){ //Metodo para rellenar el array
        int i,j;
        i=0;
        j=0;
            
        while(i<array.length) { //Condicion del bucle
            if (j == 2 || j == 3 || j == 5 || j == 7 ||
           (j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0)) { //Condicion para que sea primo
                
                array[i] = j; //Le asignamos el valor al array
                i++; //Incrementamos i
            }
            j++; //Actualizamos el numero
            
        }
    
    
    }
    
    public static void mostrarArray(int [] array){ //Metodo para recorrer el array
    
        int i,j;
        j=0;
        
        for(i=0;i<array.length;i++){ //Recorrer los valores
        
            if(array[i]>0) {
            System.out.println("["+j+"]"+" ->"+array[i]); //Si es mayor que 0 lo imprimimos
            j++;
        }
        
    }
    
}
}
