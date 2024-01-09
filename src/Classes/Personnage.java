package Classes;

public class Personnage {
    private String nom;
    private int pointsDeVie;
    private int force;

    public Personnage(String nom, int pointsDeVie, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void attaquer() {
        System.out.println(this.nom + " Attaque !");
    }

    public void attaquer(Ennemi ennemi) {
        System.out.println(this.nom + " attaque l'ennemi " + ennemi.getNom() + ".");
    }

    public void attaquer(Joueur joueur) {
        System.out.println(this.nom + " attaque le joueur " + joueur.getNom() + ".");
    }

    public void defendre() {
        System.out.println(this.nom + " se défend !");
    }

    public void interagir(Personnage personnage) {
        System.out.println(this.nom + " a interagi avec " + personnage.getNom() + ".");
    }

    public void changerPointsDeVie(int points) {
        pointsDeVie += points;
    }

    public void informations() {
        System.out.println(this.getNom()+" a "+this.getPointsDeVie()+" points de vie, "+this.force+" de force.");
    }

}

