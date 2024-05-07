package exo1;

public class Magazine extends Document{
    private int numPeriode;
    private String sujet;
    public Magazine(String titre, String auteur, int annee, int numPeriode, String sujet) {
        super(titre, auteur, annee);
        this.numPeriode = numPeriode;
        this.sujet = sujet;
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.printf("Numéro de période: %d; Sujet: : %s %n", numPeriode, sujet);
    }
}
