public class Potion extends ObjetDuJeu implements Interactuable {
    private int pointsDeSoin;

    public Potion(String nom, int pointsDeSoin) {
        super(nom);
        this.pointsDeSoin = pointsDeSoin;
    }

    @Override
    public void interagir(Personnage personnage) {
        personnage.changerPointsDeVie(pointsDeSoin);
        System.out.println(personnage.getNom() + " a utilisé "+this.nom+" et a été soigné de " + pointsDeSoin + " points.");
    }
}
