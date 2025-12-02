/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tema6;

/**
 *
 * @author alumno
 */
public class Potencia extends Calculadora {

    private int exponente;
    
    //Constructores
    public Potencia(){
        super();
        this.exponente = 0;
    }
    public Potencia(int numero, int exponente){
        super(numero);
        this.exponente = exponente;
        
    }
       //Getters y Setters
    
    public int getExponente(){
        return this.exponente;
    }
    public void setExponente(int exponente){
        this.exponente = exponente;
    }
    
    //Metodos
    @Override
    public void realizarOperacion(){
        int resultado;
        //Math.pow para la potencia
        resultado =  (int) Math.pow(getNumero(), this.exponente);
        System.out.println("La potencia es : "+resultado);
    }
    //TO string
     @Override
     public String toString(){
         return super.toString() + " con potencia "+ this.exponente;
    }
}  

    