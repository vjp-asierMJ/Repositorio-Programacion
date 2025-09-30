/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partesjavatema2;

/**
 *
 * @author alumno
 */
//CLASE
public class PartesJavaTema2 {
    //ATRIBUTOS
    int vida = 100;
    int niveles=100;
    //LO MISMO QUE INT PERO SIRVE PARA LETRAS Y CARACTERES
    String genero = "RPG";
        //METODOS
        public static void iniciar(){
            System.out.println("");
        }
        public static void menu(){
            System.out.println("- MENU -");
            System.out.println("Inicia");
            System.out.println("Salir");
            System.out.println("Seleccionar nivel");
            System.out.println("Opciones");
        }
    
    //METODO PRINCIPAL MAIN
    /**
     * @param args the command line arguments
     */
        
        
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int tiempoEspera = 3;
        
        float notaMedia = 6.8F;
        //1. DECLARAR UNA VARIABLE
        char letraDNI;
        
        //2. INICIALIZAR VARIABLE
        letraDNI = 'Z';
        
        System.out.println(letraDNI);
        
        //DECLARAR E INICIALIZAR UNA VARIABLE
        
        boolean encontrado = true;
        
        //LLAMAR METODOS
        iniciar();
        
    }
    
}
