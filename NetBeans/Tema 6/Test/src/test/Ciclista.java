/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author alumno
 */
public abstract class Ciclista {

    private String nombre;
    private int energia;
    private boolean estaEscapando;
    private float kmMeta;
    private int numeroBidones;
    private float velocidad;
    private int nivelHidratacion;

    private static int numeroCiclistasCreados;

    //Constructor por defecto
    public Ciclista() {
        this.nombre = "";
        this.energia = 50;
        this.estaEscapando = false;
        this.kmMeta = 120;
        this.numeroBidones = 2;
        this.nivelHidratacion = 50;

        numeroCiclistasCreados++;
    }

    //Constructor parametrizado
    public Ciclista(String nombre, int energia, boolean estaEscapando, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion) {
        this.nombre = nombre;
        this.energia = 50;
        this.estaEscapando = estaEscapando;
        this.kmMeta = kmMeta;
        this.numeroBidones = 2;
        this.velocidad = velocidad;
        this.nivelHidratacion = 50;

        numeroCiclistasCreados++;
    }

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean getEstaEscapando() {
        return this.estaEscapando;
    }

    public void setEstaEscapando(boolean estaEscapando) {
        this.estaEscapando = estaEscapando;
    }

    public float getKmMeta() {
        return this.kmMeta;
    }

    public void setKmMeta(float kmMeta) {
        this.kmMeta = kmMeta;
    }

    public int getNumeroBidones() {
        return this.numeroBidones;
    }

    public void setNumeroBidones(int numeroBidones) {
        this.numeroBidones = numeroBidones;
    }

    public float getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getNivelHidratacion() {
        return this.nivelHidratacion;
    }

    public void setNivelHidratacion(int nivelHidratacion) {
        this.nivelHidratacion = nivelHidratacion;
    }

    //Metodos
    public final void cogerBidones() { //Metodo para coger 2 bidones si esta a mas de 10 km
        if (this.kmMeta > 10) {
            this.numeroBidones += 2;
        } else {
            System.out.println("No puedes coger bidones a menos de 10 km de meta");
        }
    }

    public final void tirarBidon() { //Metodo para disminuir los bidones en 1
        this.numeroBidones--;
    }

    //Metodos abstractos
    public abstract void comer();

    public abstract void beber();

    //Metodos
    public void aumentarNumeroCiclistas() {
        numeroCiclistasCreados++; //Metodo para contar el numero de objetos creados
    }

    public String verNumeroCiclistas() { //Metodo para ver el numero de objetos creados
        return "El numero de ciclistas creados es : " + numeroCiclistasCreados;
    }

    //To string
    @Override
    public String toString() {
        return " Nombre: " + this.nombre
                + " | Energia: " + this.energia
                + " | Esta escapando : " + this.estaEscapando
                + " | Km a meta: " + this.kmMeta
                + " | Numero bidones : " + this.numeroBidones
                + " | Velocidad: " + this.velocidad
                + " | Nivel de Hidratacion :" + this.nivelHidratacion
                + " | Ciclistas : " + verNumeroCiclistas();
    }

}
