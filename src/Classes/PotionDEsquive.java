package Classes;
public class PotionDEsquive extends ObjetDuJeu implements Interactuable {
    private int pointsDEsquive;

    public PotionDEsquive(String nom, int pointsDeSoin) {
        super(nom);
        this.pointsDEsquive = pointsDeSoin;
    }

    // Méthode d'interaction avec un personnage (implémentation de l'interface Interactuable)
    @Override
    public void interagir(Personnage personnage) {
        /**
         Méthode permettant d'interragir un personnage depuis une potion de dégat
         Retourne rien mais effectue des actions
         */

        personnage.changerPointsDEsquive(pointsDEsquive);
        System.out.println(personnage.getNom() + " a utilisé "+this.nom+" et a obtenu " + pointsDEsquive + " points d'esquive.");
    }
}
