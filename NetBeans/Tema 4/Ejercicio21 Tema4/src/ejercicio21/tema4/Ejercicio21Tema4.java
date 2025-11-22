/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21.tema4;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio21Tema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        resultado();
    }
    
    public static int numero1(){
    int num1;
    
    
    Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero");
        num1 = entrada.nextInt();
        return num1;
    }
    
    public static int numero2(){
        int num2;
        int num1;
    
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce el segundo numero");
        num2 = entrada.nextInt();
    
        num1=numero1();
    
        while (num1 != num2 ){
        System.out.println("Introduce un numero diferente al primero");    
        num2= entrada.nextInt();
    }   
        return num2;
    }
    
    public static void resultado (){
        int num1;
        int num2;
        int i;
    
        num1 = numero1();
        num2 = numero2();
    
        for(i=0;num1>i&&i<num2;i++) {
            if (i%2==0){
            System.out.println(i);
        }
    }
    }
    
}
