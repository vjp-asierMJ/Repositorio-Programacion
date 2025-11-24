/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23tema5;

/**
 *
 * @author alumno
 */
public class Taxi extends Vehiculo {
    private int numeroLicencia;
    
    
    public Taxi() {
        super(); //Inicializa por defecto los atributos de la clase
//        super.setMatricula(matricula); //Si quiero un unico atributo en especigficp
        this.numeroLicencia = 0;
    }
    public Taxi(String matricula, String modelo, int potenciaCV, int licencia){
        super(matricula,modelo,potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }
    
    public int getNumeroLicencia(){
        return this.numeroLicencia;
    }
    public void setNumeroLicencia(int numeroLicencia){
        this.numeroLicencia = numeroLicencia;
    }
    
    @Override
    public String toString(){
        return super.toString() + ". Taxi con numero de Licencia"+this.numeroLicencia;
    }
}
