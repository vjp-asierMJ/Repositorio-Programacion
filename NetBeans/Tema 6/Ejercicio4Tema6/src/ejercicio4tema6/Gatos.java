/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tema6;

/**
 *
 * @author alumno
 */
public class Gatos extends Felinos {
     public Gatos(){
        super();
    }
    public Gatos(String nombre, int edad, int peso){
        super(nombre,edad,peso);
    }
    @Override
    final public String mostrarSonido(){
       return "Maullido";
    }
    @Override
    final public String alimentacion(){
        return "Ratones";
    }
    @Override
    
    final public String habitat(){
        return "Domestico";
    }
    @Override
    final public String nombreCientifico(){
        return "Felis silvestris catus";
    }
    
    @Override
    public String toString(){
        return "========== GATO =========="+
                " | Nombre : " + this.getNombre() + 
                " | Edad : " + this.getEdad() +
                " | Peso : " +this.getPeso()+
                " | Sonido : "+this.mostrarSonido()+
                " | Alimentacion : "+this.alimentacion()+
                " | Habitad : "+this.habitat()+
                " | Nombre Cientifico : "+this.nombreCientifico();
}
}
