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
public abstract class AbstractFactory {
    public abstract Color getColor(String color) throws Exception ;
    public abstract Shape getShape(String type) throws Exception ;    
}
