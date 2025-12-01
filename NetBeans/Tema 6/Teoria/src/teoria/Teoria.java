/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoria;

/**
 *
 * @author alumno
 */
public class Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // 1. Creamos una variable donde guardar a nuestros superheroes
        Superheroe superheroe; 
        
        // ¡IMPORTANTE! No podemos crear objetos de clases abstractas;
        // tenemos que instanciar objetos de las subclases.       
    //     superheroe = new Superheroe("Batman");

        // POLIMORFISMO
        // 2. Guardamos en una variable de la superclase
        // un objeto de cada subclase (uno Hulk y otro Flash).
        
        // 3. La misma expresión superheroe.entrenar() se comporta de forma distinta
          superheroe = new Hulk("Hulk", 600);
          superheroe.entrenar();
        
          superheroe = new Flash("Flash", 3000);
          superheroe.entrenar();
        
        
        
        // 4. Desde Superheroe no podemos llamar a métodos de las subclases
//        superheroe.dejarEstela();
          
        // 5. Solo podemos hacerlo desde la subclase       
          Flash flash = new Flash("Nuevo Flash", 2000);        
          flash.dejarEstela();
        
        // 6. Además, podemos usar los métodos de la superclase que Flash hereda
          flash.presentarse();
        
        
        
        // 7. Podemos cambiar de cajita a los superhéroes usando casting
//        flash = (Flash)superheroe;
//        System.out.println(flash);

        //Metodos de interfaces
        
        flash.atravesarObjetos("Edificio");
        flash.correrRapido(800);
        
       //Tambien puedo crear objetos de interfaz con el polimorfismo
       
       SuperVelocidad flashVelocidad = new Flash("Flash Velocista",1000);
       
       //Pero no puedo instanciar un nuevo objeto ya que no tiene ni seter ni getter
       
       //Supervelocidad flashVelocidad = new Supervelocudad() -> Esto esta mal
       
       //Podemos tomar una interfaz que se comporte de manera distinata segun el objeto
       Defensa superheroeDefensivo = flash;
       superheroeDefensivo.defenderse();
       
       superheroeDefensivo = new Hulk("Hulk Defensivo",500);
       superheroeDefensivo.defenderse();
       
       
       //4. Operador INSTANCEOF: nos dice de que tipo es un objeto
       System.out.println("\n¿Qué superhéroe tenemos guardado en superheroeDefensivo?");

        if(superheroeDefensivo instanceof Hulk) {
            System.out.println("Es Hulk");
        } else if(superheroeDefensivo instanceof Flash) {
            System.out.println("Es Flash");
        } else {
            System.out.println("Es un superhéroe desconocido");
        }
        
        System.out.println("\n¿Qué superpoder tiene el superheroeDefensivo?");
        if(superheroeDefensivo instanceof SuperVelocidad) {
            System.out.println("Supervelocidad");
        } else if(superheroeDefensivo instanceof Defensa) {
            System.out.println("Defensa");
        } else {
            System.out.println("Ningua");
        }
    
    
    }
    
}
