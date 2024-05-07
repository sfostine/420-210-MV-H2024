package exo1;

import javax.print.Doc;

public class Document {
    private String titre;
    private String auteur;
    private int annee;

    public Document(String titre, String auteur, int annee){
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public void afficherDetail(){
        System.out.printf("Titre: %s; auteur: %s; annee: %d %n", titre, auteur, annee);
    }
}
