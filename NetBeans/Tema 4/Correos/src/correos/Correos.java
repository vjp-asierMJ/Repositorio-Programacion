/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correos;

/**
 *
 * @author alumno
 */
import java.util.InputMismatchException; //Importo la excepcion
import java.util.Scanner; //Importo el scanner

public class Correos {
public final static char LETRAINICIAL = 'A'; //Declaro las constantes
public final static char LETRAFINAL = 'F';

//Declaro las variables fuera del metodo principal paara que los demas metodos puedan acceder mas facilmente

public static int envio = 1;
public static int recogida = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion; //Variables
        char aleatoria;
        
        do { //Bucle para el menu
            mostrarMenu(); //Llamo al metodo mostrar menu
            opcion = pedirOpcion(); //Llamo al metodo opcion
            
            switch (opcion){ //Switch case para los casos del usuario
               
                case 1: //Si es uno, genera numero de envio y letra aleatoria
                    generarNumeroEsperaEnvio();
                    aleatoria = generarLetraAleatoria();
                    System.out.println("Su letra es : "+aleatoria);
                break;
                
                case 2: //Si es dos, genera un numero de recogida y una letra aleatoria
                    generarNumeroEsperaRecogida();
                    aleatoria = generarLetraAleatoria();
                    System.out.println("Su letra es :"+aleatoria);
                    break;
                case 3:
                    System.out.println("!Vuelva pronto!"); //En el caso 3 se despide
                    break;
                    
                default: //Declaro una opcion por defecto, si no es ninguna de las anteriores
                    System.out.println("Introduce un numero del 1 al 3");
                       
            }
        }
        
        while (opcion != 3); //El bucle funcionara hasta que el usuario marque el 3
    }
    
    
    
    
    //METODOS
    
    //METODO PARA EL MENU DE OPCIONES
    public static void mostrarMenu (){
        System.out.println("============== COLA DE CORREOS ==============  ");
        System.out.println("1. Enviar.");
        System.out.println("2. Recoger.");
        System.out.println("3. Salir.");
        
        System.out.println("=============================================");
        System.out.println("Elige una opcion.");
    }
    //METODO QUE RECOGE LA ELECCION DEL USUARIO
    public static int pedirOpcion(){
        int opcion;
        opcion = 0;
        try { //Control de excepciones
       
            Scanner entrada = new Scanner (System.in);
            opcion = entrada.nextInt();
            }
        catch (InputMismatchException e) { //Filtro por si el usuario introduce un caracter invalido
                System.out.println("Error, debes introducir un numero del 1-3");
            }
        
        return opcion;
    }
    //METODO QUE GENERA LETRA ALEATORIA 
    public static char generarLetraAleatoria(){// Metodo para generar una letra aleatoria a partir de la constante
        int rango = (LETRAFINAL - LETRAINICIAL)+1; //Tomo el rango de la letra
        int desplazamiento = (int)(Math.random()*rango); //Declaro el desplazamiento, que sera un numero aleatorio por el rango
        return (char) (LETRAINICIAL + desplazamiento); //Sumo el desplazamiento al rango
    }
    //METODO DE INCREMENTO DE ENVIO
    public static void incrementarNumeroEnvio(){ 
        envio++;
    }
    //METODO DE INCREMENTO DE RECOGIDA
    public static void incrementarNumeroRecogida(){
        recogida++;
    }
    //METODO QUE LLAMA EL METODO DE ENVIO Y LO MUESTRA
    public static void generarNumeroEsperaEnvio (){
        System.out.println("Tu numero de envio es E-"+envio);
        incrementarNumeroEnvio();
       
        
    }
    //METODO QUE LLAMA EL METODO DE ESPERA Y LO MUESTRA 
    public static void generarNumeroEsperaRecogida(){
        incrementarNumeroRecogida();
        System.out.println("Tu numero de recogida es R-"+recogida);
    }
    
    
    
}
