package Classes;
public class PotionDeSoin extends ObjetDuJeu implements Interactuable {
    private int pointsDeSoin;

    public PotionDeSoin(String nom, int pointsDeSoin) {
        super(nom);
        this.pointsDeSoin = pointsDeSoin;
    }

    @Override
    public void interagir(Personnage personnage) {
        personnage.changerPointsDeVie(pointsDeSoin);
        System.out.println(personnage.getNom() + " a utilisé "+this.nom+" et a été soigné de " + pointsDeSoin + " points de vie.");
    }
}
