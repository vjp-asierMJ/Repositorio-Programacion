/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8tema11;

/**
 *
 * @author alumno
 */
public class Sede {

    private String nombre;
    private int ingresos;

    //constructores
    public Sede(String nombre, int ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }
    
    public Sede(){
    
        this.nombre = "";
        this.ingresos = 0;
    }
    
    //getters y setters
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    //To string
    
        @Override
    public String toString() {
        return "Sede{" + "nombre=" + nombre + ", ingresos=" + ingresos + '}';
    }
    

}
