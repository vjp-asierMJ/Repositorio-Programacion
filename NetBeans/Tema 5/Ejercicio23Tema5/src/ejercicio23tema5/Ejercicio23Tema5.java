/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author alumno
 */
public class Ejercicio23Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Taxi taxiParametrizado = new Taxi("1234AAA","Polo",90, 32196934);
        System.out.println(taxiParametrizado.toString());
        
        Taxi taxiDefecto = new Taxi();
        taxiDefecto.setModelo("Peugott");
        taxiDefecto.setMatricula("1111ZZZ");
        taxiDefecto.setPotenciaCV(135);
        taxiDefecto.setNumeroLicencia(32196934);
        
        System.out.println(taxiDefecto.toString());
    }
    
}
