/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio9tema9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio9Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usuario;
        String password;
        String usuarioLower;
        String passwordLower;
        
        int [] numeros = {1,2,3,4,5,6,7,8,9};
        
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el usuario");
        
        usuario = entrada.nextLine();
        usuarioLower = usuario.toLowerCase();
        
        System.out.println("Introduce la contraseña");
        
        password = entrada.nextLine();
        passwordLower = password.toLowerCase();
        
        if(password.length() <6 ){
        
            System.out.println("La contraseña debe tener al menos 6 digitos");
            System.out.println("Introduzca contraseña ");
            
            password = entrada.nextLine();
        }
        
        
        for(int i = 0; i<password.length();i++){
        
            for(int j = 0; j<password.length();j++){
            
                if(password.charAt(i) == numeros[j]){
                
                    contador++;
                }
            }
        }
        
        if(contador < 2) {
        
            System.out.println("La contraseña debe tener almenos 2 digitos");
        }
        
        if(passwordLower.contains(usuarioLower)){
        
            System.out.println("La contraseña no puede incluir el nombre de usuario");
            System.out.println("Introduce contraseña");
            password = entrada.nextLine();
        }
    }
    
}
