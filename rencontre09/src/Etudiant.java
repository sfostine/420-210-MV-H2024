public class Etudiant {
    private String prenom;
    private String nom;
    private int age;

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenomEtudiant){
        this.prenom = prenomEtudiant;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public Etudiant(){

    }

    public Etudiant(String nomEtudiant, String prenomEtudiant){
        prenom = prenomEtudiant;
        nom = nomEtudiant;
    }
}
