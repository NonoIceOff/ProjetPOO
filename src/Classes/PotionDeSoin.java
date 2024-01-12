package Classes;

public class PotionDeSoin extends ObjetDuJeu implements Interactuable {
    private int pointsDeSoin;
    private int price;

    public PotionDeSoin(String nom, int pointsDeSoin, int price) {
        super(nom);
        this.pointsDeSoin = pointsDeSoin;
        this.price = price;
    }

    public void setPointsDeSoin(int pointsDeSoin) {
        /**
         Méthode permettant de fixer les points de dégats de la potion
         Paramètre : un nombre entier de points de dégats (int)
         Retourne rien mais assigne les points de dégats à la potion
         */
        this.pointsDeSoin = pointsDeSoin;
    }

    public int getPointsDeSoin() {
        /**
         Méthode permettant d'obtenir les points de dégats de la potion
         Retourne un nombre entier de points de dégats (int)
         */
        return pointsDeSoin;
    }

    public void setPrice(int price) {
        /**
         Méthode permettant de fixer le prix de la potion
         Paramètre : un prix en nombre entier (int)
         Retourne rien mais assigne le prix
         */
        this.price = price;
    }

    public int getprice() {
        /**
         Méthode permettant d'obtenir le prix de la potion
         Retourne le prix en nombre entier (int)
         */
        return price;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface
    // Interactuable)
    @Override
    public void interagir(Personnage personnage) {
        /**
         Méthode permettant d'interragir un personnage depuis une potion de dégat
         Retourne rien mais effectue des actions
         */
        // Applique les points de soin au personnage
        personnage.changerPointsDeVie(pointsDeSoin);
        // Affiche le résultat de l'interaction
        System.out.println(personnage.getNom() + " a utilisé " + this.nom + " et a été soigné de " + pointsDeSoin
                + " points de vie.");
    }
}
