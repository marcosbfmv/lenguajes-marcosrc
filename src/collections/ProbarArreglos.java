/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    
    public static void main(String[] args) {
        GeneradorDeUsuarios generadora=new GeneradorDeUsuarios();
                        generadora.agregarUsuario("Chana", 18, "chana@yomera.com");
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>)generadora.getUsuarios();
                          System.err.println(usuarios.size());     
        for(Usuario u:usuarios){
            System.err.println("Nombre: "+u.getNombre()+" Edad: "+u.getEdad()+" email: "+u.getEmail());
        }
    }
    
}
