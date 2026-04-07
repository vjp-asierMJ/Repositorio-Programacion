/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9tema11;

import java.time.LocalDate;
import java.util.Arrays; 

/**
 *
 * @author alumno
 */
public class Sorteo {

    private LocalDate fechaSorteo;
    private int[] numerosGanadores;

    //Constructores
    public Sorteo() {
        this.fechaSorteo = LocalDate.now();
        this.numerosGanadores = new int[4];
    }

    public Sorteo(LocalDate fechaSorteo,int[] numerosGanadores) {
        this.fechaSorteo = fechaSorteo;
        this.numerosGanadores = numerosGanadores;
    }

    //Getters y Setters
    public LocalDate getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(LocalDate fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public int[] getNumerosGanadores() {
        return numerosGanadores;
    }

    public void setNumerosGanadores(int[] numerosGanadores) {
        this.numerosGanadores = numerosGanadores;
    }

    //toString
    @Override
    public String toString() {
        return "Sorteo{" + "fechaSorteo=" + this.fechaSorteo + ", numerosGanadores=" + Arrays.toString(this.numerosGanadores) + '}';
    }

}
