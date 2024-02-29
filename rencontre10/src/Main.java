
public class Main {

    public static void main(String [] args){
        Etudiant samuel = new Etudiant();

        /*Moyenne des nombres entiers du tableau*/
        int [] tableau = {18, 18, 17};
        double somme = 0;

        for(int i: tableau){
            somme += i;
        }
        double moyenne = somme/ tableau.length;
        System.out.println(moyenne);


        /*Tableau d'étudiants*/
        Etudiant [] tableauEtudiants = new Etudiant[3];

        Etudiant manasse = new Etudiant("Louis", "Manassé");
        manasse.setAge(17);
        tableauEtudiants[0] = manasse;

        Etudiant yanis = new Etudiant("Dj", "Yanis");
        yanis.setAge(18);
        tableauEtudiants[1] = yanis;

        tableauEtudiants[2] = new Etudiant("Marc", "Hanson", 19);

        double sommeAgeEtudiant = 0;
        for(Etudiant etudiant: tableauEtudiants){
            sommeAgeEtudiant += etudiant.getAge();
        }
        // moyenne de l'age des étudiants
        double moyenneAge = sommeAgeEtudiant/ tableauEtudiants.length;
        System.out.println(moyenneAge);
    }
}
