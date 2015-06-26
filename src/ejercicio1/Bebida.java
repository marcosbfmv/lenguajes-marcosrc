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
public class Bebida {
    
    private String tipo;
    private String [] bebidad;
    
    public String [] obternerRecomendaciones (){
        
       
      if(tipo.equals("si_alcholicas[]")){
          
          
        String si_alcholicas[]={"Cerveza Sol","Cerveza Indio","Whisky","Pulque","Tonoya"};
        return si_alcholicas;
          
      }else {
          String []no_alcholicas={"Cerveza Sol","Cerveza Indio","Whisky","Pulque","Tonoya"};
          return no_alcholicas;
      }
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidad() {
        return bebidad;
    }

    public void setBebidad(String[] bebidad) {
        this.bebidad = bebidad;
    }
}
    

