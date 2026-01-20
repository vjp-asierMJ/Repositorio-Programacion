/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17tema7;

/**
 *
 * @author alumno
 */
public class Ejercicio17Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int [] array = new int[9]; //Cremos el array
       
       rellenarArray(array);
       mostrarArray(array);
       ordenarArray(array);
       mostrarArrayOrdenado(array);
    }
    
    public static void rellenarArray(int [] array){ //Rellenamos
    
        int i;
        int fin = 9;
    
        for(i=0;i<array.length;i++){ //Recorremos el array
        
            array[i] = (int)(Math.random()*9)+1; //Asignamos valores acada posicion
        }
    }
    
    public static void mostrarArray(int [] array){
    
        int i;
        System.out.println("Numeros Generados");
        for(i=0;i<array.length;i++){
        
            System.out.println((i+1)+" posicion es : "+array[i]);
        }
    }
    
    public static void ordenarArray(int [] array){ //Ordenamos de mayor a menor
    
        int i,j;
        int aux;
        
        for(i=0;i<array.length;i++){ //Recorremos el array
        
            for(j=0;j<array.length-1;j++){ //Recorremos el array menos una posicion para ir comparando entre los dos
            
                if(array[i]>array[j]) { //Si el segundo es mayor que el primero
              
                    aux = array[j];
                    
                    array[j] = array[i]; //Lo intercambiamos
                    
                    array[i] = aux;
                }
            }
        }
    
    }
    
    
    public static void mostrarArrayOrdenado(int [] array){ //Metodo para mostrar el array ordenado de mayor a menor
    
        int i;
        
        System.out.println("Numeros de mayor a menor");
        for(i=0;i<array.length;i++){ //Recorremos el array
        
            System.out.println((i+1) + " posicion "+array[i]); //Mostramos el array
        
        }
    }
}
