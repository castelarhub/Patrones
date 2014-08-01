/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns.client;

import com.castelar.patterns.prototype.Item;
import com.castelar.patterns.prototype.ItemRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author operador
 */
public class PrototypePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                
        try {
            //Cargando en memoria los items que serviran de plantillas
            ItemRegistry.loadCache();
            
            //Recuperando un item de tipo Book
            Item item1 = ItemRegistry.getBasicCloneItem("Book");
            Item item2 = ItemRegistry.getBasicCloneItem("Book");
            Item item3 = ItemRegistry.getBasicCloneItem("Book");
            //item4 hace referencia al objeto item1
            Item item4 = item1;
            
            item1.setTitle("Reposteria basica mexicana Vol. 1");
            item1.setPrice(250.00);
            
            //Se muetra la referencia y estado de los objetos
            System.out.println(item1);
            System.out.println(item2);
            System.out.println(item3);
            System.out.println(item4);
            
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(PrototypePatternDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
