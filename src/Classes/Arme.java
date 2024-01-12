package Classes;

public class Arme extends ObjetDuJeu implements Interactuable {
    private int degats;
    private int degatsDeForce;
    private int price;

    public Arme(String nom, int degats, int degatsDeForce, int price) {
        super(nom);
        this.degats = degats;
        this.degatsDeForce = degatsDeForce;
        this.price = price;
    }

    public void setPointDeDegats(int degats) {
        /**
         Méthode permettant de fixer les points de dégats de l'arme
         Paramètres : un nombre entier "degats"
         Retourne rien mais change les degats
         */
        this.degats = degats;
    }

    public int getPointsDeDegat() {
        /**
         Méthode permettant d'obtenir les points de dégats de l'arme
         Retourne les points de dégats (int)
         */
        return degats;
    }

    public void setPrice(int price) {
        /**
         Méthode permettant de fixer le prix de l'arme
         Paramètres : un nombre entier "price"
         Retourne rien mais change le prix
         */
        this.price = price;
    }

    public int getprice() {
        /**
         Méthode permettant d'obtenir le prix de l'arme
         Retourne le prix (int)
         */
        return price;
    }

    public String getName() {
        /**
         Méthode permettant d'obtenir le nom de l'arme
         Retourne le nom (String)
         */
        return super.nom;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface
    // Interactuable)
    @Override
    public void interagir(Personnage attaquerPersonnage) {
        /**
         Méthode permettant d'attaquer un personnage depuis une arme
         Paramètre : un personnage à attaquer de type Personnage.
         Retourne rien mais attaque le personnage et affiche un texte
         */
        attaquerPersonnage.changerPointsDeVie(-degats);
        System.out.println(attaquerPersonnage.getNom() + " s'est pris " + degats + " dégâts de vie mais également "
                + degatsDeForce + " dégâts de force à cause de " + this.nom + ".");
    }
}
