/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio4Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro perro = new Perro("Toby",5,20);
        Lobos lobo = new Lobos("Fantasma",7,30);
        Leones leon = new Leones ("Simba",8,200);
        Gatos gato = new Gatos ("Coco",4,12);
        
        System.out.println(perro.toString());
        System.out.println(lobo.toString());
        System.out.println(leon.toString());
        System.out.println(gato.toString());
        
        System.out.println("=======================");
        System.out.println("POLIMORFISMO"); 
        
        Animal perro2 = new Perro ("Rex",4,18);
        Animal lobo2 = new Lobos("Sombra",9,43);
        Animal leon2 = new Leones ("Nala",6,140);
        Animal gato2 = new Gatos("Luna",1,3);
        
        System.out.println(perro2.toString());
        System.out.println(lobo2.toString());
        System.out.println(leon2.toString());
        System.out.println(gato2.toString());
     
    }
    
}
