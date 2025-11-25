/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author alumno
 */
public class Leones extends Felinos {
     public Leones(){
        super();
    }
    public Leones(String nombre, int edad, int peso){
        super(nombre,edad,peso);
    }
    @Override
    public String mostrarSonido(){
       return "Rugido";
       
    }
    @Override
     public String alimentacion(){
       return "Carnivoro";
    }
    @Override
    public String habitat(){
        return "Sabana";
    }
    @Override
    public String nombreCientifico(){
        return "Panthera leo";
    }
    
    @Override
    public String toString(){
        return  "========== LEON ==========" +
                " | Nombre : " + this.getNombre() + 
                " | Edad : " + this.getEdad() +
                " | Peso : " +this.getPeso()+
                " | Sonido : "+this.mostrarSonido()+
                " | Alimentacion : "+this.alimentacion()+
                " | Habitad : "+this.habitat()+
                " | Nombre Cientifico : "+this.nombreCientifico();
        
                
                
        }
}
