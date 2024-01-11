package Classes;

import java.util.Scanner;

public class ChooseCharacter {
    // public String user;m
    public String salameche = " _______________________ \n" +
            "< Salut je suis le boss >\n" +
            " ----------------------- \n" +
            "      \\                    / \\  //\\\n" +
            "       \\    |\\___/|      /   \\//  \\\\\n" +
            "            /0  0  \\__  /    //  | \\ \\    \n" +
            "           /     /  \\/_/    //   |  \\  \\  \n" +
            "           @_^_@'/   \\/_   //    |   \\   \\\n" +
            "           //_^_/     \\/_ //     |    \\    \\\n" +
            "        ( //) |        \\///      |     \\     \\\n" +
            "      ( / /) _|_ /   )  //       |      \\     _\\\n" +
            "    ( // /) '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-.\n" +
            "  (( / / )) ,-{        _      `-.|.-~-.           .~         `.\n" +
            " (( // / ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\\n" +
            " (( /// ))      `.     {            }                   /      \\  \\\n" +
            "  (( / ))     .----~-./        \\-'                 .~         \\  `. \\^-.\n" +
            "             ///.----..>        \\             _ -~             `.  ^-`  ^-_\n" +
            "               ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~\n" +
            "                                                                  /.-~";
    String ronflex = "        ,        ,  \n" +
            "      /(        )`  \n" +
            "     |o ` - ' o|  \n" +
            "      \\_ `- ' _/ \n" +
            "     /  `- ' - \\  \n" +
            "    /  .-----   \\ \n" +
            "   /    `.       \\ \n" +
            "  /       \\        \\  \n" +
            " /         \\__)  * ( \\ \n" +
            "|   (    )         )  |   \n" +
            "|    \\___/        /    |   \n" +
            " \\             /    / \n" +
            "  \\           /    /  \n" +
            "    \\_______/    / \n" +
            "      \\_____/_.'  ";

    Joueur character1 = new Joueur("salameche", 10000, 2000, salameche, 10000, 100, "souffle ardent");
    Joueur character2 = new Joueur("Ronflex", 1500, 2000, ronflex, 20, 10, "ronflement");
    String informations = "╔══════════════════════════════╗\n" + //
            "║  Informations                ║\n" +
            "║                              ║\n" +
            "║Nom:" + " " + character1.getNom() + "║\n" +
            "║                              ║\n" +
            "║Force:" + " " + character1.getForce() + "║\n" +
            "║                              ║\n" +
            "║Points de vie:" + " " + character1.getPointsDeVie() + "║\n" +
            "║                              ║\n" +
            "║Mana:" + " " + "                            ║\n" +
            "║                              ║\n" +
            "║                              ║\n" +
            "║                              ║\n" +
            "║                              ║\n" +
            "╚══════════════════════════════╝";

    public void allStarter() {
        System.out.println(
                "Veuillez choisir un personnage: \n1 -" + character1.getAsciiArtCharacter() + " \n"
                        + this.informations + "2 -\n"
                        + character2.getAsciiArtCharacter() + "\n" + this.informations);
    }

    public void chooseStarter() {
        Game myGame = new Game();
        System.out.println("Choose:");
        Scanner scannerChoose = new Scanner(System.in);
        int chooseStarterUser = scannerChoose.nextInt();
        if (chooseStarterUser == 1) {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.salameche);
        } else {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.ronflex);
        }
    }
}
