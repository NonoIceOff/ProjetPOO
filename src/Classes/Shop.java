package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.Menu;

public class Shop {
    private int gold;
    private int sword = 1;
    private int gauntlets = 1;
    private int lifePotion = 10;
    boolean isBuy = false;
    Menu myMenu = new Menu();

    List<Integer> listPricesItems = new ArrayList<Integer>();
    List<String> listItems = new ArrayList<String>();

    public Shop(int gold) {
        this.gold = gold;
    }

    public void addListItem() {
        listPricesItems.add(330);
        listPricesItems.add(999);
        listPricesItems.add(30);
        listItems.add("Guts Great Sword:");
        listItems.add("Saitama Gauntlets:");
        listItems.add("life Potion:");

    }

    public int buyItems() {
        while (!isBuy) {
            System.out.flush();
            System.out.println("Choose:");
            Scanner scanner2 = new Scanner(System.in);
            int chooseNumber = scanner2.nextInt();
            switch (chooseNumber) {
                case 1:
                    if (this.gold > listPricesItems.get(0)) {
                        this.sword--;
                        System.out.println("Vous avez acheté" + " " + listItems.get(0) + " " + "il vous reste" + " "
                                + (this.gold - listPricesItems.get(0)) + " " + this.sword + "/1");
                    } else {
                        System.out.println("vous etes pauvres");
                    }
                    break;
                case 2:
                    if (this.gold > listPricesItems.get(1)) {
                        this.gauntlets--;
                        System.out.println("Vous avez acheté" + " " + listItems.get(1) + " " + "il vous reste" + " "
                                + (this.gold - listPricesItems.get(1)) + " " + this.gauntlets + "/1");
                    } else {
                        System.out.println("vous etes pauvres");
                    }
                    break;
                case 3:
                    this.lifePotion--;
                    System.out.println("Vous avez acheté" + " " + listItems.get(2) + " " + "il vous reste" + " "
                            + (this.gold - listPricesItems.get(2)) + " " + this.lifePotion + "/10");
                    break;
                case 4:
                    isBuy = true;
                    myMenu.chooseMode();
                    break;
                default:
                    break;
            }
        }
        return this.gold;
    }

    public void shopItems() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║         Boutique                ║");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("║ Vous avez" + " " + this.gold + " " + "gold               ║");
        System.out.println("║                                 ║");
        System.out.println("║ 1. Guts Great Sword:" + " " + listPricesItems.get(0) + " gold   ║");
        System.out.println("║ 2. Saitama Gauntlets:" + " " + listPricesItems.get(1) + " gold  ║");
        System.out.println("║ 3. life Potion:" + " " + listPricesItems.get(2) + "gold          ║");
        System.out.println("║ 4. Back to menu:                ║");
        System.out.println("╚═════════════════════════════════╝");
    }
}
