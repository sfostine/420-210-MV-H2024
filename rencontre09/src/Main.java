public class Main {

    public static void main(String [] args){
        /*Etudiant samuel = new Etudiant();

        Etudiant manasse = new Etudiant("Louis", "Manassé");
        manasse.setAge(17);

        System.out.println(manasse.getAge());*/

        executionScenarioVoiture();
    }

    private static void executionScenarioVoiture(){
        Voiture tesla = new Voiture("Tesla", "noire", 50.0);

        System.out.printf("Je démarre ma belle %s %s %n", tesla.getMarque(), tesla.getCouleur());

        System.out.println("Présentement, ma vitesse est " + tesla.getVitesse());

        System.out.println("Je peux me permettre d'accélerer de 10Km/h");;
        tesla.accelerer(10);
        System.out.println("Maintenant ma nouvelle vitesse est " + tesla.getVitesse());

        System.out.println("Je m'approche d'un arrêt, je dois donc ralentir. Je ralentis de 15 km/h");
        tesla.decelerer(15);

        System.out.println("Je ralentis encore de 20km/h");
        tesla.decelerer(20);

        System.out.println("Après 2 décélération, une de 15 et l'autre de 20, ma nouvelle vitesse est: " + tesla.getVitesse());

        System.out.println("Je suis rendu à l'arrêt. En plus, il y a un policier. Je vais donc m'arreter");
        tesla.arreter();

        System.out.println("Pendant l'arrêt, ma nouvelle vitesse est: " + tesla.getVitesse());

    }
}
