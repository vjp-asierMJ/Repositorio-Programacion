/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8tema11;

import java.util.LinkedHashSet;

/**
 *
 * @author alumno
 */
public class Ciudad {
    
    private String nombre;
    private LinkedHashSet<Sede> sedes = new LinkedHashSet<>();

    //constructores
    public Ciudad(String nombre,LinkedHashSet<Sede>sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }
    
    public Ciudad(){
    
        this.nombre= "";
        this.sedes = new LinkedHashSet<>();
    }
    
    //Getters y Setters
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedHashSet<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(LinkedHashSet<Sede> sedes) {
        this.sedes = sedes;
    }
    
    //To string
    
        @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes + '}';
    }
}
