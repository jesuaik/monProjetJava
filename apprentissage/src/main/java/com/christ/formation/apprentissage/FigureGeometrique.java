/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.apprentissage;

/**
 *
 * @author Christ ikondo
 */
public class FigureGeometrique {
    private int x;
    private int y;
    
    FigureGeometrique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "FigureGeometrique{" + "x=" + x + ", y=" + y + '}';
    }
    
    

}
