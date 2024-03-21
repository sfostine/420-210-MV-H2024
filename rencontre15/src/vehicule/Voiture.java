package vehicule;

public class Voiture extends Vehicule{

    public void determinerEmissionVoiture(){
        System.out.println("Etant " + getMarque() + ", un moyen véhicule, mon émission de CO2 est 9MtCO2 eq");
    }
}
