/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13y14tema8;

/**
 *
 * @author alumno
 */
public class Alumno {
    
    //Atributos
    private String nombre;
    private int edad;
    private float notaMedia;
    
    public Alumno(){ //Constructor por defecto
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0f;
    }
    
    public Alumno(String nombre,int edad,float notaMedia){ //Constructor parametrizado
    
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    //Getters y Setter
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public String getNombre(){
    
        return this.nombre;
    }
    
    public void setEdad(int edad){
    
        this.edad = edad;
    }
    
    public int getEdad(){
    
        return this.edad;
    }
    
    public void setNotaMedia(float notaMedia){
    
        this.notaMedia = notaMedia;
    }
    
    public float getNotaMedia(){
    
        return this.notaMedia;
    }
    
    
    
    
    //To String
    @Override
    
    public String toString(){
    
        return " Nombre : "+this.nombre+
                " | Edad : "+this.edad+
                " | Nota Media : "+this.notaMedia;
    }
}
