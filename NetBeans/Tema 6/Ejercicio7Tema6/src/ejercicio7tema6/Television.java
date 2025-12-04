/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Asier
 */
public class Television implements ControlRemoto {

    private boolean encendido;
    private int canal;
    private int volumen;

    //Constructores
    public Television() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;

    }

    public Television(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }

    //Getters y Setters
    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    //Metodos
    @Override
    public void encender() {
        if (this.encendido = true) { //Metodo para encender
            System.out.println("La television esta encendida");
            System.out.println("El canal es : " + this.canal);
        } else {
            System.out.println("La television esta apagada, encendiendo......");
            this.encendido = true;
        }

    }

    @Override
    public void apagar() { //Metodo para apagar
        if (this.encendido == true) {
            System.out.println("Apagando.....");
            this.encendido = false;
        } else {
            System.out.println("La television ya esta apagada");
        }
    }

    @Override
    public void bajarVolumen() {
        if (this.encendido == true) {
            this.volumen--;
            System.out.println("El volumen es : " + this.volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if (this.encendido == true) {
            this.volumen++;
            System.out.println("El volumen es : " + this.volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (this.encendido == true) {
            this.canal = (int) canal;
            System.out.println("El canal actual es : " + this.canal);
        } else {
            System.out.println("No se puede cambiar de canal, la television esta apagada");
        }
    }
}
