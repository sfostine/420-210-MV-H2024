package gestion;

public class Cours {
    private  String nom;
    private String code;
    private Professeur professeur;
    private Etudiant [] etudiants = new Etudiant[5];

    public Cours(String nom, String code){
        this.nom = nom;
        this.code = code;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur prof){
        this.professeur = prof;
    }

    public Etudiant[] getEtudiants() {
        return etudiants;
    }
}
