/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5tema6;

/**
 *
 * @author alumno
 */
public abstract class Mamifero {
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    public Mamifero(){
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    public Mamifero(String nombre, String sexo, String color, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(){
        this.edad = edad;
              
    }
    
    @Override
    public String toString(){

    return "Nombre: "+this.nombre +
            " | Color : "+this.color+
            " | Edad: "+this.edad;
}
}
