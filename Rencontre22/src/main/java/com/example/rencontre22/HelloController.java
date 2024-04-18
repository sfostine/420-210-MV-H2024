package com.example.rencontre22;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    //Assurez-vous que les noms des attributs correspondent au nom des fx:id dans le fichier hello-vie.fxml
    @FXML
    private TableView tableView;

    @FXML
    private TableColumn<Etudiant, String> nom;

    @FXML
    private TableColumn<Etudiant, String> prenom;

    @FXML
    private TableColumn<Etudiant, String> identifiant;

    @FXML
    private TableColumn<Etudiant, Double> note;

    //List qui permet d'ajouter les éléments dans le tableView
    ObservableList list = FXCollections.observableArrayList();

    //Cette méthode est définie dans l'interface Initializable
    //DOnc notre classe implémente l'interface Initializable et on fournit l'implémentation de la méthode Initialise
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //On crée un objet de type étudiant et on l'ajoute dans la liste
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("Fostiné");
        etudiant.setPrenom("Samuel");
        etudiant.setIdentifiant("09814");
        etudiant.setNote(90.0);

        list.add(etudiant);

        nom.setCellValueFactory( new PropertyValueFactory<Etudiant, String>("nom"));
        prenom.setCellValueFactory( new PropertyValueFactory<Etudiant, String>("prenom"));
        identifiant.setCellValueFactory( new PropertyValueFactory<Etudiant, String>("identifiant"));
        note.setCellValueFactory( new PropertyValueFactory<Etudiant, Double>("note"));

        tableView.setItems(list);
    }
}