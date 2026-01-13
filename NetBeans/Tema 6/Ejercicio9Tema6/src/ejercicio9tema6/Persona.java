/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9tema6;

/**
 *
 * @author Asier
 */
public class Persona implements Gravable{
    private String dni;
    private float ingresosAnuales;
   
    
    
    
    public Persona(){
        this.dni = "";
        this.ingresosAnuales = 0f;
       
    }
    public Persona(String dni, float ingresosAnuales) {
    
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }
    
    public String getDni(){
        return this.dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public float getIngresosAnuales(){
       return this.ingresosAnuales;
    }
    public void setIngresosAnuales(float ingresosAnuales){
        this.ingresosAnuales = ingresosAnuales;
    }

    
    //Metodos
    
    @Override
    public void calcularInpuesto(){
        if(this.ingresosAnuales <= 12450) {
           this.ingresosAnuales = this.ingresosAnuales * 19 /100;
            System.out.println("19% de IRPF");
        }
        else if (this.ingresosAnuales <= 20200) {
            this.ingresosAnuales = this.ingresosAnuales * 24 /100;
            System.out.println("24% de IRPF");
        }
        else if (this.ingresosAnuales <= 35200) {
            this.ingresosAnuales = this.ingresosAnuales * 30 / 100;
            System.out.println("30% de IRPF");
            
        }
        else if (this.ingresosAnuales <= 60000) {
            this.ingresosAnuales = this.ingresosAnuales * 37 /100;
        }
        else if (this.ingresosAnuales <= 300000) {
            this.ingresosAnuales = this.ingresosAnuales *45 /100;
        }
        else {
            this.ingresosAnuales = this.ingresosAnuales * 47 / 100;
        }
    }
    
    //To string
    
    @Override
    public String toString(){
        return "DNI : "+this.dni +
                " | Ingresos Anuales : " +this.ingresosAnuales + " € ";
                
                
    }
}

