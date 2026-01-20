/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16tema7;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio16Tema7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] array = new int [6][4];
        
        String [] alumnos = {"Pepe","Juan","Ana","Marta","Pedro","Maria"};
        
        String [] asignaturas = {"Lengua","Mates","Historia","Fisica"};
    
        rellenarArray(array,alumnos,asignaturas);
        
        mostrarArray(array,alumnos,asignaturas);
        
    }
    
    
    public static void rellenarArray(int [][] array,String [] alumnos, String [] asignaturas){
    
        int i,j;
        int nota;
    
        Scanner entrada = new Scanner(System.in);
        
        for(i=0;i<array.length;i++) {
        
            for(j=0;j<array[0].length;j++){
            
                System.out.println("Asignatura : "+asignaturas[j]+ ", alumno "+alumnos[i]);
                
                nota = entrada.nextInt();
                
                array[i][j] = nota;
                    
            }
        }
    
    }
    
    public static void mostrarArray(int [][] array,String [] alumnos, String [] asignaturas){
    
    int i,j;
    
    for(i=0;i<array.length;i++) {
        
            for(j=0;j<array[0].length;j++){
            
                
                System.out.println("Asignatura : "+asignaturas[j]+ ", alumno "+alumnos[i]+ ", nota : "+array[i][j]);
        
            }
        }
    }
    
    public static void mejorMedia(int [][] array,String [] alumnos, String [] asignaturas){
    
        int i, j;
        
        float mayorMedia = array[0][0];
        float media;
        int alumno = 0;
        float suma = 0;
        
        for(i=0;i<array.length;i++) {
        
            for(j=0;j<array[0].length;j++){
    
            suma = suma + array[i][j];
            
            }
            
            media = suma/array[0].length;
            
            if(media>mayorMedia) {
            
            mayorMedia = media;
            
            alumno = i;
            
            }
      }
        
        System.out.println("Alumno con mejor media: " + alumnos[alumno] + " -> " + mayorMedia);

    
}
}
