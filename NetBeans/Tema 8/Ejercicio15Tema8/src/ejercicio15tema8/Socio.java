/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema8;

/**
 *
 * @author alumno
 */
public class Socio {


    private String nombre;
    private int precioAbonado;

   
    //Construcores
    
    public Socio(){
    
        this.nombre = "";
        this.precioAbonado = 0;
    }
    
    public Socio(String nombre, int precioAbonado) {
        this.nombre = nombre;
        this.precioAbonado = precioAbonado;
    }
    
    //Getters y Setters
    
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioAbonado(int precioAbonado) {
        this.precioAbonado = precioAbonado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecioAbonado() {
        return precioAbonado;
    }
    
    
    //Metodos
    
    
    
    //To String
    
    @Override
    
    public String toString(){
    
        return " Nombre "+this.nombre+
                " | Precio Abonado "+this.precioAbonado;
    }
    
    
}
