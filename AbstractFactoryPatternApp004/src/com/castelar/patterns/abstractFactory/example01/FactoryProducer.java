/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns.abstractFactory.example01;

/**
 *
 * @author equipo
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choice) throws Exception{
        
        AbstractFactory abstractFactory = null;
        
        switch(choice){
            case "SHAPE":
                abstractFactory = new ShapeFactory();
                break;
            case "COLOR":
                abstractFactory = new ColorFactory();
                break;
            default:
                throw new Exception("UnsupportedFactoryException - "+ choice+" es una fabrica no soportada.");            
        }        
        
        return abstractFactory;
        
    }
    
}
