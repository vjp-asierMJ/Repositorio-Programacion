/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7tema4.orden;

/**
 *
 * @author alumno
 */
public class orden {
    
    public static int orden(int num1, int num2, int num3, int num4){
    
        int primero,segundo,tercero,cuarto;
        
        
        if (num1>num2) {
        primero=num1;
        segundo=num2;
        }
        else {
        primero=num1;
        segundo=num2;
        }
        if (num1>num3) {
        primero=num1;
        segundo=num3;
        }
        else{
        primero=num3;
        segundo=num1;
        }
        if (num2>num4){
        primero=num2;
        segundo=num4;
        }
        else{
        primero=num4;
        segundo=num2;
        } // Comparo todas las posibilidades para sacar el mayor
        
        if (num1>num2) {
        segundo=num1;
        tercero=num2;
        }
        else {
        segundo=num1;
        tercero=num2;
        }
        if (num1>num3) {
        segundo=num1;
        tercero=num3;
        }
        else{
        segundo=num3;
        tercero=num1;
        }
        if (num2>num4){
        segundo=num2;
        tercero=num4;
        }
        else{
        segundo=num4;
        tercero=num2;
        }//Para sacar el segundo mayor
        
        if (num1>num2) {
        tercero=num1;
        cuarto=num2;
        }
        else {
        tercero=num1;
        cuarto=num2;
        }
        if (num1>num3) {
        tercero=num1;
        cuarto=num3;
        }
        else{
        tercero=num3;
        cuarto=num1;
        }
        if (num2>num4){
        tercero=num2;
        cuarto=num4;
        }
        else{
        tercero=num4;
        cuarto=num2;
        //Para sacer el tercero y el cuarto
       
          
    
    
}
       return primero;
       
       
       
        }
    }
