/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio7Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion = 0;
        
        Dia[] dias = new Dia[30]; //Creamos el objeto
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; //Array para la semana
        
          
        try{ //Excepciones
            do { //Bucle para menu
            mostrarMenu();
           eleccion = eleccion();
            
            switch(eleccion){ //Switch case de elecciones
                case 1:
                    rellenarArray(dias,semana); //Metodo para rellanar el objeto
                break;
                case 2:
                       mostrarArray(dias,semana); //Metodo para mostrarlo
                break;
                case 3:
                    mediaMes(dias);//Metodo para calcular la media
                break;
                case 4: diaMasCaluroso(dias,semana);//Metodo para el dia/s mas caluroso
                break;
                
                case 5:
                    System.out.println("Saliendo...."); //Salimos
                break;
                
                default:
                    System.out.println("Introduce una opcion correcta");//Opcion por defecto
            }
        }
        while (eleccion!=5); //Condicion de excepciones
        
        }
        catch(InputMismatchException e){
            System.out.println("Error, introduce un valor correcto "+e);
        }
    }
    
    public static void rellenarArray(Dia[] dias, String[] semana){
    
        int i;
        int inicio, fin, rango; //Variables para la temperatura
        int valor = 0;
        int inicioSemana, finSemana; //Variables para el dia de la semama
        int rangoSemana;
        int valorSemana;
        
        int j; //Para guardar el valor aleatorio del dia de la semana e ir aumentandolo
        
        inicio = 0;
        fin = 44;
        
        rango = fin-inicio;
        
        inicioSemana = 0;
        finSemana = 6;
        
        rangoSemana = finSemana-inicioSemana; //Rango de la semana
        
        valorSemana = (int)(Math.random()*rangoSemana)+inicio; //Generar el dia aleatorio
         j = valorSemana; //Lo ajustamos a j para poder actualizarlo posteriormente
        
        for(i=0;i<dias.length;i++){ //Recorremos el array
        
           valor = (int)(Math.random()*rango+1)+inicio; //Generar la temperatura aleatoria
          
          
           dias[i] = new Dia(semana[j],valor); //Asignamos los valores al objeto
           j++; //Actualizamos la posicion
           
           if(j==semana.length){ // Si llega al Domingo
               j=0; //Lo igualamos a 0 para que vuelva a empezar por el Lunes
           }
        }
    }
    
    public static void mostrarArray(Dia[] dias, String[] semana){ //Metodo para mostrar el array
    
        int i;
        
        for(i=0;i<dias.length;i++){ //Recorremos el array
        
            System.out.println("El "+ dias[i].getNombreDia() + " dia "+(i+1)+ " con "+ dias[i].getTemperatura() + " grados"); //Lo mostramos;
        }
    }
    
    public static void mediaMes(Dia[] dias){
    
        int i;
        int media = 0;
        
        for(i=0;i<dias.length;i++){//Recorremos el array
        
            media = media + dias[i].getTemperatura();//Sumamos todos los valores
        }
        
        media = media/dias.length;//Calculamos la media
        
        System.out.println("La media de temperatura es de "+media+ " grados");
    }
    
    public static void diaMasCaluroso(Dia[] dias, String[] semana){//Metodo para el dia/s mas calurosos
    
        int i=0;
        String dia = "";
        int mayor = 0;
        int posicion = 0; //Variables
        
         mayor = dias[0].getTemperatura(); //Asignamos el mayor a la primera posicion del objeto
        for(i=0;i<dias.length;i++){ //Recorremos el array
            
            if(dias[i].getTemperatura() > mayor) {//Si el valor actual es > al mayor lo asignamos
            
                mayor = dias[i].getTemperatura();
                posicion = i;
                dia = dias[i].getNombreDia(); //Guardamos el dia de la semana y el valor de i
                
                
          }
        }
        
        System.out.println("La temperatura maxima es el "+dia+" "+ (posicion+1)+ " con una temperatura de "+mayor+" grados");//Imprimos
        

       
        for (i = 0; i < dias.length; i++) {//Bucle para sacar mas dias con la misma temperatura
            if (dias[i].getTemperatura() == mayor) {
                System.out.println("Temperaturas con el maximo: " +
                           dias[i].getNombreDia() + " " +
                           (i + 1) + " " + mayor + " grados"); //Si tiene el mismo valor los mostramos
    }
}
    }
    
    public static int eleccion(){ //Metodo para tomar la eleccion
    
    int eleccion;
    
        Scanner entrada = new Scanner(System.in);
        
        eleccion = entrada.nextInt();
        
        return eleccion;
    }
    
    public static void mostrarMenu(){ //Metodo para mostrar el menu
    
         System.out.println("========== MENU ==========");
            System.out.println("1. Rellenar temperaturas aleatorias");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Visualizar temperatura media del mes");
            System.out.println("4. Dia(s) mas calurosos del mes");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
    }
    
}
