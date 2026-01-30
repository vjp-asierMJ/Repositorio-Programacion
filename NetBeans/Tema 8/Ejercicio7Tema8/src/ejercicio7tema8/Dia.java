/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema8;

/**
 *
 * @author alumno
 */
public class Dia {
    
    private String nombreDia;
    private int temperatura;
    
    
    //Constructor por defecto
    public Dia(){
    
        nombreDia = "";
        temperatura = 0;
    }
    
    //Constructor parametrizado
    public Dia(String nombreDia, int temperatura){
    
    
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }
    
    //Getters y Setters
    
    public void setNombreDia(String nombreDia){
    
        this.nombreDia = nombreDia;
    }
    
    public String getNombreDia(){
    
        return this.nombreDia;
    }
    
    public void setTemperatura(int temperatura){
    
        this.temperatura = temperatura;
    }
    
    public int getTemperatura(){
    
        return this.temperatura;
    }
    
    
    
    
    //To String
    @Override
    
    public String toString(){
    
        return " El dia : "+this.nombreDia+
                " | temperatura "+this.temperatura;
    }
}
