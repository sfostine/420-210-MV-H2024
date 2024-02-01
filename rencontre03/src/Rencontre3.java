public class Rencontre3 {
	//Déclaration d'une constante double
	final static double TAUX_DU_JOUR = 100.9;

	public static void main(String[] args) {
		//Valeur maximale en byte
		System.out.println(Byte.MAX_VALUE);
		
		//Valeur minimale en byte
		System.out.println(Byte.MIN_VALUE);
		
		//Déclaration de long, important de mettre le L à la fin
		//Sinon Java va l'interpréter comme un entier (int)
		long grandChiffre = 35000000000L;
		
		//Déclaration d'un float avec le f à la fin
		float nombre = 10.1f;
		
		//déclaration d'un charactère
		char caractèreA = ' ';
		
		//converti un nombre en caractère. Dans le tableau ASCII, 116 correspond à la lettre t
		char lettreT = (char)116;
		System.out.println(lettreT);
		
		//Déclaration d'un boolean
		boolean valeur = true;
		
		//Déclaration d'un double: nombre décimal
		double temperature = 22.5;
		
		System.out.println(calculerHypothenuse2(2, 3));
		System.out.println(calculerHypothenuse(5, 7));
		System.out.println(calculerHypothenuse(6, 3));
		
		String salutation = "Bonjour tout le monde";
		
		System.out.println(salutation.charAt(5)); //affiche u dans la console.
    }
	
	//Calculer l'hypothénuse d'un triangle: méthode 1
	public static double calculerHypothenuse(double a, double b) {
		/*double carreDeA = Math.pow(a, 2);
		double carreDeB = Math.pow(b, 2);
		double additionDes2Carres = carreDeA + carreDeB;
		
		return Math.sqrt(additionDes2Carres);*/
		
		return Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
	}
	
	//Calculer l'hypothénuse d'un triangle: méthode 2
	public static double calculerHypothenuse2(double a, double b) {		
		return Math.hypot(a, b);
	}
	
	
	
	
	
	

    static String switchExample(int value) {
        return switch (value) {
            case 1 -> "One";
            case 2 -> {
                System.out.println("Processing value 2");
                yield "Two";
            }
            case 3 -> "Three";
            default -> "Other";
        };
    }

}
