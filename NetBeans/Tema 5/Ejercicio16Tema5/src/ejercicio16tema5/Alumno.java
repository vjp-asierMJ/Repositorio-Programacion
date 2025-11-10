/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema5;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota= nota;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getNota(){
        return this.nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        return "El nombre es"+this.nombre + "La nota es:"+ this.nota;
    }
}
