/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11tema11;

/**
 *
 * @author alumno
 */
public class Alumno {

    private String dni;
    private int numeroExpediente;
    private float notaMedia;

    //Constructores
    public Alumno(String dni, int numeroExpediente, float notaMedia) {
        this.dni = dni;
        this.numeroExpediente = numeroExpediente;
        this.notaMedia = notaMedia;
    }

    public Alumno() {
        this.dni = "";
        this.numeroExpediente = 0;
        this.notaMedia = 0.0f;
    }
    
    //Getters y Setters
    
        public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    //ToString
    
    
    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", numeroExpediente=" + numeroExpediente + ", notaMedia=" + notaMedia + '}';
    }



}
