package ca.cegepmv.heritagesuper;

public class Voiture extends Vehicule{

    //Utilisation de super dans la classe enfant pour appeler le constructeur de la classe parent
    public Voiture(String marque, int annee){
        super(marque, annee);
    }
}
