/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areglos;

/**
 *
 * @author T-107
 */
public class ProbarAreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int x[]={1,45,-12,7};
        
        int y[]=new int[3];
        y[1]=12;
        y[2]=45;
        
        
        int z[]=new int[]{3,-12,9};
        String hola= "hola";
        
        for(int i=0;i<x.length;i++){
            
             System.out.println("este elemento tiene un valor de: "+x[i]);
            
        }
        
        for(int m:x){
            System.out.println("este elemento tiene un valor de: "+m);
        }
       
         byte []algo=hola.getBytes();
         
         StringBuilder builer=new StringBuilder();
         for(byte valor:algo){
             builer.append((char)valor);
             
         
         //for(byte b:algo){
           //  System.out.print((char)b);
         }
             
        // etiuetaz.seText(builder.toString());
         
         
         
         
         
         
               
        
        
    }
    
}
