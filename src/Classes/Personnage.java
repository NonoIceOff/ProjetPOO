package Classes;

public class Personnage {
    protected String nom;
    protected int pointsDeVie;
    protected int pointsDEsquive;
    protected int force;

    public Personnage(String nom, int pointsDeVie, int pointsDEsquive, int force) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.pointsDEsquive = pointsDEsquive;
        this.force = force;
    }

    // Méthode pour obtenir le nom du personnage
    public String getNom() {
        return nom;
    }

    // Méthode pour définir le nom du personnage
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour obtenir les points de vie du personnage
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    // Méthode pour définir les points de vie du personnage
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    // Méthode pour obtenir la force du personnage
    public int getForce() {
        return force;
    }

    // Méthode pour définir la force du personnage
    public void setForce(int force) {
        this.force = force;
    }

    // Méthode d'attaque générique
    public void attaquer() {
        System.out.println(this.nom + " Attaque !");
    }

    // Méthode d'attaque contre un ennemi
    public void attaquer(Ennemi ennemi) {
        System.out.println(this.nom + " attaque l'ennemi " + ennemi.getNom() + ".");
    }

    // Méthode d'attaque contre un joueur
    public void attaquer(Joueur joueur) {
        System.out.println(this.nom + " attaque le joueur " + joueur.getNom() + ".");
    }

    // Méthode de défense générique
    public void defendre() {
        System.out.println("Certains se défendent !");
    }

    // Méthode d'interaction avec un autre personnage
    public void interagir(Personnage personnage) {
        System.out.println("Quelqu'un a interagi avec " + personnage.getNom() + ".");
    }

    // Méthode pour changer les points de vie du personnage
    public void changerPointsDeVie(int points) {
        pointsDeVie += points;
    }

    // Méthode pour changer les points d'esquive du personnage
    public void changerPointsDEsquive(int points) {
        pointsDEsquive += points;
    }

    // Méthode d'affichage des informations du personnage
    public void informations() {
        System.out.println(this.getNom() + " a " + this.getPointsDeVie() + " points de vie, " + this.force + " de force.");
    }

}

