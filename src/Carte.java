public class Carte {
    private Couleur couleur;
    private Valeur valeur;
    private boolean estVisible;
    private ConditionGagnant conditionGagnant;

    Carte(Valeur valeur, Couleur couleur, ConditionGagnant conditionGagnant){
        this.valeur = valeur;
        this.couleur = couleur;
        this.conditionGagnant = conditionGagnant;
        this.estVisible = false;
    }

    public Valeur getValeur(){
        return this.valeur;
    }

    public Couleur getCouleur(){
        return this.couleur;
    }

    public boolean estVisible(){
        return this.estVisible;
    }

    public String toString(){
        return (this.valeur + " DE " + this.couleur);
    }

    public void setVisible(boolean estVisible){
        this.estVisible = estVisible;
    }

    public int accepter(Visiteur visiteur){
        return (visiteur.visiter(this));
    }

}
