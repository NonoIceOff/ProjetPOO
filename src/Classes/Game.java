package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    boolean isFinished = false;
    // private String userCharacter;
    // private String ennemies;
    // private String ennemiesBoss;

    // Game(String userCharacter, String ennemies, String ennemiesBoss) {
    // this.userCharacter = userCharacter;
    // this.ennemies = ennemies;
    // this.ennemiesBoss = ennemiesBoss;
    // }
    String bossCharacter = " _______________________ \n" +
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
    String bossCharacter1 = " _______________________ \n" +
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
    String bossCharacter2 = " _______________________ \n" +
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
    String bossCharacter3 = " _______________________ \n" +
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
    int value = 3000;
    // création des boss
    Boss myBoss = new Boss("Salamèche", 2000, value, 500, 5000, "Souffle ardent du dragon sacrée",
            "mange tes morts", bossCharacter);

    Boss myBoss2 = new Boss("TorTank", 100, 500, 500, 700, "Jet d'eau", "Grand jet d'eau", bossCharacter1);
    Boss myBoss3 = new Boss("TorTank", 10000, 500, 500, 700, "Jet d'eau", "Grand jet d'eau", bossCharacter2);
    Boss myBoss4 = new Boss("TorTank", 1, 500, 500, 700, "Jet d'eau", "Grand jet d'eau", bossCharacter3);

    // List<String> listEnnemies = new ArrayList<String>();Ò

    List<String> listBossAsciiArt = new ArrayList<String>();
    List<Integer> listBossHp = new ArrayList<Integer>();

    public void addBoss() {
        // mettre encapsulation
        listBossAsciiArt.add(myBoss.boss2);
        listBossAsciiArt.add(myBoss2.boss2);
        listBossAsciiArt.add(myBoss3.boss2);
        listBossAsciiArt.add(myBoss4.boss2);
        System.out.println(listBossAsciiArt);
        listBossHp.add(myBoss.force);
        listBossHp.add(myBoss2.force);
        listBossHp.add(myBoss3.force);
        listBossHp.add(myBoss4.force);
        System.out.println(listBossHp);

    }

    Random rand = new Random();
    int randomBoss = (int) (Math.random() * 3);

    ChooseCharacter user = new ChooseCharacter();

    public void showCharacter(String perso) {
        while (!isFinished) {
            // System.out.println(listBossHp.get(randomBoss));
            System.out.println(
                    perso + "\n1 - Dormir: 200 degats | 2 - Coup de pate: 400 degats \n 3 - Inventaire | 4 - Fuir");

            addBoss();
            System.out.println("hp boss" + " " + listBossHp.get(randomBoss) + "\n" + listBossAsciiArt.get(randomBoss));
            Scanner scanner3 = new Scanner(System.in);
            int chooseAttack = scanner3.nextInt();
            switch (chooseAttack) {
                case 1:
                    System.out.println(listBossHp.get(randomBoss) - 200);
                    break;

                default:
                    break;
            }
            isFinished = true;
        }
        // regardec le java morpion
    }

}
