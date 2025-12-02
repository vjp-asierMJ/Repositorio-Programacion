/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2tema6;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona {
    private String grupo;
    
    //Constructores
    public Alumno(){
        super();
        this.grupo = "";
    }
    public Alumno(String nombre,String grupo){
        super(nombre);
        this.grupo = grupo;
    }
    public String getGrupo(){
        return this.grupo;
    }
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }
    //Metodos
    
    @Override
    public String saludar(){
       return "Hola, soy el alumno"+getNombre()+" y soy del grupo "+this.grupo; 
    }
    
    //To string
    
    @Override
    public String toString(){
        return saludar();
    }
}
