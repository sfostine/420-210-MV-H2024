package gestion;

public class Etudiant {
    String nom;
    private String prenom;
    private double [] notes = new double[4];

    public double calculerMoyenne(){
        double sommeNote = 0;
        for (double note: this.notes) {
            sommeNote += note;
        }

        return sommeNote / this.notes.length;
    }
    public void setNotes(double[] notes) {
        this.notes = notes;
    }

    public Etudiant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double[] getNotes() {
        return notes;
    }
}
