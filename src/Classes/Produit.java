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
        return nom;
    }

    public void setName(String name) {
        this.nom = nom;
    }

    public int obtenirQuantite() {
        return quantite;
    }

    public void mettreQuantite(int quantite) {
        this.quantite = quantite;
    }
}