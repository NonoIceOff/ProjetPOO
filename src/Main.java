
import Classes.Arme;
import Classes.Menu;
import Classes.Personnage;

import Classes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /**
         Méthode permettant le lancement du jeu
         Retourne rien
         */

        // menu du jeu
        Menu myMenu = new Menu();
        myMenu.chooseMode();

        // Faire une liste pour ensuite le sauvegarder sur le fs (remplacer le Int par
        // le type de classe)
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);

        // Instance de sauvegarde
        FileSaver fs = new FileSaver("save.txt");
        fs.save(liste);
        //Affiche le contenu du fichier
        fs.load();

        // Initialiser un inventaire
        Produit prod = new Produit("cuillère", 10);
        Produit prod2 = new Produit("cuillère2", 10);
        Inventaire inv = new Inventaire();
        inv.ajouterProduit(prod);
        inv.ajouterProduit(prod2);
        inv.afficherInventaire();
        System.out.println(inv.verifierProduit("cuillère", 10));

        // Sauvegarder l'inventaire
        FileSaver fsInv = new FileSaver("inv.txt");
        fsInv.save(inv.getProduits());
        //Affiche le contenu du fichier
        fsInv.load();

    }

}
