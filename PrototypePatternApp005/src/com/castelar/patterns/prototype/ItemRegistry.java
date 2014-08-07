/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns.prototype;

import java.util.HashMap;

/**
 *
 * @author operador
 */
public class ItemRegistry {
    private static HashMap<String,Item> map = new HashMap<>();
    
    public static Item getBasicCloneItem(String type) throws CloneNotSupportedException{
        System.out.println("Recuperando clon de objeto de tipo:"+type);
        return (map.get(type)).clone();
    }
    
    public static void loadCache(){
        System.out.println("Cargando items de cache...");
                
        Book book = new Book();
        book.setTitle("Patrones de diseño");
        book.setPrice(100.00);
        map.put("Book", book);
        
        CD cd = new CD();
        cd.setTitle("Samba");
        cd.setPrice(50.00);
        map.put("Cd", cd);        
    }
}
