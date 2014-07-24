/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns;

import com.castelar.patterns.singleton.SingleObject;

/**
 *
 * @author operador
 */
public class SingletonPatternApp002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        String mensaje = null;
        
        SingleObject singleObject1 = null;
        SingleObject singleObject2 = null;
        SingleObject singleObject3 = null;
        
        //Primer llamada
        singleObject1 = SingleObject.getInstancia();
        mensaje = singleObject1.getMessage();
        System.out.println(mensaje);
        Thread.sleep(1000);
        
        //Segunda llamada
        singleObject2 = SingleObject.getInstancia();
        mensaje = singleObject2.getMessage();
        System.out.println(mensaje);
        Thread.sleep(1000);
        
        //Tercer llamada
        singleObject2 = SingleObject.getInstancia();
        mensaje = singleObject2.getMessage();
        System.out.println(mensaje);
        
    }
    
}
