package exo1;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Il était une fois", "Mario Yannis", 2024);
        //doc.afficherDetail();

        Livre livre = new Livre("Il était une fois", "Mario Yannis", 2024, 592, "Policier");
        livre.afficherDetail();

        Magazine magazine = new Magazine("Étudiants du cours de POO", "Bradley Hanson", 2024, 4, "Comment programmer efficacement");
        magazine.afficherDetail();
    }
}
