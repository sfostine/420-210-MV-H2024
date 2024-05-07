package exo1;

public class Livre extends Document{
    private int nbrPage;
    private String genreLitteraire;
    public Livre(String titre, String auteur, int annee, int nbrPage, String genre) {
        super(titre, auteur, annee);
        this.nbrPage = nbrPage;
        this.genreLitteraire = genre;
    }

    @Override
    public void afficherDetail() {
        super.afficherDetail();
        System.out.printf("Nombre page: %d; Genre littéraire: %s %n", nbrPage, genreLitteraire);
    }
}
