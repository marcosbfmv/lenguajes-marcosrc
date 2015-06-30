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



/* diseño de 2 clases tipo pojo
una exception
arreglos
herencia
poliformismo
*/

public class FinDeCuatri {
    
    public static void main(String[] args) throws PorcentajeException {
        
        
        //creamos un objeto de tipo Examen parcial
        ExamenParcial eParcial=new ExamenParcial();
                      eParcial.setCalificacion(10);
                      eParcial.setPorcentaje(0.5f);
        ExamenFinal eFinal=new ExamenFinal();
                    eFinal.setCalificacion(10);
                    eFinal.setPorcentaje(0.5f);
        
                    //Creamos modelo
        
        ModeloEvaluacion modelo=new ModeloEvaluacion();
        
        System.out.println(modelo.evaluar(eParcial,eFinal));
       
    }
    
}
