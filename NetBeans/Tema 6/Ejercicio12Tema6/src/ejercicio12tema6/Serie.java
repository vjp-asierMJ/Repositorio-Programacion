/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12tema6;

/**
 *
 * @author Asier
 */
import java.util.Scanner;
public final class Serie extends Contenido{
    private int numeroTemporadas;
    private String creador;
    
    public Serie(){
        this.numeroTemporadas = 3;
        this.creador = "";
        super("",false,"");
    }
    public Serie(int numeroTemporadas, String creador, String titulo, boolean entregado, String genero) {
        this.numeroTemporadas = numeroTemporadas;
        this.creador = creador;
        super(titulo,entregado,genero);
    }
    public int getNumeroTemporadas(){
        return this.numeroTemporadas;
    }
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }
    public String getCreador(){
        return this.creador;
    }
    public void setCreador(String creador){
        this.creador = creador;
    }
    
    //Metodos
    
    public String valorar(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce una valoración entre el 1 y el 5");
        entrada.nextLine();
        
        return entrada.nextLine();
    }
    @Override
    public boolean entregar(){
        if(!esEntregado()) {
            
        }
                
                
    }
            
}
