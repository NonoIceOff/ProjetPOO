package Classes;

public class Joueur extends Personnage {

    private String nom;
    private int pointsDeVie;
    private int force;

    public Joueur(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
    }
    public void attaquer() {
        System.out.println("Joueur Attaque !");
    }

    public void defendre() {
        System.out.println("Joueur Défense !");
    }
    public void PrendreObjet() {System.out.println("Objet utilisé");}

    public void interagir(Personnage personnage) {
        super.interagir(personnage);
    }
}
