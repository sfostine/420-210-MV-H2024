package gestion;

public class Professeur {
    private String nom;

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

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    private String prenom;
    private String identifiant;

    public Professeur(String nom, String prenom, String identifiant){
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
    }
}
