/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.de.donaciones.ampliacion;

/**
 *
 * @author alumno
 */
import java.util.Scanner;


public class ProgramaDeDonacionesAmpliacion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario;
        String contraseña;
        
        
      //  registro();
       // usuario();
        password();
       
        
    }
    public static void registro(){
        System.out.println("- BIENVENIDO/A A LA PLATAFORMA DE DONACIONES -");
        System.out.println("Completa el registro para comenzar:");
        
    }
    public static void usuario(){
        int contador = 5;
        String usuario = "";
        boolean correcto;
        correcto = usuario.contains("@")&& (usuario.endsWith(".es")) || (usuario.endsWith(".com"));
        
        while(!correcto || contador == 0){
        System.out.println("Email: ");
        Scanner entrada = new Scanner(System.in);
        usuario = entrada.nextLine();
        
        if(correcto == true){
            System.out.println("[✔ Usuario correcto]");
        }
        else {
            System.out.println("Email incorrecto. Por favor, vuelva a intentarlo");
            contador--;
            System.out.println("Intentos restantes : "+contador);
        }
        if(contador ==0){
            System.out.println("Error, no quedan intentos");
        }
        
        }
    }
    public static void password(){
            String contrasena;
            boolean valida = false;
            int contador;
            contador = 5;
            Scanner entrada = new Scanner(System.in);
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
            
            
            
        // a. Al menos 8 caracteres
        while (valida == true || contador == 0) {
        if (contrasena.length() < 8) {
            System.out.println("❌ Debe tener al menos 8 caracteres.");
            valida = false;
            contador--;
            System.out.println(contador+" intentos");
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
        }

        // b. Al menos una mayúscula
        else if (!contrasena.matches(".*[A-Z].*")) {
            System.out.println("❌ Debe contener al menos una mayúscula.");
            valida = false;
            contador--;
            System.out.println(contador+" intentos");
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
        }

        // c. Al menos una minúscula
        else if (!contrasena.matches(".*[a-z].*")) {
            System.out.println("❌ Debe contener al menos una minúscula.");
            valida = false;
            contador--;
            System.out.println(contador+" intentos");
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
        }

        // d. Al menos un número
        else if (!contrasena.matches(".*[0-9].*")) {
            System.out.println("❌ Debe contener al menos un número.");
            valida = false;
            contador--;
            System.out.println(contador+" intentos");
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
        }

        // e. Al menos un carácter especial
        else if (!contrasena.matches(".*[*!.,@#$%^&()+=?-].*")) {
            System.out.println("❌ Debe contener al menos un carácter especial.");
            valida = false;
            contador--;
            System.out.println(contador+" intentos");
            System.out.println("Contrasena : ");
            contrasena = entrada.nextLine();
        }

        else {
            valida = true;
            System.out.println("✅ Contraseña válida.");
        }
            
    }
    }
}
    

