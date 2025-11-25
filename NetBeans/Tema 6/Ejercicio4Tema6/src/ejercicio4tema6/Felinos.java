/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author alumno
 */
public abstract class Felinos extends Animal {
    public Felinos(){
        super();
    }
    
    public Felinos(String nombre, int edad, int peso){
        super(nombre,edad,peso);
    }
    
    //METODOS
    @Override
    public abstract String mostrarSonido();
    @Override
    public abstract String alimentacion();
       
    @Override
    public abstract String habitat();
    @Override
    public abstract String nombreCientifico();
    
    @Override
    public String toString(){
        return "Nombre : " + this.getNombre() + 
                " | Edad : " + this.getEdad() +
                " | Peso : " +this.getPeso();
                
                
        }
}
