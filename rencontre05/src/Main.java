import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // vérifier la parité d'un nombre
        // utilisation de if et else
        int nombre = 23;
        if(nombre % 2 == 0) {
            System.out.println("Le nombre " + nombre + " est pair");
        }
        else{
            System.out.println("Le nombre " + nombre + " est impair");
        }

        // Utilisation de la structure ternaire
        int age = 19;
        String majeurOuMineur = age >= 18 ? "Majeur": "Mineur";
        System.out.println(majeurOuMineur);

        //Utilisation de while et do...while
        int nbr = 0;
        while(nbr < 0){
            System.out.println(nbr);
            nbr++;
        }

        do{
            nbr++;
            System.out.println(nbr);
        } while(nbr < 0);
    }
    
    //Determiner si un nombre est divisible par 2 et 3
    public static void divisible(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un nombre entiersdf");
        if (scanner.hasNextInt()){
            int nombre = scanner.nextInt();

            if(nombre % 2 == 0 && nombre % 3 == 0){
                System.out.printf("Le nombre %d est divisible par 2 et 3", nombre);
            }
            else if(nombre % 2 == 0){
                System.out.printf("Le nombre %d est divisible seulement par 2", nombre);
            }
            else if(nombre % 3 == 0){
                System.out.printf("Le nombre %d est divisible seulement par 3", nombre);
            }
            else{
                System.out.printf("Le nombre %d n'est ni divisible par 2, ni divisible par 3", nombre);
            }
        }
        scanner.close();
    }
}


