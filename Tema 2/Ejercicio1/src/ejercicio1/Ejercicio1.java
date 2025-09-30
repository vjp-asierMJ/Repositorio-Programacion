/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 *
 */
public class CAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    int dato1;
    int dato2, resultado;//Declaro, a la vez, dos variables enteras: dato 2 y resultado
    
    dato1 = 20; //Asigno el valor 20 a la variable dato1
    dato2 = 10;
    //Suma
    resultado = dato1 + dato2; //Guardo la suma de las dos variables en la variable resultado
        System.out.println(dato1+"+"+dato2+"+"+ "="+resultado);
    //resta
        resultado = dato1 - dato2; //Guardo la resta de las dos variables en la variable resultado
        System.out.println(dato1+"-"+dato2+"-"+ "="+resultado);
      //Producto 
     resultado = dato1 * dato2; //Guardo la multiplicacion de las dos variables en la variable resultado
        System.out.println(dato1+"*"+dato2+"*"+ "="+resultado);
     //Cociente
     resultado = dato1 / dato2;
        System.out.println(dato1+"/"+dato2+"="+ resultado);
        
    }

    
    
}
