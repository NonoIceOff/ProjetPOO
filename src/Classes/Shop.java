package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private int gold;
    boolean isBuy = false;
    Menu myMenu = new Menu();
    Game myGold = new Game();
    // myGold.addGold();

    PotionDeDegat potionDamage = new PotionDeDegat("Fiole Infernale", 30, 20);
    PotionDeSoin healingPotion = new PotionDeSoin("Élixir Vital", 50, 20);
    Produit productDamage = new Produit("Fiole Infernale", 10);
    Produit productHealing = new Produit(" Élixir Vital", 15);
    Arme sword = new Arme("Les dagues du monarques des ombres", 200, 0);
    Arme scythe = new Arme("DeathScythe", 250, 0);
    Inventaire myInventaire = new Inventaire(); // a revoir

    List<Integer> listPricesItems = new ArrayList<Integer>();
    List<Integer> listItems = new ArrayList<Integer>();

    public void addListItem() {
        listPricesItems.add(healingPotion.getprice());
        listPricesItems.add(potionDamage.getprice());
        listItems.add(potionDamage.getpointsDeDegat());
        listItems.add(healingPotion.getPointsDeSoin());
    }

    public int buyItems() {
        while (!isBuy) {
            System.out.flush();
            System.out.println("Choose:");
            Scanner scanner2 = new Scanner(System.in);
            int chooseNumber = scanner2.nextInt();
            switch (chooseNumber) {
                case 1:
                    if (this.gold < listPricesItems.get(0)) {
                        productHealing.getQuantite();
                        System.out.println("Vous avez acheté" + " " + productHealing.getName() + " " + "il vous reste"
                                + " "
                                + (this.gold - listPricesItems.get(0)) + " " + productHealing.getQuantite() + "/1");
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
                                        + (this.gold - listPricesItems.get(1)) + " " + "/1");
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                case 3:
                    if (this.gold > listPricesItems.get(1)) {
                        System.out.println(
                                "Vous avez acheté" + " " + productDamage.getName() + " " + "il vous reste" + " "
                                        + (this.gold - listPricesItems.get(1)) + " " + "/1");
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;
                case 4:
                    if (this.gold > listPricesItems.get(1)) {
                        System.out.println(
                                "Vous avez acheté" + " " + productDamage.getName() + " " + "il vous reste" + " "
                                        + (this.gold - listPricesItems.get(1)) + " " + "/1");
                    } else {
                        System.out.println("Vous ne possédez pas assez de gold");
                    }
                    break;

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

    // enlever quantité des produits
    public void shopItems() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║         Boutique                ║");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("║ Vous avez" + " " + this.gold + " " + "gold               ║");
        System.out.println("║                                 ║");
        System.out.println("║ 1." + productHealing.getName() + ": " + listPricesItems.get(0) + " gold" +
                " " + "+" + healingPotion.getPointsDeSoin() + " " + "soin" + " "
                + productDamage.getQuantite() + "/10║");
        System.out.println("║ 2." + productDamage.getName() + ": " + listPricesItems.get(1) + " gold" + " " +
                " " + "+" + potionDamage.getpointsDeDegat() + " " + "soin" + " " + productHealing.getQuantite()
                + "/15║");
        System.out.println("║                                 ║");
        System.out.println("║ 4. Back to menu:                ║");
        System.out.println("╚═════════════════════════════════╝");
    }
}
