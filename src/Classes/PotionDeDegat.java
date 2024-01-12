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
        this.pointsDeDegat = pointsDeDegat;
    }

    public int getpointsDeDegat() {
        return pointsDeDegat;
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
        personnage.changerPointsDeVie(-pointsDeDegat);
        System.out.println(personnage.getNom() + " a utilisé " + this.nom + " et a été affecté de " + pointsDeDegat
                + " points de vie.");
    }
}
