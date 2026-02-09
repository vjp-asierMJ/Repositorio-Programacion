/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema8;

/**
 *
 * @author alumno
 */
import java.util.Arrays;
public class Pelicula {
    
    private String titulo;
    private int costeLicencia;
    private Socio[] socio;
    
    //Constructores
    public Pelicula(){

        
        this.titulo = "";
        this.costeLicencia = 0;
        this.socio = new Socio[4];
        
    }
    
    public Pelicula(String titulo, int costeLicencia, Socio[] socio){
    
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socio = socio;
    }
    
    public Pelicula(String titulo, int costeLicencia){
    
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;
        this.socio = new Socio[4];
    }
     public Pelicula(Socio[] socio){
    
        this.socio = socio;
     }
    
    //Getters y Setters
    
    public void setTitulo(String titulo){
    
        this.titulo = titulo;
    }
    
    public String getTitulo(){
    
        return this.titulo;
    }
    
    public void setCosteLicencia(int costeLicencia){
    
        this.costeLicencia = costeLicencia;
    }
    
    public int getCosteLicencia(){
    
        return this.costeLicencia;
    }
    
    public void setSocio(Socio[] socio){
    
        this.socio = socio;
    }
    
    public Socio[] getSocio(){
    
        return this.socio;
    }
    
    //Metodos
    
    
    
    
    //ToString
    
    @Override
    
    public String toString(){
    
        return " Titulo "+this.titulo+
                " | Coste Licencia "+this.costeLicencia+
                " | Socios "+this.socio+
                Arrays.toString(socio);
    }
}


