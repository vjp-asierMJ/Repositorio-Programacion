/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema11;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Campania {
     private Set<Donacion> donaciones;
    private String nombreCampania;
    
    //Constructores 
    public Campania(){
        this.donaciones = new LinkedHashSet<>();
        this.nombreCampania = "";
    }
    
    public Campania(Set<Donacion> linkedHashSet, String nombreCampania) {
        this.donaciones = linkedHashSet;
        this.nombreCampania = nombreCampania;
    }
    
    public Campania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
        this.donaciones = new LinkedHashSet<>();
    }
    
    //Getters y Setters 
        public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombreCampania() {
        return nombreCampania;
    }

    public void setNombreCampania(String nombreCampania) {
        this.nombreCampania = nombreCampania;
    }
    
    //To String
    
     @Override
    public String toString() {
        return "Campania{" + "hashSet=" + donaciones + ", nombreCampania=" + nombreCampania + '}';
    }
}
