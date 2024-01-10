package Classes;

public class Ennemi extends Personnage {

    public Ennemi(String nom, int pointsDeVie, int pointsDEsquive, int force) {
        super(nom, pointsDeVie, pointsDEsquive, force);
    }
    @Override
    public void attaquer() {
        super.attaquer();
    }

    public void attaquer(Joueur joueur) {
        System.out.println("L'ennemi "+this.nom+" attaque le joueur " + joueur.getNom() + ".");
    }

    public void attaquer(Ennemi ennemi) {
        System.out.println("L'ennemi "+this.nom+" attaque l'ennemi " + ennemi.getNom() + ".");
    }

    @Override
    public void defendre() {
        System.out.println("L'ennemi "+this.nom+" se défend !");
    }

    @Override
    public void interagir(Personnage personnage) {
        System.out.println("L'ennemi "+this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
