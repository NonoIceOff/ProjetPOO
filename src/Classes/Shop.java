package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    // variables
    // variables

    boolean isBuy = false;
    Menu myMenu = new Menu();
    Game myGold = new Game();
    int gold = myGold.addGold();

    // instancie objet
    // instancie objet
    PotionDeDegat potionDamage = new PotionDeDegat("Fiole Infernale", 30, 20);
    PotionDeSoin healingPotion = new PotionDeSoin("Élixir Vital", 50, 20);
    Produit productDamage = new Produit("Fiole Infernale", 10);
    Produit productHealing = new Produit(" Élixir Vital", 15);
    Produit productSword = new Produit(" Les dagues du monarques des ombres", 1);
    Produit productScythe = new Produit(" DeathScythe", 1);
    Arme sword = new Arme("Les dagues du monarques des ombres", 200, 0, 200);
    Arme scythe = new Arme("DeathScythe", 250, 0, 200);
    Inventaire myInventaire = new Inventaire(); // a revoir

    // array pour stocker le prix, et les valeurs des potions et armes
    List<Integer> listPricesItems = new ArrayList<Integer>();
    List<Integer> listItems = new ArrayList<Integer>();

    // ajoute les valeurs dans le tableau
    public void addListItem() {
        listPricesItems.add(healingPotion.getprice());
        listPricesItems.add(potionDamage.getprice());
        listPricesItems.add(sword.getprice());
        listPricesItems.add(scythe.getprice());
        listItems.add(potionDamage.getpointsDeDegat());
        listItems.add(healingPotion.getPointsDeSoin());
        listItems.add(sword.getPointsDeDegat());
        listItems.add(scythe.getPointsDeDegat());

    }

    // systeme de paiment
    public int buyItems() {
        while (!isBuy) {
            System.out.println("Choose:");
            Scanner scanner2 = new Scanner(System.in);
            int chooseNumber = scanner2.nextInt();
            // demande au user de choisir les produits
            switch (chooseNumber) {
                case 1:
                    if (this.gold > listPricesItems.get(0)) {
                        System.out.println("Vous avez acheté" + " " + productHealing.getName() + " " + "il vous reste"
                                + " "
                                + (this.gold - listPricesItems.get(0)));
                        // ajout du produit dans l'inventaire
                        myInventaire.ajouterProduit(productDamage);
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                case 2:
                    if (this.gold > listPricesItems.get(1)) {
                        System.out.println(
                                "Vous avez acheté" + " " + productDamage.getName() + " " + "il vous reste" + " "
                                        + (this.gold - listPricesItems.get(1)));
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                case 3:
                    if (this.gold > listPricesItems.get(1)) {
                        System.out.println(
                                "Vous avez acheté" + " " + productDamage.getName() + " " + "il vous reste" +
                                        " "
                                        + (this.gold - listPricesItems.get(1)) + " " + "/1");
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                case 4:
                    if (this.gold > listPricesItems.get(1)) {
                        System.out.println(
                                "Vous avez acheté" + " " + productDamage.getName() + " " + "il vous reste" +
                                        " "
                                        + (this.gold - listPricesItems.get(1)) + " " + "/1");
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                // si quit renvoie le menu
                case 5:
                    isBuy = true;
                    myMenu.chooseMode();
                    break;
                default:
                    break;
            }
        }
        return this.gold;
    }

    // montre la boutique
    public void shopItems() {
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║         Boutique                          ║");
        System.out.println("╠═══════════════════════════════════════════╣");
        System.out.println("║ Vous avez" + " " + gold + " " + "gold                         ║");
        System.out.println("║                                           ║");
        System.out.println("║ 1." + productHealing.getName() + ": " + listPricesItems.get(0) + " gold" +
                " " + "+" + healingPotion.getPointsDeSoin() + " " + "soin" + "         ║");
        System.out.println("║ 2." + productDamage.getName() + ": " + listPricesItems.get(1) + " gold" + " " +
                " " + "+" + potionDamage.getpointsDeDegat() + " " + "soin" + "      ║");
        System.out.println("║ 3." + sword.getName() + ": " + "║\n║" + listPricesItems.get(2) + " " + "gold" + " " + "+"
                + sword.getPointsDeDegat() + " " + "dégats" + "║");
        System.out.println(
                "║ 4." + productScythe.getName() + ": " + listPricesItems.get(3) + " " + "gold " + "+"
                        + scythe.getPointsDeDegat() + " " + "dégats      ║");
        System.out.println("║                                           ║");
        System.out.println("║                                           ║");
        System.out.println("║ 5. Back to menu:                          ║");
        System.out.println("╚═══════════════════════════════════════════╝");
    }
}
