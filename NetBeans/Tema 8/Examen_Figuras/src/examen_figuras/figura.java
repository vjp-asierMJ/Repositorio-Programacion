/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_figuras;

/**
 *
 * @author alumno
 */
public class figura {

    private String nombre; //Parametros
    private int valor;
    private String coleccion;

    public figura() { //Constructor por defecto

        this.nombre = "";
        this.valor = 0;
        this.coleccion = "";
    }

    public figura(String nombre, int valor, String coleccion) { //Constructor parametrizado
        this.nombre = nombre;
        this.valor = valor;
        this.coleccion = coleccion;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    //To String
    @Override
    public String toString() {

        return "Nombre : " + this.nombre
                + " | Valor : " + this.valor
                + " | Coleccion : " + this.coleccion;
    }

}
