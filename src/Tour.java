public class Tour {
    Joueur[] joueursNonJoues;
    Joueur[] joueursOffreDispo;
    boolean finTour;

    Tour(Joueur[] joueurs){
        this.joueursNonJoues = joueurs;
        this.joueursOffreDispo = new Joueur[joueurs.length];
    }

    public void afficherOffresDispos(){
        int i;
        for (i=0;i<joueursOffreDispo.length;i++){
            System.out.println("Joueur" + this.joueursOffreDispo[i].getNom() + "a 2 cartes a offrir: ");
            System.out.println(joueursOffreDispo[i].getOffre().cartes[0]);
            System.out.println(joueursOffreDispo[i].getOffre().cartes[1]);
        }
    }

    public void mettreAJourTour(Joueur joueurJoue, Joueur joueurChoisi){

    }

    public void retirerJoueurChoisi(Joueur joueur){

    }

    public void retirerJoueurJoue(Joueur joueur){
        
    }
}
