/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tema3;

/**
 *
 * @author Asier
 */
import java.util.Scanner;
        
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int a,b,c,d;
        
        int primero,cuarto;
        
        // int segundo,tercero
        
        Scanner entrada = new Scanner (System.in);
       
        
        System.out.println("Por favor, introduzca el primer numero");
        
         a = entrada.nextInt();
         
         System.out.println("Ahora, introduzca un segundo numero");
         
          b = entrada.nextInt();
          
        System.out.println("Introduzca el tercer numero: ");
        
          c=entrada.nextInt();
        
        System.out.println("Por ultimo, introduzca un cuarto numero: ");
        
           d=entrada.nextInt();
           
        
      //Esto para encontrar cual es el numero mayor     
      if (a>b&&a>c&&a>d){
      
      primero=a;
          System.out.println(primero);
      }
      else if (b>a&&b>c&&b>d) {
      primero=b;
        System.out.println(primero);
      }
      
       else if (c>a&&c>b&&c>d) {
      primero=c;
        System.out.println(primero);
      }
       
      else if (d>a&&d>b&&d>c) {
      primero=d;
        System.out.println(primero);
      }
      
      //Ahora para encontrar el menor
      
      if (a<b&&a<c&&a<d){
      
     cuarto=a;
          System.out.println(cuarto);
      }
      else if (b<a&&b<c&&b<d) {
      cuarto=b;
         System.out.println(cuarto);
      }
      
       else if (c<a&&c<b&&c<d) {
      cuarto=c;
         System.out.println(cuarto);
      }
       
      else if (d<a&&d<b&&d<c) {
      cuarto=d;
         System.out.println(cuarto);
      }
      
      
    }
        
      
      //ESTA PARTE NO HE SIDO CAPAZ DE HACERLA SOLO
      
      
      // Paso 3: encontrar los dos del medio

//        if ((a != primero && a != cuarto) && (b != primero && b != cuarto)) {
//            if (a <= b) {
//                segundo = a;
//                tercero = b;
//            } else {
//                segundo = b;
//                tercero = a;
//            }
//        } else if ((a != primero && a != cuarto) && (c != primero && c != cuarto)) {
//            if (a <= c) {
//                segundo = a;
//                tercero = c;
//            } else {
//                segundo = c;
//                tercero = a;
//            }
//        } else if ((a != primero && a != cuarto) && (d != primero && d != cuarto)) {
//            if (a <= d) {
//                segundo = a;
//                tercero = d;
//            } else {
//                segundo = d;
//                tercero = a;
//            }
//        } else if ((b != primero && b != cuarto) && (c != primero && c != cuarto)) {
//            if (b <= c) {
//                segundo = b;
//                tercero = c;
//            } else {
//                segundo = c;
//                tercero = b;
//            }
//        } else if ((b != primero && b != cuarto) && (d != primero && d != cuarto)) {
//            if (b <= d) {
//                segundo = b;
//                tercero = d;
//            } else {
//                segundo = d;
//                tercero = b;
//            }
//        } else {
//            if (c <= d) {
//                segundo = c;
//                tercero = d;
//            } else {
//                segundo = d;
//                tercero = c;
//            }
//        }


    }
    

