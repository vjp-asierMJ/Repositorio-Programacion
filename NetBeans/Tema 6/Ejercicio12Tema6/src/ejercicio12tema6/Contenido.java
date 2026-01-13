/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author Asier
 */
public abstract class Contenido implements contenidos{
    private String titulo;
    private boolean entregado;
    private String genero;
    
    public Contenido () {
        this.titulo = "";
        this.entregado = false;
        this.genero = "";
    }
    
    public Contenido(String titulo, boolean entregado, String genero){
        this.titulo = titulo;
        this.entregado = entregado;
        this.genero = genero;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    //Metodos
    
    public abstract void valoracionContenidos();
    

    @Override
    public boolean esEntregado() {
        return entregado;    
}
}


