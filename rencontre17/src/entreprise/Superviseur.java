package entreprise;

public class Superviseur extends Employe{
    private double bonus;
    public Superviseur(double salaire, double bonus) {
        super(salaire);
        this.bonus = bonus;
    }

    @Override
    public double getSalaire(){
        return super.getSalaire() + bonus;
    }
}
