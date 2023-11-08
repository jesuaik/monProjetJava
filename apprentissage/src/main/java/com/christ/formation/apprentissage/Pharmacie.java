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
public class Pharmacie {
//    private String nom;
//    private String adresse;
//    private String tel;

    public String nom;
    public String adresse;
    public String tel;

    public Pharmacie() {

    }

    ;
    
     public Pharmacie(String nom) {
        this.nom = nom;
    }

    ;

    public Pharmacie(String nom, String adresse, String tel) {
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public void afficherInfoPharmacie(String nom, String adresse, String tel) {
        System.out.println("la pharmacie:"  + nom + ",est situé au quartier:"  + adresse + " ,voici son numéro:" + "" + tel + ". soyez le bienvenue!!");   
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Pharmacie{" + "nom=" + nom + ", adresse=" + adresse + ", tel=" + tel + '}';
    }
    
    

}
