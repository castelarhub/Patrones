/*
 * Ejemplo de implementacion del patron de diseño factory
 */
package com.castelar.patterns.client;

import com.castelar.patterns.factory.FactoryShape;
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
            
            shapeObjectCircle = FactoryShape.getShape(Shape.CIRCLE);
            shapeObjectCircle.draw();
                        
            shapeObjectSquare = FactoryShape.getShape(Shape.SQUARE);
            shapeObjectSquare.draw();            
            

        } catch (Exception e) {
        }

    }

}
