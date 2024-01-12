package Classes;

import java.util.ArrayList;

public class Inventaire {
    ArrayList<Produit> produits;

    public ArrayList<Produit> getProduits() {
        /**
         Méthode permettant d'obtenir les produits dans l'inventaire
         Retourne la liste de produits dans l'inventaire
         */
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        /**
         Méthode permettant de fixer les produits dans l'inventaire
         Paramètre : une liste de produits de type "Produit"
         Retourne rien mais affecte la valeur produits de la classe à une liste de produits
         */
        this.produits = produits;
    }

    public Inventaire() {
        produits = new ArrayList<Produit>();
    }

    public void ajouterProduit(Produit product) {
        /**
         Méthode permettant d'ajouter un produit dans l'inventaire
         Paramètre : un produit de type "Produit"
         Retourne rien mais ajoute à la liste de produits dans l'inventaire, un produit
         */
        produits.add(product);
    }

    public void retirerProduit(Produit product) {
        /**
         Méthode permettant de retirer un produit dans l'inventaire
         Paramètre : un produit de type "Produit"
         Retourne rien mais ajoute à la liste de produits dans l'inventaire, un produit
         */
        produits.remove(product);
    }

    public void afficherInventaire() {
        /**
         Méthode permettant d'afficher l'inventaire
         Retourne rien mais affiche tous les produits ainsi que leur quantité de l'inventaire
         */
        System.out.println("\nInventaire :");
        for (Produit product : produits) {
            if (product.obtenirQuantite() <= 100) {
                System.out.println(product.obtenirQuantite() + " " + product.getName());
            }
        }
    }

    //
    public boolean verifierProduit(String nom, int quantite) {
        /**
         Méthode permettant de vérifier un produit
         Paramètre : le nom du produit (String), et sa quantité (int)
         Retourne true ou false si la quantité d'un produit est présente dans l'inventaire
         */
        for (Produit product : produits) {
            if (product.getName() == nom && product.obtenirQuantite() >= quantite) {
                return true;
            }
        }
        return false;
    }
}