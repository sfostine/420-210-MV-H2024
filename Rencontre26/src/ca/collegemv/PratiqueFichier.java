package ca.collegemv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PratiqueFichier {
    public static void main(String[] args)  {

        String chemin = "src/fichier.txt";
        File file = new File(chemin);

        try{
            //Créer un fichier si ce dernier n'existe pas
            if(file.createNewFile() == true){
                System.out.println("Je viens de créer le fichier " + chemin);
            }
            else{
                System.out.println("Le fichier existe déjà");
            }

            //Écrire dans le fichier
            FileWriter writer = new FileWriter(chemin, true);
            writer.write("Bonjour tout le monde\n");
            writer.close();

            //Lire le fichier
            lireFichier(file);

            if(file.delete() == true){
                System.out.println("Mon fichier a été supprimé");
            }
            else{
                System.out.println("Le fichier n'a pas été supprimé");
            }

        }
        catch (IOException e){
            e.printStackTrace();
            //System.out.println("Problème lors de la création du fichier");
        }
    }

    public static void lireFichier(File file) {
        try {
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException ex){

        }
    }
}
