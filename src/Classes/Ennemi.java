package Classes;

public class Ennemi extends Personnage{

    public Ennemi(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
    }
    public void attaquer() {
        System.out.println("Ennemi Attaque !");
    }

    public void defendre() {
        System.out.println("Ennemi Défend !");
    }
}
