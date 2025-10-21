/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
import Tema4.utilidades.Utilidades;

public class Introduccion {

    /**
     * @param args the command line arguments
     */
    
    //Metodo que imprime saludo tipo void
    public static void saludo(){
        System.out.println("Hola mundo");
    }
    //Metodo que imprime un mensaje con un dato que recibe por parametro tipo void
    public static void saludoConParametro(int num){
        System.out.println("Hola mundo "+num);
    }
    //Metodo que muestra la suma de dos numeros que recibe por parametro tipo void
    public static void suma(int num1,int num2){
        System.out.println("La suma de "+num1+" + "+num2 + " = "+(num1+num2));
    }
    //Metodo que devuelve la suma se dos numeros que recibe por parametro tipo void
    public static int sumaQueDevuelveResultado (int num1, int num2){
        int resultado = num1 + num2;  
       return resultado;
    }
    //Metodo que devuelve true si la contraseña que pasamos por parametro es correcta tipo boolean
    
    public static void main(String[] args) {
        // TODO code application logic here
        
       //llamamos al metodo
       int num1 = 6;
       int num2 = 2;
       int resultado;
       
       //Llamamos a todos los metodos que se ejecuten al lanzar
       
            //  saludo(); //1
       
            //  saludoConParametro(5);//2
       
            // suma(num1,num2); //3
       
            //      resultado= sumaQueDevuelveResultado(num1,num2);
            //        System.out.println(resultado); // 4

    //Llamo a un metodo estatico de otra clase
    
      resultado =  Calculadora.suma(num1, num2);
        System.out.println(resultado);
      resultado = Calculadora.resta(num1, num2);
        System.out.println(resultado);
        
    //Loamar un metodo estatico de una clase de otro paquete
        Utilidades.pedirNumero();
    }
    
}
