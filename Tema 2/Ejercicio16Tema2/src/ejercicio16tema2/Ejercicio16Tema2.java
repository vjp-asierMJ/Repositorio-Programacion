/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema2;

/**
 *
 * @author Asier
 */
public class Ejercicio16Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dinero, billete50, billete10,numeroBilletesDe10;
        
        dinero = 130;
        
        billete50 = dinero/50; //Tomamos la division de 50
        billete10 = dinero%50; // Tomamos el resto de la division que serian los 30
        numeroBilletesDe10 = dinero%50/10; // Dividimos los 30 entre 10 para que nos de el numero exacto de los billetes
        System.out.println(dinero+" euros hacen un total de : "+billete50+" billetes de 50 euros y "+ numeroBilletesDe10+" billetes de 10 euros");
        
        
        
    }
    
}
