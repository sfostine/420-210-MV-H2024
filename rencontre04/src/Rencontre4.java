import java.util.Scanner;

public class Rencontre4 {

	public static void main(String[] args) {
		//Comparaison de 2 chaines de caractères avec equals
		// Il faut que les chaines de caractères soient exactement la même chose y compris les casses
		System.out.println("Test".equals("test")); // false

		// Comparaison de 2 chaines de caractères en ignorant les casses
		System.out.println("Test".equalsIgnoreCase("test")); // true
		
		//concatenation();
		int nombre = 10;
		//System.out.println(++nombre);
		
		
		if(nombre++ == 11) {
			System.out.println(++nombre);
		}
		else {
			System.out.println(nombre++ + nombre*2);
		}
		// 12 35
		
		boolean expression = !(nombre == 35);
		
		System.out.println(25/3); //Ceci donne 8 en entier
		System.out.println(25.0/3); // ceci donne un nombre décimal 8.333333333333334
		
		//N'oubliez pas de mettre f à la fin d'un float
		float nombre2 = 5.7896f;
		
		//Concatenation et string format pour un float
		System.out.println("Le nombre est " + nombre2);
		System.out.println(String.format("Le nombre est %.1f", nombre2));
		System.out.printf("Le nombre est %.1f \n", nombre2);

	}
	
	//Compter le nombre de voyelle dans une phrase
	public static void compterVoyelle() {
		//Utilisation de Scanner pour prendre la saisie de l'utilisateur
		Scanner scanner = new Scanner(System.in);
		
		//Demander à l'utilisateur de saisir une phrase
		System.out.print("Saisissez une phrase quelconque: ");
		
		//Convertir la phrase en lettre minuscule
		String phrase = scanner.nextLine().toLowerCase();
		
		int nombreVoyelle =0;
		
		for(int i = 0; i < phrase.length(); i++) {
			char caractere = phrase.charAt(i);
			
			if(isVowel(caractere)) {
				nombreVoyelle++;
			}
		}
		
		//N'oubliez pas de fermer le scanner
		scanner.close();
		System.out.println("Le nombre de voyelle est " + nombreVoyelle);
		
	}
	
	public static boolean isVowel(char caractere) {
		return caractere == 'a' || caractere == 'e' || caractere == 'i' ||
				caractere == 'o' || caractere == 'u';
	}
	
	public static void concatenation() {
		String nom = "Fostiné";
		String prenom = "Samuel";
		
		System.out.println(prenom + " " + nom + ", comment vas-tu?");
		System.out.println(String.format("%s %s, comment vas-tu?", prenom, nom));
		
	}

}
