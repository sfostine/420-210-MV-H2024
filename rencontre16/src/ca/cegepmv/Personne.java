package ca.cegepmv;

public class Personne {
    //Attribut static de la classe Personne. Cet attribut ne peut pas être
    //initialisé à partir de l'instance d'une classe.
    public static String nom;

    public int nombreProfesseur1 = 0;
    public static int nombreProfStatic = 0;

    //Atti=ribut non static. Il peut être initialisé à partir d'une instance d'une classe
    private String prenom;

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Personne(){
        //Le même attribut nombreProfStatic sera utilisé partout,
        //DOnc sera incrémenté à chaque fois qu'on créé une personne
        nombreProfStatic++;

        //Ce attribut sera toujours 1 pour chaque nouvelle instance
        nombreProfesseur1++;
    }

    //Surchage du constructeur - Personne avec un parametre String
    public Personne(String nom){
        this.prenom = nom;
    }

    //Surchage du constructeur - Personne avec un parametre int
    public Personne(int age){

    }

    //Surchage du constructeur - Personne avec 2 parametres, un String et un int
    public Personne(String nom, int age){

    }

    public static String getNom(){
        return nom;
    }

}
