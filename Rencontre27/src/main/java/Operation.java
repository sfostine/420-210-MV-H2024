import java.util.Scanner;

public class Operation {

    public double diviser(double nombre1, double nombre2){
        return nombre1 / nombre2;
    }

    public boolean estPair(int nombre){
        return nombre % 2 == 0;
    }

    public static double diviser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisissez le premier nombre de la division");
        double nombre1 = scanner.nextDouble();

        System.out.println("Saisissez le deuxième nombre de la division");
        double nombre2 = scanner.nextDouble();

        double resultat =  nombre1/ nombre2;

        return resultat;
    }

    public static void main(String[] args) {
        System.out.println(diviser());

    }
}
