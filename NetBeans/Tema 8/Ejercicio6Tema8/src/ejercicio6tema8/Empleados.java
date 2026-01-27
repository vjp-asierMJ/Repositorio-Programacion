/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6tema8;

/**
 *
 * @author alumno
 */
public class Empleados {
    
    private String nombre;
    private int numeroHoras;
    private int tarifa;
    
    //Constructores
    public Empleados(){
    
        nombre = "";
        numeroHoras = 0;
        tarifa = 0;
    }
    
    public Empleados(String nombre, int numeroHoras,int tarifa){
    
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.tarifa = tarifa;
    }
    
    
    //Getter y Setters
    
    public void setNombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public String getNombre(){
    
        return this.nombre;
    }
    
    public void setNumeroHoras(int numeroHoras){
    
        this.numeroHoras = numeroHoras;
    }
    
    public int getNumeroHoras(){
    
        return this.numeroHoras;
    }
    public void setTarifa(int tarifa){
    
        this.tarifa = tarifa;
    }
    
    public int getTarifa(){
    
        return this.tarifa;
    }
    
    //Metodos
    
    public static float tarifaPorHoras(int numeroHoras, int tarifa){
    
        int sueldo, resto;
        
        if(numeroHoras > 0 && numeroHoras <= 40) {
        
            sueldo = numeroHoras*tarifa;
        }
        
        
    
    }
    
    //To String
    
    @Override
    public String toString(){
    
    return "Nombre : "+this.nombre+
            " | Horas Trabajadas : "+this.numeroHoras+
            " | Tarifa : "+this.tarifa;
    }
}
