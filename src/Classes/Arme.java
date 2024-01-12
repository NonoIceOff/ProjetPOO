package Classes;

public class Arme extends ObjetDuJeu implements Interactuable {
    private int degats;
    private int degatsDeForce;

    public Arme(String nom, int degats, int degatsDeForce) {
        super(nom);
        this.degats = degats;
        this.degatsDeForce = degatsDeForce;
    }

    // ? degat de force ??
    // Méthode d'interaction avec un personnage (implémentation de l'interface
    // Interactuable)
    @Override
    public void interagir(Personnage attaquerPersonnage) {
        attaquerPersonnage.changerPointsDeVie(-degats);
        System.out.println(attaquerPersonnage.getNom() + " s'est pris " + degats + " dégâts de vie mais également "
                + degatsDeForce + " dégâts de force à cause de " + this.nom + ".");
    }
}
