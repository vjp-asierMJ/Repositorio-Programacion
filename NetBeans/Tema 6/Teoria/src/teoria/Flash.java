/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

/**
 *
 * @author alumno
 */
public class Flash extends Superheroe implements SuperVelocidad, Defensa {
     // ATRIBUTOS
    private int velocidadMaxima;

    // CONSTRUCTORES
    public Flash() {
        super();
        this.velocidadMaxima = 1000;
    }
    
    public Flash(String nombre, int velocidadMaxima) {
        super(nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // GETTERS Y SETTERS
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // MÉTODOS
    @Override
    public void entrenar() {
        System.out.println("\n - ENTRENAMIENTO DE " + super.getNombre() + " -");
        System.out.println("Correr 100km a 20km/h");
    }
    
    public void dejarEstela() {
        System.out.println("            \\");
        System.out.println("             \\\\");
        System.out.println("              \\\\");
        System.out.println("   F L A S H   \\\\=====================>>");
        System.out.println("              //");
        System.out.println("             //");
        System.out.println("            /");
    }
     // Métodos de la interfaz SuperVelocidad implementados
    @Override
    public void correrRapido(int velocidad) {
        if(velocidad < velocidadMaxima) {
            System.out.println("Flash: Estoy corriendo a " + velocidad + "km/h.");            
        } else {
            System.out.println("Flash: No puedo correr tan rápido.");
            System.out.println("Mi velocidad máxima es " + velocidadMaxima);
        }
    }
    
    @Override
    public void atravesarObjetos(String objeto) {
        System.out.println("Flash: Estoy atravesando " + objeto + "...");
    }

     @Override
    public void defenderse() {
        System.out.println("Flash: ¡Esquivo ataques a la velocidad del rayo!");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Superhéroe Flash" +
                "\n · Nombre: " + super.getNombre() +
                "\n · Velocidad Máxima:" + velocidadMaxima;
    }
    
}
