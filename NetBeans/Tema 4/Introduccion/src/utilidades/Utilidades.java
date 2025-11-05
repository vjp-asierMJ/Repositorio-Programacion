/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Utilidades {
    public static int pedirNumero (){
         
    Scanner entrada = new Scanner(System.in);
        System.out.println("escribe un numero");
        int num;
        num = entrada.nextInt();
        return num;
    }
    public static char letraAleatoria(){
        int codigoAscii = (int)(Math.random()*25+1 +(int)'a');
        return (char) codigoAscii;        
    }
}
