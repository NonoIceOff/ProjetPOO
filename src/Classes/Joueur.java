package Classes;


public class Joueur extends Personnage {
    private String asciiArtCharacter;
    private String secondAttackUser;


    public Joueur(String nom, int pointsDeVie, int force, String asciiArtCharacter, int mana, int agility,
            String manaSpe) {
        super(nom, pointsDeVie, force, agility, mana, manaSpe);
        this.asciiArtCharacter = asciiArtCharacter;
        this.secondAttackUser = secondAttackUser;
    }

    public String getAsciiArtCharacter() {
        return asciiArtCharacter;
    }

    public void setAsciiArtCharacter(String asciiArtCharacter) {
        this.asciiArtCharacter = asciiArtCharacter;
    }

    public String getnom() {
        return asciiArtCharacter;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getSecondAttackUser() {
        return secondAttackUser;
    }

    public void setSecondAttackUser(String secondAttackUser) {
        this.nom = secondAttackUser;
    }

    public int getpointsDeVie() {
        return pointsDeVie;
    }

    public void setpointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void attaquer() {
        System.out.println("Joueur Attaque !");

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
