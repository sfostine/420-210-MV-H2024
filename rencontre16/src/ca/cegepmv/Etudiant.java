package ca.cegepmv;

public class Etudiant {
    public Etudiant(){
        Personne.nombreProfStatic++;
        Personne p = new Personne();
        p.nombreProfesseur1++;

        Personne.nom = "NomEtudiant";
    }
}
