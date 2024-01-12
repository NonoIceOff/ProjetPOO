package Classes;

public class Joueur extends Personnage {
    private String asciiArtCharacter;
    private String secondAttackUser;
    private int gold;

    public Joueur(String nom, int pointsDeVie, int pointsDEsquive, int force, String asciiArtCharacter, int mana,
            int agility,
            String manaSpe, String secondAttackUser, int gold) {
        super(nom, pointsDeVie, pointsDEsquive, force, agility, mana, manaSpe);
        this.asciiArtCharacter = asciiArtCharacter;
        this.secondAttackUser = secondAttackUser;
        this.gold = gold;
    }
    // getters and setters
    // getters and setters
    // getters and setters

    public String getAsciiArtCharacter() {
        /**
         Méthode permettant d'obtenir le design du joueur
         Retourne le design du joueur dans un type "String"
         */
        return asciiArtCharacter;
    }

    public void setAsciiArtCharacter(String asciiArtCharacter) {
        /**
         Méthode permettant de fixer le design du joueur
         Paramètre : un design de joueur dans un type "String"
         Retourne rien mais assigne le design du caractère dans une variable de la classe
         */
        this.asciiArtCharacter = asciiArtCharacter;
    }

    public String getnom() {
        /**
         Méthode permettant d'obtenir le nom du joueur
         Retourne le nom du joueur dans un type "String"
         */
        return asciiArtCharacter;
    }

    public void setnom(String nom) {
        /**
         Méthode permettant de fixer le nom du joueur
         Paramètre : un nom de type "String"
         Retourne rien mais assigne le nom du joueur dans la variable nom de la classe
         */
        this.nom = nom;
    }

    public String getSecondAttackUser() {
        /**
         Méthode permettant d'obtenir la seconde attaque du joueur
         Retourne la seconde attaque du joueur dans un type "String"
         */
        return secondAttackUser;
    }

    public void setSecondAttackUser(String secondAttackUser) {
        /**
         Méthode permettant de fixer la seconde attaque du joueur
         Paramètre : le nom de la seconde attaque de type "String"
         Retourne la seconde attaque du joueur dans un type "String"
         */
        this.nom = secondAttackUser;
    }

    public int getpointsDeVie() {
        /**
         Méthode permettant d'obtenir les points de vies du joueur
         Retourne les points de vie du joueur dans un type "int"
         */
        return pointsDeVie;
    }

    public void setpointsDeVie(int pointsDeVie) {
        /**
         Méthode permettant de fixer les points de vie du joueur
         Paramètre : un nombre entier de points de vies (int)
         Retourne rien mais assigne les points de vie dans la avriable pointsDeVie de la classe
         */
        this.pointsDeVie = pointsDeVie;
    }

    public int getMana() {
        /**
         Méthode permettant d'obtenir le mana du joueur
         Retourne le mana du joueur dans un type "int"
         */
        return mana;
    }

    public void setMana(int mana) {
        /**
         Méthode permettant de fixer le mana du joueur
         Paramètre : un nombre entier de mana (int)
         Retourne rien mais assigne le mana du joueur dans un type "int"
         */
        this.mana = mana;
    }

    public void setGold(int gold) {
        /**
         Méthode permettant de fixer l'argent du joueur
         Paramètre : un nombre entier d'argent (int)
         Retourne rien mais assigne l'argent du joueur
         */
        this.gold = gold;
    }

    public int getGold() {
        /**
         Méthode permettant d'obtenir l'argent du joueur
         Retourne l'argent du joueur dans un type "int"
         */
        return gold;

    }
    // fin getters and setters
    // fin getters and setters
    // fin getters and setters

    public void attaquer() {
        /**
         Méthode permettant d'attaquer
         Retourne rien mais affiche
         */
        System.out.println("Joueur Attaque !");
    }

    // Méthode de défense spécifique pour le joueur
    @Override
    public void defendre() {
        /**
         Méthode permettant de défendre
         Retourne rien mais affiche
         */
        System.out.println("Le joueur " + this.nom + " se défend !");
    }

    // Méthode spécifique pour le joueur qui lui permet de prendre un objet
    public void prendreObjet() {
        /**
         Méthode permettant de prendre un objet
         Retourne rien mais affiche
         */
        System.out.println("Objet utilisé");
    }

    // Méthode d'interaction spécifique pour le joueur
    @Override
    public void interagir(Personnage personnage) {
        /**
         Méthode permettant d'intéragir un personnage à partir d'un joueur
         Retourne rien mais affiche
         */
        System.out.println("Le joueur " + this.nom + " a interagi avec " + personnage.getNom() + ".");
    }
}
