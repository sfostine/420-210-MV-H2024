package com.example.demo13;

import java.util.ArrayList;

public class Personne {

    public Personne(){

    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getPoste() {
        return poste;
    }

    public ArrayList<String> getCompetences() {
        return competences;
    }

    public void setCompetences(ArrayList<String> competences) {
        this.competences = competences;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public ArrayList<Projet> getProjets() {
        return projets;
    }

    public void setProjets(ArrayList<Projet> projets) {
        this.projets = projets;
    }

    private  String nom;
    private int age;
    private String poste;
    private ArrayList<String> competences = new ArrayList<String>();

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public void ajouterCompetence(String competence) {
        this.competences.add(competence);
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void ajouterProjet(Projet projet) {
        this.projets.add(projet);
    }

    private Adresse adresse;
    private ArrayList<Projet> projets = new ArrayList<Projet>();
}
