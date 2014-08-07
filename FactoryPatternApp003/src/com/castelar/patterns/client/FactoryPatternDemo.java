/*
 * Ejemplo de implementacion del patron de diseño factory
 */
package com.castelar.patterns.client;

import com.castelar.patterns.factory.ShapeFactory;
import com.castelar.patterns.factory.Shape;

/**
 *
 * @author operador
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            Shape shapeObjectCircle = null;
            Shape shapeObjectSquare = null;
            
            shapeObjectCircle = ShapeFactory.getShape(Shape.CIRCLE);
            shapeObjectCircle.draw();
                        
            shapeObjectSquare = ShapeFactory.getShape(Shape.SQUARE);
            shapeObjectSquare.draw();            
            

        } catch (Exception e) {
        }

    }

}
