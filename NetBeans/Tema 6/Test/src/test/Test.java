/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author alumno
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Atributos
       
        
        Escalador escalador = new Escalador("Asier",50,false,120,2,20f,50,10f,20f); //Creo un objeto escalador parametrizado
        System.out.println(escalador.toString());
        
        Sprinter sprinter = new Sprinter("Marcos",23,false,120,2,32f,24,8f); //Creo un objeto sprinter parametrizado
        System.out.println(sprinter.toString());
        
        System.out.println(escalador.verNumeroCiclistas()); //Muestro el numero de objetos creados
        
       
        
        //Polimorfismo
        
        Ciclista ciclista = new Escalador("Aimar",50,true,120,0,23f,50,16f,35f); //Objeto de Ciclista de tipo escalador con polimorfismo
        System.out.println(ciclista.toString());
        ciclista.comer();
        ciclista.beber();
        System.out.println(ciclista.toString());
        
        Ciclista ciclista2 = new Sprinter("Paco",50,false,100,1,14f,50,16f); //Objeto de Ciclista de tipo Sprinter con polimorifismo
        System.out.println(ciclista2.toString());
        ciclista.comer();
        ciclista.beber();
        System.out.println(ciclista2.toString());
        
        Pedaleable pedaleable = new Sprinter("Tomas",40,false,120,0,41f,50,12f); //Objeto de Pedaleable de tipo Sprinter con polimorfismo
        
        System.out.println(pedaleable.toString());
        pedaleable.atacar();
        pedaleable.recuperar(5);
        pedaleable.sprintar();
        pedaleable.toString();
        
        Pedaleable pedaleable2 = new Escalador("Marta",23,true,0.2f,37,45f,50,24f,32f); //Objeto Pedaleable de tipo Escalador con polimorfismo
        
        System.out.println(pedaleable2.toString());
        pedaleable2.atacar();
        pedaleable2.recuperar(2);
        pedaleable2.sprintar();
        System.out.println(pedaleable2.toString());
        
        
        
        
    }
    
}
