/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author alumno
 */
public class Perro extends Canidos {
    
    public Perro(){
        super();
    }
    public Perro(String nombre, int edad, int peso){
        super(nombre,edad,peso);
    }
    @Override
    public String mostrarSonido(){
        
       return "Ladrido";
    }
    @Override
    public String alimentacion(){
        
        return "Carnivoro";
    }
    @Override
    public String habitat(){
        return "Domestico";
    }
    @Override
    public String nombreCientifico(){
     
       return "Canis Lupus familiaris";
    }
    
     @Override
    public String toString(){
        return  "PERRO" +
                " | Nombre : " + this.getNombre() + 
                " | Edad : " + this.getEdad() +
                " | Peso : " +this.getPeso()+
                " | Sonido : "+this.mostrarSonido()+
                " | Alimentacion : "+this.alimentacion()+
                " | Habitad : "+this.habitat()+
                " | Nombre Cientifico : "+this.nombreCientifico();
    
    
}
}