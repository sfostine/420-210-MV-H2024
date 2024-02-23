public class Voiture {
    private String marque;
    private String couleur;
    private double vitesse;

    public Voiture(String marque, String couleur, double vitesse){
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = vitesse;
    }
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerer(double vitesseAcceleration){
        this.vitesse += vitesseAcceleration;
    }

    public void decelerer(double vitesseAcceleration){
        this.vitesse -= vitesseAcceleration;
    }

    public void arreter(){this.vitesse = 0;}
}
