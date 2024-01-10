package Classes;

public class Personnage {
    protected String nom;
    protected int pointsDeVie;
    protected int force;
    protected int agility;
    protected int mana;
    protected String manaSpe;

    public Personnage(String nom, int pointsDeVie, int force, int agility, int mana, String manaSpe) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.agility = agility;
        this.mana = mana;
        this.manaSpe = manaSpe;
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
        System.out.println("Attaque !");
    }

    public void defendre() {
        System.out.println("Défense !");
    }

    public void interagir(Personnage personnage) {
        System.out.println(this.nom + " a interagi avec " + personnage.getNom() + ".");
    }

    public void changerPointsDeVie(int points) {
        pointsDeVie += points;
    }

    public void informations() {
        System.out.println(
                this.getNom() + " a " + this.getPointsDeVie() + " points de vie, " + this.force + " de force.");
    }

}
