package ca.cegepmv.laboratoire1;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("Test1.docx", "C:/documents/Test1.docx");
        fichier1.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test1.docx");

        Fichier fichier2 = new Fichier("Test2.docx", "C:/documents/Test2.docx");
        //fichier2.setLectureSeul(true);
        fichier2.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test2.docx");

        Fichier fichier3 = new Fichier("Test3.docx", "C:/documents/Test3.docx");
        fichier3.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test3.docx");

        Fichier fichier4 = new Fichier("Test4.docx", "C:/documents/Test4.docx");
        fichier4.setLectureSeul(true);
        fichier4.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test4.docx");

        Fichier fichier5 = new Fichier("Test5.docx", "C:/documents/Test5.docx");
        fichier5.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test5.docx");

        Fichier fichier6 = new Fichier("Test6.docx", "C:/documents/Test6.docx");
        fichier6.ecrire("Bonjour tout le monde! Le nom de ce fichier est Test6.docx");

        Repertoire repertoire = new Repertoire("Dossier1", "C:/documents");
        repertoire.ajouterFichier(fichier1);
        repertoire.ajouterFichier(fichier2);
        repertoire.ajouterFichier(fichier3);
        repertoire.ajouterFichier(fichier4);
        repertoire.ajouterFichier(fichier5);
        repertoire.ajouterFichier(fichier6);

        repertoire.listerFichier();
        System.out.println(repertoire.getTaille());
    }
}
