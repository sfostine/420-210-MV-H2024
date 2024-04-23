package ca.cegepmv.laboratoire1;

public class Repertoire extends ElementSysteme{

    private Fichier [] tableauFichier = new Fichier[5];
    private static int nbrElementTableau = 0;
    public Repertoire(String nom, String chemin) {
        super(nom, chemin);
    }

    public void ajouterFichier(Fichier fichierAAjouter){
        if(nbrElementTableau < tableauFichier.length){
            tableauFichier[nbrElementTableau++] = fichierAAjouter;
        }
        else{
            System.out.println("Le tableau est rempli. On ne peut donc pas ajouter le nouveau fichier " + fichierAAjouter.getNom());
        }
    }

    public void listerFichier1(){
        for(int i = 0; i < tableauFichier.length; i++){
            if (tableauFichier[i] != null) {
                System.out.println(tableauFichier[i].getNom());
            }
        }
    }

    public void listerFichier(){
        for(int i = 0; i < nbrElementTableau; i++){
           System.out.println(tableauFichier[i].getNom());
        }
    }


    @Override
    public long getTaille(){
        long taille = 0;

        for(int i = 0; i < nbrElementTableau; i++){
            taille += tableauFichier[i].getTaille();
        }

        return taille;
    }
}
