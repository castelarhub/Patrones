/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.patterns.factory;

/**
 *
 * @author operador
 */
public interface Shape {
    public final String CIRCLE="CIRCLE";
    public final String SQUARE="SQUARE";
    public final String RECTANGLE="RECTANGLE";
    public final String TRIANGLE="TRIANGLE";
    public void draw();
    
}
