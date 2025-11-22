/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    public Empleado(){
        this.direccion = direccion;
        this.nombre = "";
        this.salario = 0;
    }
    public Empleado( String nombre, int salario, Direccion direccion){
        this.direccion = direccion;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //Getters y setters
    
    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    
    //to strign
    @Override
    public String toString(){
        return "El nombre es : "+this.nombre+ ", el salario es : "+this.salario+ " y la direccion es :"+this.direccion;
    }
}
