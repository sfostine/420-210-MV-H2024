package exercice;

public class Utilisateur {
    private String nom;
    private String prenom;
    private  boolean isConnected;

    private int identifiant;
    private TypeUtilisateur type;

    private static int nbrUtilisateur = 0;

    public Utilisateur(TypeUtilisateur type){
        nbrUtilisateur++;
        this.type = type;
    }
}
