/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema12;

/**
 *
 * @author alumno
 */
public class Agenda {

    //atributos
    
    private String nombre;
    private int edad;
    private int numero;

    //constructores
    
    public Agenda() {
        this.nombre = "";
        this.edad = 0;
        this.numero = 0;
    }

    public Agenda(String nombre, int edad, int numero) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }
    
    // getters y setters
    
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //toString
    
        @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", edad=" + edad + ", numero=" + numero + '}';
    }

  

    

}
