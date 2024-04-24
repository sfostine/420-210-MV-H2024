package com.example.demo13;

public class Projet {

    public Projet(){

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    private String nom;

    public String getNom() {
        return nom;
    }

    public String getClient() {
        return client;
    }

    public String getDuree() {
        return duree;
    }

    private String client;
    private String duree;
}
