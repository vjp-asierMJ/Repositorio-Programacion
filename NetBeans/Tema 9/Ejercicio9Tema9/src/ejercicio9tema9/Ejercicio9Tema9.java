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

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Array con los numeros

        int contador = 0;
        int errores = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el usuario");

        usuario = entrada.nextLine(); //Pedimos el usuario
        usuarioLower = usuario.toLowerCase(); //Lo ponemos en minusculas

        do { //Bucle

            errores = 0; //Actualizamos los contadores
            contador = 0;

            System.out.println("Introduce la contraseña:");
            password = entrada.nextLine();
            passwordLower = password.toLowerCase(); //Pasamos la contraseña a minusculas

            // Longitud
            if (password.length() < 6) { //Si es menor a 6
                System.out.println("La contraseña debe tener al menos 6 caracteres.");
                errores++; //Aumentamos el contador de errores
            }

            // Contar los dijitos
            for (int i = 0; i < password.length(); i++) {

                for (int j = 0; j < numeros.length; j++) { //Doble for para contar los dijitos

                    if (Character.isDigit(password.charAt(i))) { //Por cada digito aumentamos el contador
                        contador++;
                    }
                }
            }

            if (contador < 2) { //Si tiene menos de dos digitos
                System.out.println("La contraseña debe tener al menos 2 dígitos.");
                errores++;
            }

            // Que no tenga el usuario en la contraseña
            if (passwordLower.contains(usuarioLower)) {//Si contiene la contraseña aumentamos los errores
                System.out.println("La contraseña no puede contener el nombre de usuario.");
                errores++;
            }

        } while (errores != 0);//El bucle funciona mientras tenga algun error

        System.out.println("Usuario creado correctamente");

    }
}
