/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo;

import java.util.HashSet;

/**
 *
 * @author alumno
 */
public class Deporte {

    //atributos
    private String nombre;
    private HashSet<Equipo> equipos;

    //constructores
    public Deporte() {
        this.nombre = "";
        this.equipos = new HashSet<>();
    }

    public Deporte(String nombre, HashSet<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    //getters y setters 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(HashSet<Equipo> equipos) {
        this.equipos = equipos;
    }

    //toString
    @Override
    public String toString() {
        return "Deporte{" + "nombre=" + nombre + ", equipos=" + equipos + '}';
    }

}
