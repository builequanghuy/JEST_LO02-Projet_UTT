import java.util.Scanner;

public class Joueur {
    private String nom;
    private boolean estVirtuel;
    private Jest jest;
    private Offre offre;

    Joueur(String nom, boolean estVirtuel){
        this.nom = nom;
        this.estVirtuel = estVirtuel;
        this.jest = new Jest();
    }

    public String getNom(){
        return this.nom;
    }

    public String estVirtuel(){
        return this.estVirtuel();
    }

    public Jest getJest(){
        return this.jest;
    }

    public Offre getOffre(){
        return this.offre;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public Carte recevoirCartes(Carte[] cartes){
        this.offre = new Offre(cartes);
        Carte carteVisible = this.choisirCarteVisible(cartes);
        carteVisible.setVisible(true);
        return carteVisible;
    }

    public Carte choisirCarteVisible(Carte[] cartes){
        Scanner sc = new Scanner(System.in);
        int choix;
        System.out.println("Vous avez 2 cartes a choisir:");
        System.out.println(cartes[0].toString()+cartes[1].toString());
        System.out.print("Choisir par entrer 0/1:");
        choix = sc.nextInt();
        sc.close();
        return cartes[choix];
    }

    public int[] choisirCarteAuTable(Tour tour){
        Scanner sc = new Scanner(System.in);
        int choixJoueur, choixCarte;
        tour.afficherOffresDispos();
        System.out.println("Entrer successivement l'indice du joueur et l'indice de la carte:");
        choixJoueur = sc.nextInt();
        choixCarte = sc.nextInt();
        sc.close();
        return new int[] {choixJoueur,choixCarte};
    }

}
