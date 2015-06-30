/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

/**
 *
 * @author T-107
 */
public class PorcentajeException extends Exception{
   
    public PorcentajeException (){
        
  super("Tu porcentaje no suma 100%, revisalos");
    }
}
