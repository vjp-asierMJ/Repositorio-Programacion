/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
public class Coche {
    
    //1. ATRIBUTOS: caracteristicas. Nunca se inicializan aquí
    
    //MODIFICADORES DE ACCESO
   
    private String ruedas;
    private String suspension;
    private int espejos;
    
    //2. CONSTRUCTORES: permiten "construir"(instanciar) un objeto de este tipo
    //Inicializan todos los atributos
    //2.1 CONSTRUCTOR POR DEFECTO ()
    public Coche(){
        this.ruedas = "";
        this.suspension = "";
        this.espejos = 0;
    }
    
    //2.2 CONSTRUCTOR PARAMETRIZADO (sobrecarga de metodos y autorreferncia this)
    public Coche(String ruedas, String suspension, int espejos){
       this.ruedas = ruedas;
       this.suspension = suspension;
       this.espejos = espejos;
    }
    //3 METODOS:
    //3.1 GETTER Y SETTERS: devuelven y establecen el valor de los atributos
    public String getRuedas(){
        return this.ruedas;
    }
    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    public String getSuspension(){
        return this.suspension;
    }
    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    public int getEspejos(){
        return this.espejos;
    }
    public void setEspejos(int espejos){
       this.espejos = espejos;
    }
    
    //3.2 OTROS METODOS(opcional)
    public void acelerar() {
        System.out.println("Acelerando coche...");
    }
    
    public void frenar(){
        System.out.println("Frenando coche...");
    }
    public void girar(){
        System.out.println("Girando coche...");
    }
    
    
    //4 TO STRING devuelve un String con los datos del objeto
    @Override
    public String toString(){
        return  "Mi coche tiene ruedas"+this.ruedas+", suspension"+this.suspension+" y "+this.espejos+" espejos";
    }
}
