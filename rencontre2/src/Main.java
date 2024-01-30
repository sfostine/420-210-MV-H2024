//On nomme la classe de la même façon que le nom du fichier
//Le nom de la classe commence par une lettre majuscule selon les conventions dans ce cours
public class Main {
	/*Déclaration d'une constante en java
	 - private pour dire que la variable est privée 
	   et qu'elle ne peut être accéder à l'extérieur de la classe
	 - static pour dire que la variable appartient à la classe
	   au lieu d'une instance de la classe. On en reparlera de static
	 - final pour dire que la variable est finale et elle ne peut pas
	   être modifiée. C'est ce qui la rend constante
	 - double est le type
	 - TAUX_DE_CHANGE est le nom de la variable. On a dit que les constantes
	   vont s'écrire en majuscule et chaque nouveau sera séparé par le signe _
	 - 7.15 est la valeur assignée à la variable*/
	private static final double TAUX_DE_CHANGE = 7.15;
	
	
	/* La méthode main est le point d'entrée de notre application. 
	 * Quand on exécute l'application, la JVM recherche le point d'entrée 
	 * pour commencer à exécuter le code. Et ce point d'entrée est la méthode main*/
	public static void main(String [] args) {
		
		// Ceci est un commentaire sur une seule ligne
		
		/* Ceci est un commentaire sur plusieurs lignes
		  Mon commentaire continuent
		  Je suis encore dans mon commentaire. Et il va se terminer là */
		
		//Déclaration d'un string ou chaine de caractères
		/*Noter bien qu'il est bien d'utiliser des commentaires dans le code, surtout dans le cadre de ce cours
		 * Cela vous permet et permet au prof de mieux comprendre ce que vous écrivez
		 * et permet aux autres de savoir ce que fait votre code
		 * Par contre, il est conseillé de bien nommer vos variables, vos méthodes et autres
		 * pour que le code parle par lui-même*/
		String bonjour;
		
		//assignation de la valeur Bonjour à la variable bonjour
		bonjour = "Bonjour";
		String etirement = "etirement";
		System.out.println(bonjour + " " + etirement);
		
		//byte est un type d'entier qui peut contenir les valeurs entre -128 et 127
		byte nombre = 127;
		
		//le résultat de 127*2 = 254, mais on ne peut pas stocker 254 dans un byte
		//C'est pour cela qu'ici, on essaie de faire un cast de 254 en byte, mais on perd de la précision
		System.out.println((byte)(nombre*2));
			
		
	}
	
	// Cette fonction fait l'addition de deux nombres
	// Le nom de la méthode commence par une lettre minuscule dans le cours
	public static int addition(int nombre, int nombre2) {
		return nombre + nombre2;
	}

}
