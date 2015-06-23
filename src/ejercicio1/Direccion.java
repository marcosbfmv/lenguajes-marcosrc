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
public class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private int cp;
    private String municipio;

    
    // inicializa cp y municio 
    public Direccion (int cp, String municipo){
   
        this.cp=cp;
        this.municipio=municipo;
      
  }
  
  
    

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCo() {
        return cp;
    }

    public void setCo(int co) {
        this.cp = co;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
}
