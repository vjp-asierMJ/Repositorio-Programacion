/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author alumno
 */
public class Vehiculo {
    private String matricula;
    private String modelo;
    private int potenciaCV;
    
   public Vehiculo(){
       this.matricula = "";
       this.modelo = "";
       this.potenciaCV = 0;
   }
   public Vehiculo(String matricula, String modelo, int potenciaCV){
       this.matricula = matricula;
       this.modelo = modelo;
       this.potenciaCV = potenciaCV;
   }
    public String getMatricula(){
    return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
     public String getModelo(){
    return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
     public int getPotenciaCV(){
    return this.potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV){
        this.potenciaCV = potenciaCV;
    }
    
    @Override
    public String toString(){
        return " Vehiculo: "+ this.modelo + "  | matricula" + this.matricula + " | Potencia "+this.potenciaCV;
    }
}

