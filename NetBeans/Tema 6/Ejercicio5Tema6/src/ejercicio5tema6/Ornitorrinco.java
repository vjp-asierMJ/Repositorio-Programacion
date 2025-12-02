/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5tema6;

/**
 *
 * @author alumno
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    private int numeroHuevos;
   //Constructores
    public Ornitorrinco (){
        super();
        this.numeroHuevos = 0;
    }
    public Ornitorrinco (String nombre, String sexo, String color, int edad, int numeroHuevos){
        super(nombre,sexo,color,edad);
        this.numeroHuevos = numeroHuevos;
    }
    //Getters y Setters
    public int getNumeroHuevos(){
        return this.numeroHuevos;
    }
    public void setNumeroHuevos(int numeroHuevos){
        this.numeroHuevos = numeroHuevos;
    }
    //Metodos
    @Override
    public String obtenerMensajeOviparo(){
        return " El ornitorrinco es un mamifero oviparo";
    }
    @Override
    public void ponerHuevo(){
        this.numeroHuevos++;
    }
    @Override
    public void incubarHuevo(){
        this.numeroHuevos--;
    }
    @Override
    public void mostrarNumHuevos(){
        System.out.println("Tengo : "+this.numeroHuevos+" huevos");
    }
    
    //To string
    @Override
    public String toString(){
        return super.toString() + "| Numero Huevos: "+this.numeroHuevos;
    }
}
