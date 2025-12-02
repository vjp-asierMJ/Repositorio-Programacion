/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2tema6;

/**
 *
 * @author alumno
 */
public class Profesor extends Persona {
    private String especialidad;
    
    //Constructores
    public Profesor(){
        super();
        especialidad = "";
    }
    public Profesor(String nombre,String especialidad){
        super(nombre);
        this.especialidad = especialidad;
    }
    //Gettes y Setters
    public String getEspecialidad(){
        return this.especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    //Metodos
    @Override
    public String saludar(){
        return "Hola, soy el profesor"+getNombre()+" y soy de la especialidad de "+this.especialidad;
    }
    
    //To string
    @Override
    public String toString(){
        return saludar();
    }
}
