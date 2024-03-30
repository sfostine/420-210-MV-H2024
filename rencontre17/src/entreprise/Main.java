package entreprise;

public class Main {
    public static void main(String[] args) {
        Employe travaillant = new Employe(80000);
        System.out.println(travaillant.getSalaire());

        Superviseur superviseur = new Superviseur(100000, 25000);
        System.out.println(superviseur.getSalaire());
    }
}
