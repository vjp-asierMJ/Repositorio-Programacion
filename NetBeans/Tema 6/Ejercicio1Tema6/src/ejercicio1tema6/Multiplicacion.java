/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema6;

/**
 *
 * @author alumno
 */
public class Multiplicacion extends Calculadora {
    private int multiplicador;
    
    //Constructores
    public Multiplicacion(){
        super();
        this.multiplicador = 0;
    }
    public Multiplicacion(int numero, int multiplicador){
        super(numero);
        this.multiplicador = multiplicador;
    }
    
    //Getters y Setters
    
    public int getMultiplicador(){
        return this.multiplicador;
    }
    public void setMultiplicador(int multiplicador){
        this.multiplicador = multiplicador;
    }
    
    //Metodos
    
    @Override
    public void realizarOperacion(){
        int resultado;
        
        resultado = getNumero() * this.multiplicador;
        
        System.out.println("El resultado es : "+resultado);
    }
    
    //TO string
    
    @Override
    
    public String toString(){
        return super.toString() + " * " + this.multiplicador;
    }
}
