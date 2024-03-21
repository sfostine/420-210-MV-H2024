package gestion;

import javax.swing.*;

public class Main {

    public static void main(String [] args){
       Professeur samuel = new Professeur("Fostiné", "Samuel", "09814");

        Professeur reda = new Professeur("Hamza", "Réda", "23423434");


        Cours prog = new Cours("Programmation orientée objet", "420-210-Mv");

       prog.setProfesseur(samuel);

       Etudiant mario = new Etudiant("Hernandez", "Mario");
       double [] notes = {90, 100, 85, 100};
       mario.setNotes(notes);

       System.out.println(mario.calculerMoyenne());

       prog.getEtudiants()[0] = mario;
    }

    public static boolean comparerTableau(int [] tableau1, int[] tableau2){
        if (tableau1.length != tableau2.length){
            return false;
        }

        for (int i = 0; i < tableau1.length; i++) {
            if (tableau1[i] != tableau2[i]){
                return false;
            }
        }

        return  true;
    }
}
