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
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String type) throws Exception {
        Shape shape = null;
        switch (type) {
            case Shape.CIRCLE:
                System.out.println("Creando la instancia de un circulo");
                shape = new Circle();
                break;
            case Shape.RECTANGLE:
                System.out.println("Creando la instancia de un rectangulo");
                shape = new Rectangle();
                break;                
            case Shape.SQUARE:
                System.out.println("Creando la instancia de un cuadrado");
                shape = new Square();
                break;
            case Shape.TRIANGLE:
                System.out.println("Creando la instancia de un trinagulo");
                shape = new Triangle();
                break;                
            default:
                throw new Exception("UnsupportedShapeException - "+ type+" es una forma no soportada.");
        }
        return shape;        
    }
    
}
