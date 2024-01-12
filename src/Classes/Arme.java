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
        this.degats = degats;
    }

    public int getPointsDeDegat() {
        return degats;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getprice() {
        return price;
    }

    public String getName() {
        return super.nom;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface
    // Interactuable)
    @Override
    public void interagir(Personnage attaquerPersonnage) {
        attaquerPersonnage.changerPointsDeVie(-degats);
        System.out.println(attaquerPersonnage.getNom() + " s'est pris " + degats + " dégâts de vie mais également "
                + degatsDeForce + " dégâts de force à cause de " + this.nom + ".");
    }
}
