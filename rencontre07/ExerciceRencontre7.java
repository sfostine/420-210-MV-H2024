import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercice {
    public static void main(String[] args) {
        //plusGrandNombre();
        //System.out.println(factorielle());
        //anneeBissextile();
        //System.out.println(sommeDesNombresBoucleWhile());
        //sommeNombreTableau();
        System.out.println(rechercherNombre(new int[]{1, 2, 5, 8}, 7));
    }

    public static void plusGrandNombre(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez le premier nombre");
        double nombre1 = scan.nextDouble();

        System.out.println("Saisissez le deuxième nombre");
        double nombre2 = scan.nextDouble();

        double plusGrandNombre = Math.max(nombre1, nombre2);
        System.out.printf("Le plus grand nombre entre %.1f et %.1f est %.1f", nombre1, nombre2, plusGrandNombre);
    }

    public static long factorielle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");

        int nombre = scanner.nextInt();
        long resultat = 1;

        for(int i = 1; i <= nombre; i++){
            resultat *= i;
        }

        /// 1 * 2* 3 * 4.....10
        return resultat;
    }

    public static void anneeBissextile(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez une année pour savoir si elle est bissextile ou pas: ");

        int annee = scanner.nextInt();
        System.out.printf(annee % 4 == 0 && annee % 100 != 0 ? "L'année %d est bissextile": "L'année %d n'est pas bissextile", annee);
    }

    public static int sommeDesNombres(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");
        int nombre = scanner.nextInt();
        int somme = 0;

        for(int i = 1; i <= nombre; i++){
            somme += i;
        }
        return somme;
    }

    public static int sommeDesNombresBoucleWhile(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saisissez un nombre entier: ");
        int nombre = scanner.nextInt();
        int somme = 0;

        int i = 1;

        while(i <= nombre){
            somme += i++;
        }

        return somme;
    }

    public static void tableau(){
        //déclaration de tableau sans valeur avec la longueur 5
        String [] tableau = new String[5];

        String [] fruits = {"tomate", "mangue", "pomme"};

        System.out.println(fruits[2]); // affiche mangue

        //remplace mangue par orange
        fruits[1] = "orange";

        System.out.println(fruits.length); // 3

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

    public static void sommeNombreTableau(){
        int [] tableau = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < tableau.length; i++){
            System.out.printf("Saisissez le nombre %d %n", (i + 1) );
            int nombre = scanner.nextInt();
            tableau[i] = nombre;
        }

        //calculer la somme des éléments du tableau
        int somme = 0;
        /*for (int j = 0; j < tableau.length; j++){
            somme += tableau[j];
        }*/
        // [1, 2, 3, 4, 5]
        for(int nbr: tableau){
            somme += nbr;
        }

        System.out.println(somme);

    }

    //[1, 5, 6, 9, 4] 8
    public static int rechercherNombre(int [] tableau, int nombre){
        for(int position = 0; position < tableau.length; position++){
            if (tableau[position] == nombre){
                return position;
            }
        }

        return -1;
    }




}