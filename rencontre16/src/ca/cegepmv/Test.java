package ca.cegepmv;

public class Test {
    public static void main(String[] args) {
        Personne personne1 = new Personne();
        personne1.setPrenom("Bradley");
        Personne.nom = "Samuel";

        Personne personne2 = new Personne("Takfarinas");
        Personne.nom = "Mario";
        Etudiant etudiant = new Etudiant();

        System.out.println(Personne.getNom());

        Personne.nombreProfStatic++;



        System.out.println(personne2.nombreProfesseur1);
        System.out.println(Personne.nombreProfStatic);
    }


}
