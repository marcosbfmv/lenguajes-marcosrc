/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.Calendar;

/**
 *
 * @author T-107
 */
public class RelojitoMejorado {
    
    public static void main(String[] args) {
        /*
        Aqui veremos la forma de crear un Thread usando la vieja tecnica
        de clases internas an´nimas
        */
        Thread t1=new Thread(new Runnable(){

            @Override
            public void run() {
                
                        while(true){
            try{
                Thread.sleep(1000);
                Calendar cal=Calendar.getInstance();
                int horas=cal.get(Calendar.HOUR);
                int minutos=cal.get(Calendar.MINUTE);
                int segundos=cal.get(Calendar.SECOND);
                System.out.println(horas+";"+minutos+";"+segundos);
                
                
                
                
            }catch(InterruptedException e){
                
            }
        }
            }
            
        });
               t1.start();
               
    }
    
}
