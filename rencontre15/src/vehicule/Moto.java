package vehicule;

public class Moto extends Vehicule{

    public void determinerEmissionMoto(){
        System.out.println("Etant " + getMarque() + ", un véhicule à 2 rous, mon émission de CO2 est 1.5MtCO2 eq");
    }
}
