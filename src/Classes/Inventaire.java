package Classes;

import java.util.ArrayList;

public class Inventaire {
    ArrayList<Produit> produits;

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public Inventaire() {
        produits = new ArrayList<Produit>();
    }

    public void ajouterProduit(Produit product) {
        produits.add(product);
    }

    public void retirerProduit(Produit product) {
        produits.remove(product);
    }

    public void afficherInventaire() {
        System.out.println("\nInventaire :");
        for (Produit product : produits) {
            if (product.obtenirQuantite() <= 100) {
                System.out.println(product.obtenirQuantite() + " " + product.getName());
            }
        }
    }

    public boolean verifierProduit(String nom, int quantite) {
        for (Produit product : produits) {
            if (product.getName() == nom && product.obtenirQuantite() >= quantite) {
                return true;
            }
        }
        return false;
    }
}