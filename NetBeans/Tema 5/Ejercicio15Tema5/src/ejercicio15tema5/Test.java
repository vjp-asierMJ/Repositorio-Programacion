/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15tema5;

/**
 *
 * @author alumno
 */
public class Test {
    //Crear de los objetos de direcciones
    
    public static void ejecutar(){
    Direccion dir1 = new Direccion ("Calle Mayor",10,2,"Madrid");
    Direccion dir2 = new Direccion("Avenida Central", 45, 5, "Barcelona");
    Direccion dir3 = new Direccion("Calle Luna", 8, 1, "Valencia"); 
    
    Empleado emp1 = new Empleado("Juan Perez", 3000, dir1);
    Empleado emp2 = new Empleado("Ana Garcia", 3500, dir2);
    Empleado emp3 = new Empleado("Luis Fernandez", 2800, dir3);
    
     System.out.println(emp1.toString());
     System.out.println(emp2.toString());
     System.out.println(emp3.toString());
    }
    
   
}
