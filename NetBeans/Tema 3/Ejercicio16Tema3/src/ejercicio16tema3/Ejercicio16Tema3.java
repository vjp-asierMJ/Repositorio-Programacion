/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema3;

/**
 *
 * @author alumno
 */
public class Ejercicio16Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int distancia;
        int conteo; //Declaro las variables
        
        conteo = 0; //Inicializo las variables
        
        distancia=21;
        
        while(distancia<160){ //Hago el bucle
            System.out.print("-"+distancia); //Imprimo el numero
            conteo++; //Actualizo el numero de veces que se imprime un numero impar
            distancia = distancia+2; //Actualizo el valor para que pase al siguiente numero impar
        }
        
        System.out.println("La cantidad de numero impares han sido: "+conteo); //Imprimo el numero de veces que se han escrito numeros impares
    }
    
}
