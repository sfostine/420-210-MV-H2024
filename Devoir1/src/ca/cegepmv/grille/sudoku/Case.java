package ca.cegepmv.grille.sudoku;

public class Case {

    public Case(String valeur, boolean defaut){
        this.valeur = valeur;
        this.defaut = defaut;
    }

    public String getValeur() {
        return valeur;
    }

    private String valeur;

    public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public boolean isDefaut() {
        return defaut;
    }

    private boolean defaut;
}
