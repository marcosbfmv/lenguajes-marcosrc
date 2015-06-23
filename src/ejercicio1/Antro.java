/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author T-107
 */
public class Antro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // para crear un objeto con nombre edad email cp municpio
        Direccion d1=new Direccion(55130,"Ecatepec");
         // es el constructor que inicializamos todos los atributos 
        Usuario use=new Usuario("juan",42,"jcampo@gamail.com",d1);
        
        System.out.println(use.getDireccion().getMunicipio());
                
    }
    
}
