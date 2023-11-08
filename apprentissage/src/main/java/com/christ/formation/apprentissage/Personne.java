/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.apprentissage;

import java.time.LocalDate;

/**
 *
 * @author christ IKONDO
 */
public class Personne {

    String nom;
    String prenom;
    int taille;
    boolean adulte;
    LocalDate dateNaissance;

//    private String nom;
//    private String prenom;
//    private int taille;
//    private boolean adulte;
//    private LocalDate dateNaissance;

    public Personne() {
    }

    public Personne(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean isAdulte() {
        return adulte;
    }

    public void setAdulte(boolean adulte) {
        this.adulte = adulte;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", taille=" + taille + ", adulte=" + adulte + ", dateNaissance=" + dateNaissance + '}';
    }

}
