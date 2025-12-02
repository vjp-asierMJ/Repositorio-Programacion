/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema6;

/**
 *
 * @author alumno
 */
public class Suma extends Calculadora {
    private int sumando;
    
    //Constructores
    public Suma(){
        super();
        this.sumando = 0;
    }
    public Suma (int numero,int sumando){
        super(numero);
        this.sumando = sumando;
    }
    //Getters y Setters
    public int getSumando(){
        return this.sumando;
    }
    public void setSumando(int sumando){
        this.sumando = sumando;
    }
    
    //Metodos
    @Override
    public void realizarOperacion(){
        int resultado;
        
        resultado = this.sumando + getNumero();
        System.out.println("La suma es : "+resultado);
    }
    
    //TO string
    @Override
    public String toString(){
      return super.toString() + " + "+this.sumando;
    }
}
