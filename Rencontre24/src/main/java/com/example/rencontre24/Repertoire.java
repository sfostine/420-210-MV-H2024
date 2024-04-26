package com.example.rencontre24;

import java.util.ArrayList;

public class Repertoire extends ElementSysteme {
    private ArrayList<Fichier> listeFichier;

    public Repertoire() {
        listeFichier = new ArrayList<Fichier>();
    }

    public long getTaille() {
        long total = 0;
        for (Fichier fichier: listeFichier) {
            total += fichier.getTaille();
        }
        setTaille(total);

        return total;
    }

    public ArrayList<Fichier> getListeFichier() {
        return listeFichier;
    }


}
