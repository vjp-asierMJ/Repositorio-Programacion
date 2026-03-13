/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16tema10;

/**
 *
 * @author alumno
 */
public class Tienda {
    
    //atributos
    
    private String nombreProducto;
    private float precio;
    private int stock;
    
    //Constructores
    public Tienda() {
        this.nombreProducto = "";
        this.precio = 0.0f;
        this.stock = 0;
    }
    
    public Tienda(String nombreProducto, float precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }
    
    
    
    
    //Getters y Setters 
        public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //To String
    
        @Override
    public String toString() {
        return "Tienda{" + "nombreProducto=" + nombreProducto + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
    
    
    
}
