package Classes;

public class PotionDeDegat extends ObjetDuJeu implements Interactuable {
    private int pointsDeDegat;
    private int price;

    public PotionDeDegat(String nom, int pointsDeDegat, int price) {
        super(nom);
        this.pointsDeDegat = pointsDeDegat;
        this.price = price;
    }

    public void setPotionDeDegats(int pointsDeDegat) {
        /**
         Méthode permettant de fixer les points de dégats de la potion
         Paramètre : un nombre entier de points de dégats (int)
         Retourne rien mais assigne les points de dégats à la potion
         */
        this.pointsDeDegat = pointsDeDegat;
    }

    public int getpointsDeDegat() {
        /**
         Méthode permettant d'obtenir les points de dégats de la potion
         Retourne un nombre entier de points de dégats (int)
         */
        return pointsDeDegat;
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
        personnage.changerPointsDeVie(-pointsDeDegat);
        System.out.println(personnage.getNom() + " a utilisé " + this.nom + " et a été affecté de " + pointsDeDegat
                + " points de vie.");
    }
}
