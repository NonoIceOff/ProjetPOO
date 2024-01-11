package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
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
                        String bossCharacter1 =
                        "            .,::c:;.                     \n" +
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

                        String bossCharacter2 =
                        "''  .             \n" +
                        " "     +             
                        "   .col;dl;.          ....,.      "  +    
                        " .,lOOO0kOkd.  .....',;'':::,   "    +   
                        " .,OOkdc. ;oxc  .clooocodo::::.   "   +   
                        " .cO, 'c;       ok;:ll;odd0O;:.    "   +  
                        " .Oc   ,:'      ol,:c:.codXKo;   .  "   + 
                        " ..     ,;.     lc........;xOxxkO0k   "  +
                        "      .,,.codl....',;;::cxxkkkxO0k   " +
                        "     ,.:xOK0Od'cllloooooodcc:::ckkK.  "+
                        "  oxddoOK000k'ooooooooookl::::ccOXK. "+
                        "  .oooodKK0.  ooooooooookkc ooooo0XX,"+
                        "   ;    c:.   ooooooooookOl  cooooOX."+
                        "            ooooooooookOl   ,ddd:  "+
                        "            ccccc::clodl;          "+
                        "           ;,,',:::cc:;.          "+
                        "              .lllll;;;           "+
                        "      'ddooo;','        "   +
                        "    :kxxxx:....;;         "+
                        "   l0OOOOc....':x      "   +
                        "   l00000d...           "   +
                        "   ckO000k;'.          "     +
                        "    ..... .;;.       "        +
                        "            ';  ";
                        String bossCharacter3 =
                        " ..':;;;;'..              \n" +
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
        int value = 3000;
        List<String> listBossAsciiArt = new ArrayList<String>();
        List<Boss> listBossHp = new ArrayList<Boss>();
        // création des boss
        Boss myBoss = new Boss("Salamèche", 2000, value, 500, 5000, "Souffle ardent du dragon sacrée",
                        "mange tes morts", bossCharacter);

        Boss myBoss2 = new Boss("SteveJobs", 1000, 500, 500, 700, "Control mental", "jsp", bossCharacter1);
        Boss myBoss3 = new Boss("Steve", 10000, 500, 500, 700, "Coup de pioche", "super coup de pioche", bossCharacter2);
        Boss myBoss4 = new Boss("TorTank", 1, 500, 500, 700, "Griffes", "Coup de tete", bossCharacter3);

        // List<String> listEnnemies = new ArrayList<String>();Ò

        public void addBoss() {
                // mettre encapsulation
                listBossHp.add(myBoss);
                listBossHp.add(myBoss2);
                listBossHp.add(myBoss3);
                listBossHp.add(myBoss4);
                listBossAsciiArt.add(myBoss.boss2);
                listBossAsciiArt.add(myBoss2.boss2);
                listBossAsciiArt.add(myBoss3.boss2);
                listBossAsciiArt.add(myBoss4.boss2);

        }

        Random rand = new Random();
        int randomBoss = (int) (Math.random() * 3);

        ChooseCharacter user = new ChooseCharacter();

        public void showCharacter(String perso, int hpUser) {
                while (!isFinished) {

                        System.out.println(
                                        perso + "\n1 - Dormir: 200 degats | 2 - Coup de pate: 400 degats \n 3 - Inventaire | 4 - Fuir");
                        addBoss();
                        System.out.println();
                        System.out.println("hp boss:" + " " + listBossHp.get(randomBoss) +
                                        "\n"
                                        + listBossAsciiArt.get(randomBoss));

                        Scanner scanner3 = new Scanner(System.in);
                        int chooseAttack = scanner3.nextInt();
                        switch (chooseAttack) {
                                case 1:

                                        break;

                                default:
                                        break;
                        }
                        isFinished = true;
                }
                // regardec le java morpion
        }

}
