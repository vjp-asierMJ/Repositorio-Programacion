/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio1Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Suma suma = new Suma(4,9);
        System.out.println(suma.toString());
        suma.realizarOperacion();
                
        
        Multiplicacion multiplicacion = new Multiplicacion(3,9);
        System.out.println(multiplicacion.toString());
        multiplicacion.realizarOperacion();
        
        Potencia potencia = new Potencia(4,2);
        System.out.println(potencia.toString());
        potencia.realizarOperacion();
        
        //Polimorfismo
        
        System.out.println("========== POLIMORFISMO ==========");
        
        Calculadora suma2 = new Suma(4,1);
        System.out.println(suma2.toString());
        suma2.realizarOperacion();
                
        
        Calculadora multiplicacion2 = new Multiplicacion(5,5);
        System.out.println(multiplicacion.toString());
        multiplicacion.realizarOperacion();
        
        Calculadora potencia2 = new Potencia(2,5);
        System.out.println(potencia2.toString());
        potencia2.realizarOperacion();
        
        
    }
    
}
