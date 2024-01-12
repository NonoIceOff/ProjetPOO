package Classes;

import java.util.Scanner;

public class Menu {

    // designe du menu
    public void menu() {
        System.out.println("╔════════════════════════╗");
        System.out.println("║         Menu           ║");
        System.out.println("╠════════════════════════╣");
        System.out.println("║ 1. Commencer le jeu    ║");
        System.out.println("║ 2. Boutique            ║");
        System.out.println("║ 3. Quitter             ║");
        System.out.println("╚════════════════════════╝");
    }

    // choisir une action depuis le menu
    public void chooseMode() {
        Scanner scanner = new Scanner(System.in);
        Shop myShop = new Shop();
        Menu myMenu = new Menu();
        myMenu.menu();
        ChooseCharacter myCharacter = new ChooseCharacter();
        int chooseMode = scanner.nextInt();
        switch (chooseMode) {
            case 1:
                System.out.println("Start");
                myCharacter.allStarter();
                myCharacter.chooseStarter();
                break;
            case 2:
                myShop.addListItem();
                myShop.shopItems();
                myShop.buyItems();
                break;
            case 3:
                System.out.println("A bientôt");
                System.out.flush();

                break;
            default:
                break;
        }
    }
}
