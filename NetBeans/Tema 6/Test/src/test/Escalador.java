/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author alumno
 */
public class Escalador extends Ciclista implements Pedaleable { //Hereda de Ciclista y añada la interfaz Pedaleable
    //Atributos

    private float potencia;
    private float fuerza;

    public Escalador() { //Constructor por defecto
        super();
        this.potencia = 0f;
        this.fuerza = 0f;
    }

    //Constructor parametrizado
    public Escalador(String nombre, int energia, boolean estaEscapando, float kmMeta, int numeroBidones, float velocidad, int nivelHidratacion, float potencia, float fuerza) {
        super(nombre, energia, estaEscapando, kmMeta, numeroBidones, velocidad, nivelHidratacion);
        this.potencia = potencia;
        this.fuerza = fuerza;
    }

    //Getters y Setters
    public float getPotencia() {
        return this.potencia;

    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }

    //Metodos
    @Override
    public void comer() {
        if (super.getKmMeta() > 20) { //Si esta a mas de 20km
            super.cogerBidones(); //Aumenta el numero de bidones
            super.setEnergia(super.getEnergia() + 30); //Aumenta en 30 la energia actual

            System.out.println("El escalador " + super.getNombre() + " acaba de tomar gel. Su energia ahora es de " + super.getEnergia());
        }
    }

    @Override
    public void beber() { //Metodo para beber
        if (super.getNumeroBidones() == 0) { //Si tiene 0 bidones
            super.cogerBidones(); //Toma bidones
            super.setNivelHidratacion(super.getNivelHidratacion() + 10); //Aumenta la hidratacion actual en 10
            super.tirarBidon();
            super.tirarBidon(); //tira 2 bidones
            System.out.println("El escalador " + super.getNombre() + " se ha hidratado. Su nivel de hidratacion ahora es de : " + super.getNivelHidratacion()); //Muestra el mensaje
        }
    }

    //Metodos abstractos de la interfaz
    @Override
    public void sprintar() {
        if (super.getKmMeta() < 0.3 && this.fuerza >= 20) { //Si esta a menos de 0.3km y tiene mas de 20 de fuerza
            super.setVelocidad(this.potencia / this.fuerza); //aumenta la velocidad, con la potencia entre la fuerza
            super.setEnergia(super.getEnergia() - 20); //Disminuye la energia actual en 20
            System.out.println("El escalador : " + super.getNombre() + " esta esprintando a " + super.getVelocidad() + " km/h"); //Muestra el mensaje
        } else {
            System.out.println("Aun no puedes esprintar"); // Si no muestra el mensaje
        }
    }

    @Override
    public void atacar() { //Metodo abstracto de ataque
        if (super.getEstaEscapando() == false) { //Si no esta escapandp
            super.setEstaEscapando(true); //Pasa a escapar
            super.setNivelHidratacion(super.getNivelHidratacion() - super.getNivelHidratacion() * 20 / 100); //Disminuye el nivel de hidratacion actual en un 20%
            System.out.println("El escalador " + super.getNombre() + " esta atacando"); //Muestra el mensaje
        }
    }

    @Override
    public float recuperar(float kmRecuperacion) { //Metodo para recuperar energia
        if (super.getKmMeta() > 15) { //Si esta a mas de 15km de la meta
            super.setEnergia((super.getEnergia() + 5) * (int) kmRecuperacion); //Recupera 5 de energia por cada km de recuperacion
            System.out.println(super.getNombre() + " esta recuperado"); //Muestra el mensaje
        }
        return super.getEnergia(); //Devuelve el valor de la energia
    }

    // to string
    @Override
    public String toString() {
        return super.toString() + " | Potencia : " + this.potencia
                + " | Fuerza : " + this.fuerza;
    }

}
