/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author alumno
 */
public class Sprinter extends Ciclista implements Pedaleable { //Hijo de ciclista y extiende la interfaz pedaleable

    private float aceleracion; //Atributo

    //Constructor por defecto
    public Sprinter() {
        super();
        this.aceleracion = 0f;
    }

    //Constructor parametrizado
    public Sprinter(String nombre, int energia, boolean estaEscapando, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion, float aceleracion) {
        super(nombre, energia, estaEscapando, kmMeta, numeroBidones, velocidad, nivelHidratacion);
        this.aceleracion = aceleracion;

    }
    //Getters y Setters

    public float getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    //Metodos
    @Override
    public void comer() { //Metodo para aumentar la energia
        if (super.getKmMeta() > 10) { //Si esta a mas de 10km de la meta
            super.setEnergia(super.getEnergia() + 25); //Aumenta la energia actual en 25
            System.out.println(" El sprinter " + super.getNombre() + " acaba de tomar un gel. Su energia ahora es de " + super.getEnergia()); //Muestra el mensaje
        }
    }

    @Override
    public void beber() { //Metodo para aumentar la hidratacion
        if (super.getNumeroBidones() == 0) { // Si no tiene bidones
            super.cogerBidones(); //Los toma
            super.setNivelHidratacion(super.getNivelHidratacion() + 5); //Aumenta el nivel de hidratacion actual en 5
            super.tirarBidon(); //Tira un bidon

            System.out.println("El sprinter " + super.getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de: " + super.getNivelHidratacion()); //Mensaje
        }
    }

    //Metodos de la interfaz
    @Override
    public void sprintar() { //Metodo para aumentar la velocidad 
        if (super.getKmMeta() < 1 && super.getEnergia() >= 50) { //Si esta a menos de 1km de la meta y tiene 50 de energia o mas
            super.setVelocidad(super.getVelocidad() + aceleracion); // La velocidad es la velocidad + aceleracion
            super.setEnergia(super.getEnergia() - 50); //Energia actual -50
            System.out.println("El sprinter " + super.getNombre() + " esta esprintadndo a " + super.getVelocidad() + "km/h"); //Mensaje
        } else {
            System.out.println("Aun no puedes esprintar"); //Si no puede muestra el mensaje
        }

    }

    @Override
    public void atacar() { //Metodo de ataque
        if (super.getEstaEscapando() == false) { // si no esta escapando

            super.setEstaEscapando(true); //Pasa a escapar
            super.setNivelHidratacion(super.getNivelHidratacion() - (super.getNivelHidratacion() * 10 / 100)); //Disminuye un 10% el nivel de hidratacion actual
            System.out.println("El sprinter " + super.getNombre() + " esta atacando");//Mensaje
        }

    }

    @Override
    public float recuperar(float kmRecuperacion) { //Metodo de recuperacion
        if (super.getKmMeta() > 5) { //Si la meta esta a mas de 5km
            super.setEnergia(super.getEnergia() + (int) (5 * kmRecuperacion)); //Aumenta la energia en 5 por cada kilometro que este descansando
            System.out.println(super.getNombre() + " esta recuperado"); //Muestra el mensaje
        }
        return super.getEnergia(); //Devuelve la energia
    }
    //To string

    @Override
    public String toString() {
        return super.toString() + " | Aceleracion : " + this.aceleracion;
    }
}
