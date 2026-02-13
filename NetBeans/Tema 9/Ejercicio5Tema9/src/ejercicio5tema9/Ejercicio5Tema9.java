/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tema9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio5Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        String dia;
        String diaMinuscula = "";
        int aux = 0; //Variables
        
        String [] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; //Creamos un array con los dias de la semana
     
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana");
       
        dia = entrada.nextLine();
        
        diaMinuscula = dia.toLowerCase(); //Guardamos el dia en minuscula
        
        for(i=0;i<semana.length;i++){
        
            if(diaMinuscula.compareToIgnoreCase(semana[i]) == 0) { //Lo comparamos ignorando las mayusculas
            
               aux = i; //Guardamos la posicion del dia
            }
            
        }
        
        System.out.println("La posicion del dia que has introducido es la "+aux);
    }
    
}
