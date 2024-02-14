import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez un nombre entre 0 et 10 inclusivement");

        if (scan.hasNextInt()){
            int nombre = scan.nextInt();
            System.out.println(Math.exp(nombre));
        }
        else{
            System.out.println("Tu n'as pas saisi un nombre entier");
        }*/

        //System.out.println(calculerIMC());
        //conversionDeType();
        utilisationDeTableau();
    }

    public static String calculerIMC(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Saisissez votre poids en Kg");
        double poids, taille;

        if (scan.hasNextDouble()){
            poids = scan.nextDouble();
        }
        else{
            return "Désolé, vous n'avez pas saisi le bon poids";
        }

        System.out.println("Maintenant, saisissez votre taille en mètre");
        if (scan.hasNextDouble()){
            taille = scan.nextDouble();
        }
        else{
            return "Désolé, vous n'avez pas saisi la bonne taille";
        }

        double imc = poids / taille;

        if (imc <= 16){
            return "Risque élévé";
        }
        else if(imc > 16 && imc <= 18.5){
            return "Risque accru";
        }
        else if(imc > 18.5 && imc <= 24.9){
            return "Risque faible";
        }
        else if(imc > 25 && imc <= 29.){
            return "Risque élévé 1";
        }
        else if(imc > 30 && imc <= 34.9){
            return "Risque élévé ";
        }
        else if(imc > 35 && imc <= 39.9){
            return "très élévé ";
        }
        else{
            return "extrêment élévé";
        }
    }

    public  static void conversionDeType(){
        //conversion de string en byte
        byte nombre = Byte.valueOf("20");
        System.out.println(nombre * nombre);

        // con
        int nombre2 = Integer.valueOf("12345");
        System.out.println(nombre2 * 2);

        byte nbr = 20;
        System.out.println(String.valueOf(nbr) + Byte.toString(nbr));

        //Quel est le résultat de cette opération
        byte b = Byte.valueOf("50");
        System.out.println(b + b); // 50 + 50 = 100

        int nbr2 = 1014;
        System.out.println(Integer.toString(nbr2) + String.valueOf(nbr2));//10141014

        byte b2 = 30;
        short s = 129;

        byte b3 = (byte)s;
        System.out.println(b3); //60

        int nbrEntier = 1060;
        long nbrLong = nbrEntier;

        long nbrLong2 = 12342435235423L;
        int nbrEnt = (int)nbrLong2;

        System.out.println(nbrEnt);

    }

    public static void utilisationEnum(Jour jour){
        switch (jour){
            case LUNDI:
                System.out.println("Je me lève pour aller en cours");
                break;
            case MARDI:
                System.out.println("Je me lève pour aller en cours de programmation orientée objet");
                break;
        }
    }

    public static void utilisationDeTableau(){
        // déclaration d'un tableau de nombre double
        double [] nombres = new double[10];
        System.out.println(nombres[0]);

        // déclaration et initialisation d'un tableau d'entier
        int[] chiffreAffaire= {123,563,657,453,986,678,564,234,786,123,534,975};

        /* C'est comme si j'avais créé un tableau de
        int[] chiffreAffaire = new int[12];
        chiffreAffaire[0] = 123;
        chiffreAffaire[1] = 563;*/
        System.out.println(chiffreAffaire[0]);
        System.out.println(chiffreAffaire[11]);

        //retourne le dernier élément dans le tableau
        //Rappel: Le dernier élément se trouve toujours à la position: longueur tableau - 1
        System.out.println(chiffreAffaire[ chiffreAffaire.length - 1]);
    }
}