/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema6;

/**
 *
 * @author alumno
 */
public abstract class Calculadora {
    private int numero;
    
    
    //Constructores
    public Calculadora(){
        this.numero = 0;
    }
    public Calculadora(int numero){
        this.numero = numero;
    }
    //Getters y Setters
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    //Metodos
    
    public abstract void realizarOperacion();
    //To string
    
    @Override
    public String toString(){
        return "Numero : "+this.numero;
    }
}
