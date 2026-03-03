/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13tema10;

/**
 *
 * @author alumno
 */
public class Venta {

    
    
    private String nombreMes;
    private int ventasCoches;
    
    //Constructores
    
    public Venta(){
    
        this.nombreMes = "";
        this.ventasCoches = 0;
    }
  
     public Venta(String nombreMes, int ventasCoches) {
        this.nombreMes = nombreMes;
        this.ventasCoches = ventasCoches;
    }
     
     //Getters y Setters
     
       public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getVentasCoches() {
        return ventasCoches;
    }

    public void setVentasCoches(int ventasCoches) {
        this.ventasCoches = ventasCoches;
    }
    
    //To String
    
    @Override
    public String toString() {
        return "Mes : " + this.nombreMes + " ventas : " + this.ventasCoches;
    }
    
    
}
