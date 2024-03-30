package ca.cegepmv;

public class Test {
    public static void main(String[] args) {
        Etudiant mario = new Etudiant();
        Etudiant yanis = new Etudiant();
        Etudiant.nbrEtudiant++;
        Cours cours = new Cours();

        System.out.println(Etudiant.nbrEtudiant);
    }
}
