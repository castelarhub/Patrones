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
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) throws Exception {
        Color newColor = null;
        
        switch(color){
            case Color.ROJO:
                System.out.println("Creando la instancia del color Rojo");
                newColor = new Red();
                break;
            case Color.AZUL:
                System.out.println("Creando la instancia del color Blue");
                newColor = new Blue();
                break;
            case Color.VERDE:
                System.out.println("Creando la instancia del color Verde");
                newColor = new Green();
                break;
            default:
                throw new Exception("UnsupportedColorException - "+ color+" es un color no soportado.");            
        }
        
        return newColor;
    }

    @Override
    public Shape getShape(String type) throws Exception {
        return null;
    }
    
}
