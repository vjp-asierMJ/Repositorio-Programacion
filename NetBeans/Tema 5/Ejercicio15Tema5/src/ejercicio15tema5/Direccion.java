/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    public Direccion(){
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }
    public Direccion(String calle, int numero, int piso, String ciudad){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    public String getCalle(){
        return this.calle;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getPiso(){
        return this.piso;
    }
    public void setPiso(int piso){
        this.piso = piso;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    //Metodos
    
    
    //To String
    @Override
    public String toString(){
        return "La calle es :"+this.calle+" el numero es: "+this.numero+" , el piso es :"+this.piso+" y la ciudad es : "+this.ciudad;
    }
    
}
