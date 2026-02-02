/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11y12tema8;

/**
 *
 * @author alumno
 */

public class Muebles {
    //Variables
    private int precio;
    private String descripcion;
    
    public Muebles(){ //Constructor por defecto
    
        this.precio = 0;
        this.descripcion = "";
    }
    public Muebles(int precio,String descripcion){ //Constructor parametrizado
    
        this.precio = precio;
        this.descripcion = descripcion;
    }
    //Getters y Setters
    public void setPrecio(int precio){
    
        this.precio = precio;
    }
    public int getPrecio(){
    
        return this.precio;
    }
    public void setDescripcion(String descripcion){
    
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
    
        return this.descripcion;
    }
    
    
    
    //To String
    
    @Override
    public String toString(){
    
        return " Precio : "+this.precio+
                " | Descripcion "+this.descripcion;
    }
}
