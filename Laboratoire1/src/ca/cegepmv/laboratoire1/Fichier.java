package ca.cegepmv.laboratoire1;

public class Fichier extends ElementSysteme{

    private String contenu;

    public Fichier(String nom, String chemin){
        super(nom, chemin);
    }

    public void ecrire(String texte){
        if(isLectureSeul()){
            System.out.println("Le fichier est en lecture seule, le contenu ne peut être changé");
        }
        else {
            this.contenu = texte;
            this.setTaille(contenu.length());
        }
    }

    public String getContenu() {
        return contenu;
    }
}
