package vehicule;

public class Camion extends Vehicule {
    public void determinerEmissionCamion(){
        System.out.println("Etant " + getMarque() + ", un très gradnd véhicule, mon émission de CO2 est 29MtCO2 eq");
    }
}
