package Classes;
public class PotionDEsquive extends ObjetDuJeu implements Interactuable {
    private int pointsDEsquive;

    public PotionDEsquive(String nom, int pointsDeSoin) {
        super(nom);
        this.pointsDEsquive = pointsDeSoin;
    }

    @Override
    public void interagir(Personnage personnage) {
        personnage.changerPointsDEsquive(pointsDEsquive);
        System.out.println(personnage.getNom() + " a utilisé "+this.nom+" et a obtenu " + pointsDEsquive + " points d'esquive.");
    }
}
