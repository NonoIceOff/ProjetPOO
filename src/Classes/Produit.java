package Classes;

import java.io.Serializable;

public class Produit implements Serializable {
    private String nom;
    private int quantite;

    public Produit(String nom, int quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }

    public String getName() {
        /**
         Méthode permettant d'obtenir le nom du produit
         Retourne le nom du produit dans un type "String"
         */
        return nom;
    }

    public void setName(String name) {
        /**
         Méthode permettant de fixer le nom du produit
         Retourne rien mais assigne le nom du produit
         */
        this.nom = nom;
    }

    public int getQuantite() {
        /**
         Méthode permettant d'obtenir la quantité du produit
         Retourne la quantite de produit dans un nombre entier (int)
         */
        return quantite;
    }

    public void setQuantite(int quantite) {
        /**
         Méthode permettant de fixer la quantité d'un produit
         Retourne rien mais assigne la quantité d'un produit
         */
        this.quantite = quantite;
    }

    public int obtenirQuantite() {
        /**
         Méthode permettant d'obtenir la quantité d'un produit
         Retourne le nombre entier de la quantité d'un produit
         */
        return quantite;
    }

    public void mettreQuantite(int quantite) {
        /**
         Méthode permettant de fixer la quantité d'un produit
         Retourne rien mais assigne la quantité d'un produit
         */
        this.quantite = quantite;
    }
}