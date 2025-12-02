/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio2Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objetos
        
        Alumno alumno = new Alumno("Paco","1º DAW");
        System.out.println(alumno.toString());
        System.out.println(alumno.saludar());
        
        Profesor profesor = new Profesor("Andrea","Informatica");
        System.out.println( profesor.toString());
        System.out.println(profesor.saludar());
       
        
        //POLIMORFISMO
       //Puedo utilizar los mismos metodos ya que el metodo saludar se encuentra en la raiz, persona
        
        System.out.println("========== POLIMORFISMO ==========");
        
        Persona alumno2 = new Alumno("Roberto","2º DAM");
        System.out.println( alumno2.toString());
         System.out.println(alumno2.saludar());
       
        
        Persona profesor2 = new Profesor ("Ana","Ingles");
        System.out.println( profesor2.toString());
        System.out.println(profesor2.saludar());
    }
    
}
