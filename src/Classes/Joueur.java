package Classes;


public class Joueur extends Personnage {


    public Joueur(String nom, int pointsDeVie, int pointsDEsquive, int force) {
        super(nom, pointsDeVie, pointsDEsquive, force);
    }
    // Méthode d'attaque spécifique pour attaquer un ennemi
    public void attaquer(Ennemi ennemi) {
        System.out.println("Le joueur " + this.nom + " attaque l'ennemi " + ennemi.getNom() + ".");
    }

    // Méthode d'attaque spécifique pour attaquer un autre joueur
    public void attaquer(Joueur joueur) {
        System.out.println("Le joueur " + this.nom + " attaque le joueur " + joueur.getNom() + ".");
    }

    // Méthode de défense spécifique pour le joueur
    @Override
    public void defendre() {
        System.out.println("Le joueur " + this.nom + " se défend !");
    }

    // Méthode spécifique pour le joueur qui lui permet de prendre un objet
    public void prendreObjet() {
        System.out.println("Objet utilisé");
    }

    // Méthode d'interaction spécifique pour le joueur
    @Override
    public void interagir(Personnage personnage) {
        System.out.println("Le joueur " + this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
