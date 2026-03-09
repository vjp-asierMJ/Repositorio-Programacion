/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenra6;

/**
 *
 * @author alumno
 */
public class Coche {  

   
    
    private String nombre; //Atributos
    private String matricula;


    
    //Constructor por defecto
     public Coche() {
        this.nombre = "";
        this.matricula = "";
    }
    
    //Constructor parametrizado
     public Coche(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }
     
     //Getters y Setters
     
         public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //ToString
    
     @Override
    public String toString() {
        return "Coche{" + "nombre =" + nombre + ", matricula =" + matricula + '}';
    }
    
}
