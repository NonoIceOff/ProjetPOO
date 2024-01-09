package Classes;

public class Joueur extends Personnage{

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
}
