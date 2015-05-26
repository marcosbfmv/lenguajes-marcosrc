/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author T-107
 */
public class Usuario {
    //Primer regla de encapsulamiento poner private
    private String nombre;
    private int edad;

 //poner los metodos set
    public void setNombre(String nombre){
        //this señala el atributo 
        this.nombre=nombre;
    }
    //poner los metodos set
    public void setEdad(int edad){
        //this señala el atributo 
        this.edad=edad;
    }
    // poner los metodos get
    public String getNombre(){
        return nombre; 
    }
    //poner los metodos get
    public int getEdad(){
        return edad;
    }
    
    
   
}
