package com.example.rencontre24;

import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)  {
        Fichier fichier1 = new Fichier();
        fichier1.setNom("Test1.docx");
        fichier1.setTaille(100);

        Fichier fichier2 = new Fichier();
        fichier2.setNom("Test2.docx");
        fichier2.setTaille(200);

        Repertoire dossier = new Repertoire();
        dossier.getListeFichier().add(fichier1);
        dossier.getListeFichier().add(fichier2);

        File file = new File("src/main/resources/repertoire.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try{
            mapper.writeValue(file, dossier);
        }
        catch(IOException exp){
            System.out.println("On a eu une erreur");
        }



        //launch();
    }
}