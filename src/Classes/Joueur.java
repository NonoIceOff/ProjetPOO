package Classes;

public class Joueur extends Personnage {


    public Joueur(String nom, int pointsDeVie, int pointsDEsquive, int force) {
        super(nom, pointsDeVie, pointsDEsquive, force);
    }
    @Override
    public void attaquer() {
        super.attaquer();
    }

    public void attaquer(Ennemi ennemi) {
        System.out.println("Le joueur "+this.nom+" attaque l'ennemi " + ennemi.getNom() + ".");
    }

    public void attaquer(Joueur joueur) {
        System.out.println("Le joueur "+this.nom+" attaque le joueur " + joueur.getNom() + ".");
    }

    @Override
    public void defendre() {
        System.out.println("Le joueur "+this.nom+" se défend !");
    }

    public void PrendreObjet() {
        System.out.println("Objet utilisé");
    }

    @Override
    public void interagir(Personnage personnage) {
        System.out.println("Le joueur "+this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
