/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema6;

/**
 *
 * @author alumno
 */
public class Ejercicio5Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objeto murcielago
        Murcielago murcielago = new Murcielago("Bati","Hembra","Negro",3,100);
        //Metodos
        System.out.println(murcielago.toString());
        System.out.println("Ascendiendo");
        murcielago.aumentarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        System.out.println("Descendiendo");
        murcielago.bajarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        
        System.out.println("=======================");
        //Objeto ornitorrinco
        Ornitorrinco ornitorrinco = new Ornitorrinco ("Perry","Macho","Verde",4,2);
        //Metodos
        System.out.println(ornitorrinco.toString());
        
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.incubarHuevo();
        ornitorrinco.incubarHuevo();
        System.out.println("Eclosion de huevos");
        ornitorrinco.mostrarNumHuevos();
        
       //Polimorfismo 
       
        System.out.println("========== POLIMORFISMO ==========");
        Mamifero murcielago2 = new Murcielago("Batman","Macho","Blanco",2,20);
        
        System.out.println(murcielago2.toString());
        
        Mamifero ornitorrinco2 = new Ornitorrinco("Orni","Hembra","Marron",5,10);
        
        System.out.println(ornitorrinco2.toString());
        
    }
    
}
