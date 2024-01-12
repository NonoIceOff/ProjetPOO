package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
        int winGold;

        // Game(int winGold) {
        // this.winGold = winGold;
        // }

        boolean isFinished = false;
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
        String bossCharacter1 = "            .,::c:;.                     \n" +
                        "         ..;dxdxOOO0O;                   \n" +
                        "        .';dxkO00KKXX0o.                 \n" +
                        "        ;,;ldxkOOOO0K0d                 \n" +
                        "        ;,;cdxkkOOOO0K0k                 \n" +
                        "       :,.,c:;,''dd,':dkO.               \n" +
                        "       c;;ccodxdoxKkxO0OO                \n" +
                        "        l;,:;:ccclkOl:dOx                \n" +
                        "          ':;:;:;..co:ll    ;dkOKK.      \n" +
                        "           ';:lllccdOkx     ,K0K0OO:..   \n" +
                        "           ..':oolldOO.      XNNNNXxk0Oc \n" +
                        "           .'......,cd,     oKXOXXKddook.\n" +
                        "            ....  .:''....  .oO00K0xcddk \n" +
                        "         .             .....';KXXXXKl;;c \n" +
                        "  ......             ........'lo:,;:,ld. \n" +
                        "                 .............,clcldkxl. \n" +
                        "               ................:oxOOxl'.. \n";

        String bossCharacter2 = " ..':;;;;'..              \n" +
                        "                         ..  ';:::::;;;;;,'.            \n" +
                        "                          ...,:::::;;;;;;,'....         \n" +
                        "                        .,::'.,::::;;;;,,. ..''.        \n" +
                        "                       .;;::od.,;;:;,,,........'.       \n" +
                        "                      .;:;dXMMXo,','.;:lkko,'''''.      \n" +
                        "                     ,:::oWMM0klk;,,loxdXK0k,'''''.     \n" +
                        "                   .;:::;KMMM,..d;;,l., XK0Oc''''''.    \n" +
                        "                  ,:::::;XWMMKlk;;;,d,,xXK0kc'''''''.   \n" +
                        "                .:::::;;;oNNNXx:;;;,:0KK0Oko,,,''''''.  \n" +
                        "               .:::;,;k:,;:lc:;;;;,,,,cool;',,'''''..'' \n" +
                        "              ;:::;'0Xx....'''..............k:.......''\n" +
                        "              .:::;:kxl:;;;:::;;;,,''......xXx...''..., \n" +
                        "               ,,;;;;;;,,,,,,,,,,,,,,,,,,''odo,.,,....,  \n" +
                        "                 ..''................................'   \n" +
                        "                      .............................       \n" +
                        "                          ..............    ..           \n" +
                        "                 .'''''....,,,,,,,;;;:clo               \n" +
                        "                ............,:c:;;,,;::ld               \n" +
                        "                .''...........,:c:;,,;:c:               \n" +
                        "                 .''''........ ....''''......           \n" +
                        "                    ....   ..      ..''''.....          \n" +
                        "                                        ..........     \n" +
                        "                                           ......  ";
        List<Boss> listBossHp = new ArrayList<Boss>();
        List<String> listAttackBoss = new ArrayList<String>();

        // création des boss
        Boss myBoss3 = new Boss("Grumba", 500, 400, 500, 500, 700, "Griffes", "Coup de tete", bossCharacter2);
        Boss myBoss = new Boss("Ignir", 500, 400, 200, 500, 5000, "Souffle ardent du dragon sacrée",
                        "mange tes morts", bossCharacter);
        Boss myBoss2 = new Boss("SteveJobs", 500, 400, 500, 500, 700, "Control mental", "jsp", bossCharacter1);

        Inventaire myInventaire = new Inventaire();

        // ajout des boss dans une list, pour pouvoir les générer
        // de façon aléatoire.
        public void addBoss() {
                listBossHp.add(myBoss);
                listBossHp.add(myBoss2);
                listBossHp.add(myBoss3);
                System.out.println(listBossHp);
        }

        public void addAttackBoss() {
                listAttackBoss.add(listBossHp.get(randomAttack).manaSpe);
                listAttackBoss.add(listBossHp.get(randomAttack).superSpe);
                System.out.println(listAttackBoss);
        }

        public int addGold(int gold) {
                return gold = 30;
        }

        Random rand = new Random();
        int randomBoss = (int) (Math.random() * 3 + 1);
        int randomAttack = (int) (Math.random() * 2 + 1);

        // int degatsennemies = 0;
        // int degatsUser = 0;

        ChooseCharacter user = new ChooseCharacter();

        public void showCharacter(String perso, int hpUser, String name, String attackUser, int degatsUserToEnnemie,
                        String secondAttackUser) {
                addBoss();
                addAttackBoss();
                System.out.println(randomBoss);
                while (!isFinished) {
                        System.out.flush();
                        String attackTab = "╔══════════════════════════════════════╗\n" +
                                        "║1 - " + attackUser + " " + ": 200 degats       ║\n" +
                                        "║2 - " + secondAttackUser + ": 200 degats     ║\n" +
                                        "║3 - Inventaire                        ║\n" +
                                        "║4 - Fuir                              ║\n" +
                                        "╚══════════════════════════════════════╝";
                        System.out.println("Nom:" + " " + Colors.ANSI_BLUE + name + Colors.ANSI_RESET + "\n" + "Vos hp:"
                                        + " " + Colors.ANSI_GREEN + hpUser + Colors.ANSI_RESET + " " +
                                        perso + attackTab + "\n");

                        System.out.println("Nom:" + " " + Colors.ANSI_RED + listBossHp.get(randomBoss).nom
                                        + Colors.ANSI_RESET + "\nhp boss:" + " "
                                        + listBossHp.get(randomBoss).pointsDeVie +
                                        "\n"
                                        + listBossHp.get(randomBoss).boss2);
                        Scanner scanner3 = new Scanner(System.in);
                        int chooseAttack = scanner3.nextInt();
                        // system attack
                        switch (chooseAttack) {
                                case 1:
                                        System.out.println(name + " " + "utilise" + " " + attackUser);
                                        listBossHp.get(randomBoss).pointsDeVie -= 200;
                                        break;
                                case 2:
                                        System.out.println(name + " " + "utilise" + " " + secondAttackUser);
                                        listBossHp.get(randomBoss).pointsDeVie -= 300;
                                case 3:
                                        System.out.println("Inventaire");
                                        myInventaire.afficherInventaire();
                                        break;
                                case 4:
                                        isFinished = true;
                                        Menu myMenu = new Menu();
                                        myMenu.chooseMode();
                                        break;
                                default:
                                        break;
                        }
                        // attack du boss
                        System.out.println("Le boss lance" + " " + listAttackBoss.get(randomAttack) + "\n");

                        hpUser -= 100;
                        if (hpUser == 0 || hpUser < 0) {
                                System.out.println("vous avez perdu ");
                                isFinished = true;
                                Menu myMenu = new Menu();
                                myMenu.chooseMode();
                        } else if (listBossHp.get(randomBoss).pointsDeVie == 0
                                        || listBossHp.get(randomBoss).pointsDeVie < 0) { //
                                System.out.println(
                                                "vous avez gagné, vous venez de gagnez 10 de gold \nvoulez vous continuer ?");
                                Scanner scanner4 = new Scanner(System.in);
                                String again = scanner4.nextLine();
                                if (again == "non") {
                                        Menu myMenu = new Menu();
                                        myMenu.chooseMode();
                                }
                                listBossHp.get(randomBoss).pointsDeVie += 1000;
                                randomBoss = (int) (Math.random() * 3);

                        }
                }

        }
}
