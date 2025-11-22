/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Instacion un objeto del tipo que he creado
        //1.1. COn constructror parametrizado y establciendo valores con stters
        
//        Coche miCoche = new Coche();
//        System.out.println(miCoche.toString());
//        
//        miCoche.setEspejos(5);
//        System.out.println(miCoche.toString());
//        System.out.println(miCoche.getEspejos());
//        miCoche.acelerar();
        
                
        //1.2. Con constructor parametrizado, inicializando los atributos
        //con valores por parametro
//        Coche tuCoche = new Coche("Michelin" , "Bajo" , 3);
//        System.out.println(tuCoche.toString());
//         //Esto hace lo mismo que la linea anterior, porque detecta el toString() automaticamente 
//        System.out.println(tuCoche);
//            
//        System.out.println(tuCoche.getRuedas()); 


        //MODIFICACIONES DE ACCESO
        Bicicleta bicicleta = new Bicicleta();
       //System.out.println(bicicleta.ruedas);
        System.out.println("¿Estoy pedaleando ?"+bicicleta.getEstaPedaleando());
    
        
       
    
        Bicicleta bicicleta2 = new Bicicleta();
        System.out.println("¿Cuantas bicis hemos creado?");
        System.out.println(bicicleta.getNumBicicletas());
        
        //PASO DE PARAMETROS POR VALOR O POR REFERENCIA
        
        Bicicleta bici = new Bicicleta();
        
        empezarAPedalear(bici);

        int num1 = 4;
        int resultado;
        resultado = suma(num1);
        
        System.out.println(resultado);
        
      
    }
    public static int suma(int num1){
        int num2= 3;
        return num1+num2;
    }
   
    
    public static void empezarAPedalear(Bicicleta bici) {
        bici.setEstaPedaleando(true);
        
    }
    //4 /COMPOSICION DE CLASES
    
    //4.1 Creo a ciclista
    Ciclista ciclista = new Ciclista();
    
    //4.2 Creo una bici
    Bicicleta biciPogacar = new Bicicleta(2, "recto", "de carretera", "de disco", true, ciclista);
    
    //4.3 Imprimo por pantalla
    
    
    
}
