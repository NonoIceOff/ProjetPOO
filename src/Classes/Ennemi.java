package Classes;

import java.util.ArrayList;
import java.util.List;

public class Ennemi extends Personnage {

    private String nom;
    private int pointsDeVie;
    private int force;

    public Ennemi(String nom, int pointsDeVie, int force, int agility, int mana, String manaSpe) {
        super(nom, pointsDeVie, force, agility, mana, manaSpe);
    }

    public void attaquer() {
        System.out.println("Ennemi Attaque !");
    }

    public void defendre() {
        System.out.println("Ennemi Défend !");
    }

    public void interagir(Personnage personnage) {
        System.out.println(this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
