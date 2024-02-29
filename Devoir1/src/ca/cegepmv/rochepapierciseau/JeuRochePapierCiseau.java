package ca.cegepmv.rochepapierciseau;

import java.util.Random;
import java.util.Scanner;

public class JeuRochePapierCiseau {
	
	public void demarrerJeu() {
		//tableau d'enum qui contient les 3 valeurs, ROCHE, PAPIER, CISEAU
		//choix = [ROCHE, PAPIER, CISEAU]
		RochePapierCiseau[] choix = RochePapierCiseau.values();
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //Ces variables devraient être incrémenté quand c'est l'utilisateur qui a gagné ou quand c'est l'ordinateur
        int pointUtilisateur = 0, pointOrdinateur = 0;
        
        System.out.println("Bienvenue dans le jeu Roche-Papier-Ciseaux!");
		
		for(int nombrePartie = 0; nombrePartie < 5; nombrePartie++) {
			
			/*******************************votre code va ici*******************************************/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//remplacer par le choix de l'ordinateur en utilisant random
			RochePapierCiseau choixOrdi = null;
			
			// remplacer par le choix de l'utilisateur
			RochePapierCiseau choixUtilisateur = null;
			
			/* déterminer le gagnant comme suit:
			 * ROCHE et PAPIER => PAPIER gagne
			 * ROCHE et CISEAU => CISEAU gagne
			 * PAPIER et CISEAU = PAPIER gagne
			 */
			int gagnant = determinerGagnant(choixUtilisateur, choixOrdi);
			
			//ajouter du code ici pour incrémenter pointUtilisateur quand c'est l'utilisateur qui a gagné
			//ou incrémenter pointOrdinateur, quand c'est l'ordinateur qui a gagné
			/*******************************votre code va ici*******************************************/

			
			
			
			
			
			
			
		}
		
		//fermer le scanner à la fin du jeu
		scanner.close();
		
		// Le message final
        System.out.printf("%nVous avez eu %d. L'ordinateur a eu %d points", pointUtilisateur, pointOrdinateur);

	}
	
	
	
	/*  Vous devez comparer le choix de l'utilisateur avec celui et l'ordi
	 * si le choix de l'ordi est le même que celui de l'ordi, c'est égalité. Vous affichez "egalité" et la méthode retourne 0
	 * Selon les choix, si l'utilisateur a gagné, vous affichez le message "Vous avez gagné" et la méthode retourne 1
	 * Selon les choix, si l'ordinateur a gagné, vous affichez le message "L'ordinateur a gagné" et la méthode retourne -1
	 * -1 représente que l'ordinateur a gagné
		0 représente égalité
		1 représente que l'utilisateur a gagné
		
		Déterminer le gagnant comme suit:
		 * ROCHE et PAPIER => PAPIER gagne
		 * ROCHE et CISEAU => CISEAU gagne
		 * PAPIER et CISEAU = PAPIER gagne
		 */
	private int determinerGagnant(RochePapierCiseau monChoix, RochePapierCiseau choixOrdi) {
		/*******************************votre code va ici*******************************************/

		return 0;
	}

}
