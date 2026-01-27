/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tema8;

/**
 *
 * @author alumno
 */
public class Ejercicio1Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notas=0;
        float media = 0f; //Objetos
        Asignatura[] asignaturas = new Asignatura[6];
        String[] nombres = {"Programacion","Lenguaje de Marcas","Bases de Datos","Entornos de Desarrollo","Sistemas Informaticos","Formacion y Orientacion Laboral"};
        
        
        rellenarAsignaturas(asignaturas,nombres,notas); //Metodos
        media = mediaAsignaturas(asignaturas,nombres,notas);
        mostrarAsignaturas(asignaturas,nombres,notas,media);
    }
    
    public static void rellenarAsignaturas(Asignatura[]asignaturas,String[]nombres,int notas){ //Metodo para rellenar el array
        int i;
        for(i = 0;i<asignaturas.length;i++){ //Recorremos las posiciones
            
            System.out.println("Introduzca la nota de "+nombres[i]);
            notas= Asignatura.pedirNota(); //Tomamos la entrada de la nota
            asignaturas[i] = new Asignatura(nombres[i],notas); //Lo guardamos
        }
    
    }
    
    public static void mostrarAsignaturas(Asignatura[]asignaturas,String[]nombres,int notas,float media){ //Metodo para mostrar el array
    
        int i;
        
        for(i=0;i<asignaturas.length;i++){ //Recorremos las posiciones
        
            System.out.println(asignaturas[i]); //Imprimimos cada posicion
        
        }
        
        System.out.println("La media de notas es de : "+media); //Mostramos la media
    
    }
    
    public static float mediaAsignaturas(Asignatura[]asignaturas,String[]nombres,int notas){ //Metodo para sacar la media
    
        int i;
        float media;
        media = 0f;
        
        for(i=0;i<asignaturas.length;i++){ //Recorremos los valores
        
            media = media + asignaturas[i].getNota(); //Actualizamos el valor de la media
        }
        media = media/asignaturas.length; //Dividimos entre el numero de asignaturas
        
        return media; //Devolvemos la media
    }
    
}
