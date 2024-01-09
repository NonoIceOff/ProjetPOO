public class Arme extends ObjetDuJeu implements Interactuable {
    private int degats;

    public Arme(String nom, int degats) {
        super(nom);
        this.degats = degats;
    }

    @Override
    public void interagir(Personnage attaquerPersonnage) {
        attaquerPersonnage.changerPointsDeVie(-degats);
        System.out.println(attaquerPersonnage.getNom() + " s'est pris " + degats + " dégâts.");
    }
}
