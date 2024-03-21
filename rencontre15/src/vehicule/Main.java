package vehicule;

public class Main {
    public static void main(String [] args){
        Camion cam = new Camion();
        cam.setMarque("Honda");
        cam.setAnnee(2020);
        cam.toString();
        cam.determinerEmissionCamion();

        Voiture tesla = new Voiture();
        tesla.setMarque("Tesla");
        tesla.setAnnee(2024);
        tesla.toString();
        tesla.determinerEmissionVoiture();
    }
}
