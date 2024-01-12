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
        this.pointsDeSoin = pointsDeSoin;
    }

    public int getPointsDeSoin() {
        return pointsDeSoin;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getprice() {
        return price;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface
    // Interactuable)
    @Override
    public void interagir(Personnage personnage) {
        // Applique les points de soin au personnage
        personnage.changerPointsDeVie(pointsDeSoin);
        // Affiche le résultat de l'interaction
        System.out.println(personnage.getNom() + " a utilisé " + this.nom + " et a été soigné de " + pointsDeSoin
                + " points de vie.");
    }
}
