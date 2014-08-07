/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns.prototype;

/**
 *
 * @author operador
 */
public abstract class Item implements Cloneable{
    private String title;
    private double price;
    
    @Override
    public Item clone() throws CloneNotSupportedException{
        Item cloneItem = null;
        try {
            //Clonacion por defecto del objeto
            cloneItem = (Item) super.clone();
            //Aqui se puede agregar valores especificos
            //Para el objeto clonado si se requiere
        } catch (CloneNotSupportedException e) {
            throw e;
        }
        return cloneItem;
    }
        
    @Override
    public String toString(){
        return  getClass().getName() + "@" + Integer.toHexString(hashCode()) + "==> title:"+getTitle() + " -> price:"+getPrice();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}
