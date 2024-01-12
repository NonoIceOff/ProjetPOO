
import Classes.Arme;
import Classes.Menu;
import Classes.Personnage;

import Classes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // menu du jeu
        Menu myMenu = new Menu();
        myMenu.chooseMode();

        // PotionDeSoin potionGuerison = new PotionDeSoin("Potion de guérison", 20);

        Arme cuillere = new Arme("Cuillère rouillée", 2, 0);
        Arme couteau = new Arme("Couteau", 20, 0);
        Arme couteauSang = new Arme("Couteau ensanglanté", 21, 0);

        // Personnage joueur = new Joueur("Héros", 50, 0, 1);

        // Ennemi ennemi = new Ennemi("Antoine Daniel", 50, 0, 1);

        // couteau.interagir(joueur);

        // joueur.informations();

        // ennemi.interagir(joueur);
        // joueur.interagir(ennemi);

        // joueur.attaquer();

        // Faire une liste pour ensuite le sauvegarder sur le fs (remplacer le Int par
        // le type de classe)
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);

        FileSaver fs = new FileSaver("save.txt");
        fs.save(liste);
        fs.load();

        Produit prod = new Produit("cuillère", 10);
        Produit prod2 = new Produit("cuillère2", 10);
        Inventaire inv = new Inventaire();
        inv.ajouterProduit(prod);
        inv.ajouterProduit(prod2);
        inv.afficherInventaire();
        System.out.println(inv.verifierProduit("cuillère", 10));

        FileSaver fsInv = new FileSaver("inv.txt");
        fsInv.save(inv.getProduits());
        fsInv.load();

    }

}
