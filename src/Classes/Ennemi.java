package Classes;

public class Ennemi extends Personnage {

    private String nom;
    private int pointsDeVie;
    private int force;

    public Ennemi(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
    }
    @Override
    public void attaquer() {
        super.attaquer();
    }

    public void attaquer(Joueur joueur) {
        System.out.println(this.nom+" attaque le joueur " + joueur.getNom() + ".");
    }

    public void attaquer(Ennemi ennemi) {
        System.out.println(this.nom+" attaque l'ennemi " + ennemi.getNom() + ".");
    }

    @Override
    public void defendre() {
        System.out.println(this.nom+" se défend !");
    }

    @Override
    public void interagir(Personnage personnage) {
        super.interagir(personnage);
    }
}
