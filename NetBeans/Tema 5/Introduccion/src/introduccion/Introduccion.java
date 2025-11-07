/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Instacion un objeto del tipo que he creado
        //1.1. COn constructror parametrizado y establciendo valores con stters
        
//        Coche miCoche = new Coche();
//        System.out.println(miCoche.toString());
//        
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//        System.out.println(miCoche.getEspejos());
//        miCoche.acelerar();
        
                
        //1.2. Con constructor parametrizado, inicializando los atributos
        //con valores por parametro
        Coche tuCoche = new Coche("Michelin" , "Bajo" , 3);
        System.out.println(tuCoche.toString());
         //Esto hace lo mismo que la linea anterior, porque detecta el toString() automaticamente 
        System.out.println(tuCoche);
            
        System.out.println(tuCoche.getRuedas());   
    }
    
    
}
