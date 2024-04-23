package ca.cegepmv.laboratoire1;

public class ElementSysteme {

    public String getNom() {
        return nom;
    }

    private String nom, chemin;

    private long taille;

    private boolean lectureSeul;

    public ElementSysteme(String nom, String chemin){
        this.nom = nom;
        this.chemin = chemin;
        taille = 0;
    }

    public void renommner(String nom){
        this.nom = nom;
    }

    public long getTaille() {
        return taille;
    }

    public void setTaille(long taille) {
        this.taille = taille;
    }

    public boolean isLectureSeul() {
        return lectureSeul;
    }

    public void setLectureSeul(boolean lectureSeul) {
        this.lectureSeul = lectureSeul;
    }
}
