/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author alumno
 */
public class Bicicleta {
   
    //ATRIBUTOS
   // int ruedas; //FRIENDLY /NO SE USA
   // protected manillar; PROTECTED / NO SE USA
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    
    //Atributo estatico que pertenece a la clase
    private static int numBicicletas = 0;
    
    //CONSTRUCTORES
    //Defecto
    public Bicicleta(){
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        //Incrementamos el valor del atributo estatico cuando se crea una nueva bicicleta
       incrementarNumBicicletas();
    }
    //Parametrizado
    
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando){
        this.ruedas = ruedas;
        this.pedales = pedales;
        this.manillar = manillar;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        
        //Incrementamos el valor del atributo estatico cuando se crea una nueva bicicleta
       incrementarNumBicicletas();
    }
    // GETTERS Y SETTERS
    public void setRuedas(int ruedas){
        this.ruedas = ruedas;}
    
    
    public int getRuedas(){
        return ruedas;
    }
    public void setManillar(String manillar){
        this.manillar = manillar;
                
    }
    public String getManillar (){
        return manillar;
    }
    public void setPedales(String pedales){
        this.pedales = pedales;
    }
    public String getPedales(){
        return pedales;
    }
    public void setFrenos(String frenos){
        this.frenos = frenos;
    }
    public String getFrenos(){
        return frenos;
    }
    public void setEstaPedaleando(boolean estaPedaleando){
        this.estaPedaleando = estaPedaleando;
    }
    public boolean getEstaPedaleando(){
        return estaPedaleando;
    }
    public int getNumBicicletas(){
      return  this.numBicicletas;
    }
    
    
    //METODOS
    private void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void incrementarNumBicicletas(){
        numBicicletas++;
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "Mi bicivleta tiene "+this.ruedas+ "ruedas"+
                ", un manillar "+this.manillar+
                ", estos pedales"+this.pedales+
                ", unos freonso"+this.frenos+
                "y ahora ¿Estoy pedaleando?"+this.estaPedaleando;
    }

}
    

