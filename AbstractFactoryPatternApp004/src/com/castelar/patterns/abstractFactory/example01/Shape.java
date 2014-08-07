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
public interface Shape {
    public final String CIRCLE="CIRCLE";
    public final String SQUARE="SQUARE";
    public final String RECTANGLE="RECTANGLE";
    public final String TRIANGLE="TRIANGLE";
    public void draw();    
}
