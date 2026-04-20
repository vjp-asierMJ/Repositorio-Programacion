/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubdeportivo;

/**
 *
 * @author alumno
 */
public class Equipo {

    //atributos
    private int codigoEquipo;
    private String nombreEquipo;
    private int trofeos;

    //constructores
    public Equipo() {
        this.codigoEquipo = 0;
        this.nombreEquipo = "";
        this.trofeos = 0;
    }

    public Equipo(int codigoEquipo, String nombreEquipo, int trofeos) {
        this.codigoEquipo = codigoEquipo;
        this.nombreEquipo = nombreEquipo;
        this.trofeos = trofeos;
    }

    //getters y setters
    public int getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(int codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }

    //toString
    @Override
    public String toString() {
        return "Equipo{" + "codigoEquipo=" + codigoEquipo + ", nombreEquipo=" + nombreEquipo + ", trofeos=" + trofeos + '}';
    }

}
