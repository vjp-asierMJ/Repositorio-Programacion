/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Asier
 */
public class Ejercicio7Tema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Objeto tele
        Television tele = new Television();
        System.out.println("========== TELEVISION =========");
        //Metodos
        tele.encender();
        tele.apagar();
        tele.encender();
        tele.subirVolumen();
        tele.subirVolumen();
        tele.bajarVolumen();
        tele.cambiarCanal(20);
        tele.apagar();
        tele.cambiarCanal(24);

        //Objeto
        Radio radio = new Radio();

        System.out.println("========== RADIO ==========");
        //Metodos
        radio.encender();
        radio.apagar();
        radio.encender();
        radio.subirVolumen();
        radio.subirVolumen();
        radio.bajarVolumen();
        radio.cambiarCanal(34);
        radio.apagar();
        radio.cambiarCanal(23);
    }

}
