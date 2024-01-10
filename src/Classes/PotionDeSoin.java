package Classes;
public class PotionDeSoin extends ObjetDuJeu implements Interactuable {
    private int pointsDeSoin;

    public PotionDeSoin(String nom, int pointsDeSoin) {
        super(nom);
        this.pointsDeSoin = pointsDeSoin;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface Interactuable)
    @Override
    public void interagir(Personnage personnage) {
        // Applique les points de soin au personnage
        personnage.changerPointsDeVie(pointsDeSoin);
        // Affiche le résultat de l'interaction
        System.out.println(personnage.getNom() + " a utilisé " + this.nom + " et a été soigné de " + pointsDeSoin + " points de vie.");
    }
}
