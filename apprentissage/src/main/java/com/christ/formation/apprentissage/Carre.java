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
public class Carre extends FigureGeometrique {

    private long cote;

    public long getCote() {
        return cote;
    }

    Carre(long cote, int x, int y) {
        //Appel du constructeur de la classe mère FigureGeometrique
        super(x, y);
        this.cote = cote;
    }

    public static int sum(int a, int b){
   return a + b;
}
    public long getPerimetre() {
        return 4 * cote;
    }

    public int getPerimetreCarre(int cote) {
        return 4 * cote;
    }

    public void getPerimetreCar(int cote) {
        int perimetre = cote * cote;
        System.out.println("le perimetre du carré est =" + perimetre);

    }

    @Override
    public String toString() {
        return "Carre{" + "cote=" + cote + '}';
    }

}
