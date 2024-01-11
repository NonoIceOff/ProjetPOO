package Classes;
public class PotionDeDegat extends ObjetDuJeu implements Interactuable {
    private int pointsDeDegat;

    public PotionDeDegat(String nom, int pointsDeDegat) {
        super(nom);
        this.pointsDeDegat = pointsDeDegat;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface Interactuable)
    @Override
    public void interagir(Personnage personnage) {
        personnage.changerPointsDeVie(-pointsDeDegat);
        System.out.println(personnage.getNom() + " a utilisé "+this.nom+" et a été affecté de " + pointsDeDegat + " points de vie.");
    }
}
