/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tema8;

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
        
        
        Dia[] dias = new Dia[30]; //Creamos el objeto
        String[] semana = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"}; //Array para la semana
        
        rellenarArray(dias,semana);
        mostrarArray(dias,semana);
        mediaMes(dias);
        diaMasCaluroso(dias,semana);
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
        
        for(i=0;i<dias.length;i++){
        
            media = media + dias[i].getTemperatura();
        }
        
        media = media/dias.length;
        
        System.out.println("La media de temperatura es de "+media+ " grados");
    }
    
    public static void diaMasCaluroso(Dia[] dias, String[] semana){
    
        int i=0;
        String dia = "";
        int mayor = 0;
        int posicion = 0;
        
        int contador = 0; //Creo un contador para no imprimir 2 veces el mismo dia con maxima temperatura
        
         mayor = dias[0].getTemperatura();
        for(i=0;i<dias.length;i++){
            
            if(dias[i].getTemperatura() > mayor) {
            
                mayor = dias[i].getTemperatura();
                posicion = i;
                dia = dias[i].getNombreDia();
          }
        }
        
        System.out.println("La temperatura maxima es el "+dia+" "+ posicion+ " con una temperatura de "+mayor+" grados");
        
        
       
         for(i=0;i<dias.length;i++){
         
             if(dias[i].getTemperatura() == mayor ){
             
                 contador++;
             }
             if(contador != 0) {
                posicion = i;
                dia = dias[i].getNombreDia();
                
                 System.out.println("La temperatura maxima es el "+dia+ posicion+ " con una temperatura de "+mayor+" grados");
             }
        }
    }
    
}
