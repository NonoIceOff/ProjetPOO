package Classes;

public class Ennemi extends Personnage {

    public Ennemi(String nom, int pointsDeVie, int pointsDEsquive, int force) {
        super(nom, pointsDeVie, pointsDEsquive, force);
    }
    // Méthode d'attaque spécifique pour attaquer un joueur
    public void attaquer(Joueur joueur) {
        System.out.println("L'ennemi " + this.nom + " attaque le joueur " + joueur.getNom() + ".");
    }

    // Méthode d'attaque spécifique pour attaquer un autre ennemi
    public void attaquer(Ennemi ennemi) {
        System.out.println("L'ennemi " + this.nom + " attaque l'ennemi " + ennemi.getNom() + ".");
    }

    // Méthode de défense spécifique pour l'ennemi
    @Override
    public void defendre() {
        System.out.println("L'ennemi " + this.nom + " se défend !");
    }

    // Méthode d'interaction spécifique pour l'ennemi
    @Override
    public void interagir(Personnage personnage) {
        System.out.println("L'ennemi " + this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
