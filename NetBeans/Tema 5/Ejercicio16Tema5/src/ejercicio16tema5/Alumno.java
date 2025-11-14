/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int nota;
   
    //CONSTRUCTORES
    //Defecto
    public Alumno(){
        this.nombre = "";
        this.nota = 0;
    }
    //Parametrizado
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
    //METODOS
    public String obtenerCalificacion(){
        String resultado = "";
    if (nota <0 || nota > 10) {
        resultado = "Introduce un valor valido";
    }
    else if(nota<=4){
        resultado = "Suspenso";
    }
    else if (nota<=6){
        resultado = "Bien";
    }
    else if (nota <= 8){
        resultado = "Notable";
    }
    else {
        resultado = "Sobresaliente";
    }
    
    return resultado;
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "El nombre es"+this.nombre + "La nota es:"+ this.nota;
    }
    
}
