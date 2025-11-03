/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20tema4;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio20Tema4 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2= "Colón";
    
    public final static String PREGUNTA1 = "¿Cual es la capital de España";
    public final static String PREGUNTA2 = "¿Quien descubrio America?";
    
    public final static int PUNTUACION = 5;
    
    /**
     * Metodo que pide al usuario la respuesta
     * @return respuesta del usuario
     */
    public static String pedirRespuesta(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    /**
     * Compara la respuesta del usuario
     * con la respuesta correcta
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * @return True si es correcta y false en caso contrario
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta){
        boolean correcto;
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)){
        correcto = true;    
        }
         else {
         correcto = false;
        }
        return correcto;
           
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puntacionFinal = 0;
        String respuesta;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta,RESPUESTA1)) {
            System.out.println("Muy bien, respuesta correcta");
            puntacionFinal += PUNTUACION;
        }
        else {
            System.out.println("No es correcto. La respuesta correcta seria "+ RESPUESTA1);
        }
        System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta,RESPUESTA2)) {
            System.out.println("Muy bien, respuesta correcta");
            puntacionFinal += PUNTUACION;
        }
        else {
            System.out.println("No es correcto. La respuesta correcta seria "+ RESPUESTA2);
        
    }
        System.out.println("La puntuacion es de "+PUNTUACION);
    
}
}
