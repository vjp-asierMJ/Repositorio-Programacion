/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5tema6;

/**
 *
 * @author alumno
 */
public class Murcielago extends Mamifero implements Volador{
   private int alturaVuelo;
   
   public Murcielago(){
       super();
       this.alturaVuelo = 0;
   }
   public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo){
       super(nombre,sexo,color,edad);
       this.alturaVuelo = alturaVuelo;
   }
   public int getAlturaVuelo(){
       return this.alturaVuelo;
   }
   public void setAlturaVuelo(int alturaVuelo){
       this.alturaVuelo = alturaVuelo;
   }
   
   //Metodos
   @Override
   public String obtenerMensajeVolador(){
       return "El murcielago es un animal volador";
   }
   @Override
   public void aumentarAlturaVuelo(){
       this.alturaVuelo+=5;
   }
   @Override
   public void bajarAlturaVuelo(){
       this.alturaVuelo-=5;
   }
   @Override
   public void mostrarAlturaVuelo(){
       System.out.println("Estoy volando a :"+this.alturaVuelo+" metros.");
   }
   
   //To string
   @Override
   public String toString(){
       return super.toString() + " | Altura Vuelo actual " + this.alturaVuelo;
   }
}

