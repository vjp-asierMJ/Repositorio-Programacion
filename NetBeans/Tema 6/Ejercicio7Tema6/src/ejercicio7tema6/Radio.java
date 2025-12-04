/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema6;

/**
 *
 * @author Asier
 */
public class Radio implements ControlRemoto {

    private boolean encendido;
    private float emisor;
    private int volumen;

    //Constructores
    public Radio() {
        this.encendido = false;
        this.emisor = (float) 80.0;
        this.volumen = 15;
    }

    public Radio(boolean encendido, float emisor, int volumen) {
        this.encendido = encendido;
        this.emisor = emisor;
        this.volumen = volumen;

    }
    //Getters y setters

    public float getEmisor() {
        return this.emisor;
    }

    public void setEmisor(float emisor) {
        this.emisor = emisor;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumnen(int volumen) {
        this.volumen = volumen;
    }

    //Metodos
    @Override
    public void apagar() { //Metodo para apgatr
        if (this.encendido == true) {
            System.out.println("Apagando.....");
            this.encendido = false;
        } else {
            System.out.println("La television ya esta apagada");
        }

    }

    @Override //Metodo para encender 
    public void encender() {
        if (this.encendido == false) {
            System.out.println("Encendiendo.....");
            this.encendido = true;
        } else {
            System.out.println("La television ya esta encendida");
        }
    }

    @Override
    public void bajarVolumen() { //Metodo para disminuir en 5 el volumen
        if (this.encendido == true) {
            this.volumen -= 5;
            System.out.println("El volumen es : "+this.volumen);
        } else {
            System.out.println("No se puede bajar el volumen la television esta apagada");
        }
    }

    @Override
    public void subirVolumen() { //Metodo para aumentar en 5 el volumen
        if (this.encendido == true) {
            this.volumen += 5;
            System.out.println("El volumen es : "+this.volumen);

        } else {
            System.out.println("No se puede subir el volumen la television esta apagada");
        }
    }

    @Override
    public void cambiarCanal(float canal) { //Metodo para el canal
        if (this.encendido == true) {
            this.emisor = canal;
            System.out.println("El canal es : " + canal);
        } else {
            System.out.println("La television esta apagada y no se puede cambiar de canal");
        }
    }

    //To string
    @Override
    public String toString() {
        return "Encendido : " + this.encendido
                + " | Volumen : " + this.volumen
                + " | Canal : " + this.emisor;
    }

}
