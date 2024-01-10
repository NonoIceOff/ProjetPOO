package Classes;

public class Joueur extends Personnage {
    private String asciiArtCharacter;
    private String nom;
    private int pointsDeVie;
    private int force;

    public Joueur(String nom, int pointsDeVie, int force, String asciiArtCharacter, int mana, int agility,
            String manaSpe) {
        super(nom, pointsDeVie, force, agility, mana, manaSpe);
        this.asciiArtCharacter = asciiArtCharacter;
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

    public int getpointsDeVie() {
        return pointsDeVie;
    }

    public void setpointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void attaquer() {
        System.out.println("Joueur Attaque !");
    }

    public void defendre() {
        System.out.println("Joueur Défense !");
    }

    public void PrendreObjet() {
        System.out.println("Objet utilisé");
    }

    public void interagir(Personnage personnage) {
        System.out.println(this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
