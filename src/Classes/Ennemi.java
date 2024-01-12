package Classes;

public class Ennemi extends Personnage {

    public Ennemi(String nom, int pointsDeVie, int pointsDEsquive, int force, int agility, int mana, String manaSpe) {
        super(nom, pointsDeVie, pointsDEsquive, force, agility, mana, manaSpe);
    }

    public void attaquer() {
        /**
         Méthode permettant d'attaquer
         Retourne rien mais affiche un texte
         */
        System.out.println("Ennemi Attaque !");
    }

    // Méthode de défense spécifique pour l'ennemi
    // @Override
    // public void defendre() {
    // System.out.println("L'ennemi " + this.nom + " se défend !");
    // }

    // Méthode d'interaction spécifique pour l'ennemi
    @Override
    public void interagir(Personnage personnage) {
        /**
         Méthode permettant d'interragir avec un personnage depuis un ennemi
         Retourne rien mais affiche un texte
         */
        System.out.println("L'ennemi " + this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
