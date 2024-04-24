package com.example.demo13;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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

    public static void main(String[] args) throws JsonProcessingException {
        Personne personne = new Personne();

        personne.setNom("Jean Dupont");

        personne.setAge(35);

        personne.setPoste("Développeur web");

        personne.ajouterCompetence("JavaScript");
        personne.ajouterCompetence("HTML");
        personne.ajouterCompetence("CSS");

        Adresse adresse = new Adresse();
        adresse.setRue("123 rue Principale");
        adresse.setVille("Villeville");
        adresse.setCode_postal("12345");

        personne.setAdresse(adresse);

        //Création de projet à ajouter
        Projet projet1 = new Projet();
        projet1.setNom("Site e-commerce");
        projet1.setClient("ABC Entreprises");
        projet1.setDuree("6 mois");

        personne.ajouterProjet(projet1);

        Projet projet2 = new Projet();

        projet2.setNom("Application de gestion");
        projet2.setClient("XYZ Société");
        projet2.setDuree("4 mois");

        personne.ajouterProjet(projet2);

        ObjectMapper mapper = new ObjectMapper();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = mapper.writeValueAsString(personne);
        System.out.println(json);

        //Écrire dans un fichier Json
        //mapper.writeValue(new File("src/main/resources/test.json"), personne);
    }
}