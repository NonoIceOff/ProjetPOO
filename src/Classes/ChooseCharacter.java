package Classes;

import java.util.Scanner;
import Classes.Colors;

public class ChooseCharacter {
    String kirby = Colors.ANSI_PURPLE + "                                '::,.\n" +
            "                                ;kOOOkkl\n" +
            "                     .',;;;,'. ;OO00OOkk:\n" +
            "                 ,lk00xk0000kxOOOOOOOOkkx\n" +
            "              .oO0KKK:KdkKKkl   K:OOOOkkOkkx\n" +
            "             oO00KKKO.x,oXKo,x   .k0OOkkkxx:\n" +
            "           .kO00KKKKO   xXXx   O00OOkkxd\n" +
            "           kOO0Okkk0K;';KKKK;.;0Okxxkkxxd\n" +
            "       .:dxkOOOkxxk0KKKk;,,:OK00kdooxkxxd\n" +
            "     ;xOOkxkkOOOO00000Kk,,,,k000OOOkkkxxx\n" +
            "    dkOOOxxxxkkkkOOOO000OddO00OOOOkkkxxxd\n" +
            "   .xkkkxc:;,;;:loxkkOOOOOOOOOOOkkkkxxxdd\n" + Colors.ANSI_RESET +
            "    'xxl''''''',,,," + Colors.ANSI_PURPLE + "cdxkkkkkkkkkkkkxxxddd.\n" +
            "      .'......'''''',:odxxkkkkkxxxxxddd'\n" +
            "       ............''',codxxxxxxxdddddl.\n" +
            "       ...............'':ldddddddood;\n" +
            "         ..............',clooooodd      .\n" +
            "          .............';lood." + Colors.ANSI_RESET + "         ..\n" +
            "            ..........." + Colors.ANSI_RED + "             ....'\n" +
            "               ......        ..  ......'.\n" +
            "                              ..''''''''\n" +
            "                               ''''''''.\n" + Colors.ANSI_RESET;

    String carte = "                ..','.\n" +
            "              .;okOkocOk,\n" +
            "            .ldolodx0,oxX'ooo::\n" +
            "           '::0KNN0kxkNNN;OolkN\n" +
            "          ,dd:okxkONNNO00,oONNK\n" +
            "        .oolNNNNKxNNOk,o:lKNNNx\n" +
            "        :oxo:Okd:lckKNoloo;0NNl\n" +
            "   ,dc'. lOOO0X,xlcKNNXXXK0KNN,\n" +
            "   .kOOOx:oNNNNldXNNNNNNNKXNNN.\n" +
            "    ;OOOOO:dNNNNNNXO000OkKKkON\n" +
            "     :OOOOO,0NNNNNdMMMNlMMMMdO\n" +
            "      'kOOOk'XNNNKOMMKkXkMOokl\n" +
            "        dOOOolNNNNdMM: dxM;';O\n" +
            "         ;kOO'KNNN0xNXkox00k0X\n" +
            "          .dOdlNNNNNOkkNNNNXNN.\n" +
            "           .kO,NNNNxoxkkkdkONN,\n" +
            "            cO;0NNNK;llll;NNNNx\n" +
            "            cOlxNNNNx:lll:NNNNX.\n" +
            "            xOdlNNNNNOl::;xXNNNo\n" +
            "           ,OOdlNNNNNNNXKNNNNNNX.\n" +
            "           xOOolNNNNNNNNNNNNNNNNo\n" +
            "          ,OOOcdNNNNNNNNNNNNNNNNX.\n" +
            "          oOOx.0NNNNNNNNNNNNNNNK:\n" +
            "          c   .KNNNNNNNNNNKOd:";

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

    Joueur character1 = new Joueur("Kirby", 10000, 100, kirby, 10000, 100, "souffle ardent");
    Joueur character2 = new Joueur("Carte", 1500, 200, carte, 20, 10, "ronflement");
    Joueur character3 = new Joueur("Ronflex", 1500, 250, ronflex, 20, 10, "ronflement");

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
                        + character2.getAsciiArtCharacter() + "\n" + this.informations + "3 -\n"
                        + character3.getAsciiArtCharacter());
    }

    public void chooseStarter() {
        Game myGame = new Game();
        System.out.println("Choississez un personnage:");
        Scanner scannerChoose = new Scanner(System.in);
        int chooseStarterUser = scannerChoose.nextInt();
        if (chooseStarterUser == 1) {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.kirby, character1.getPointsDeVie(), character1.getNom(), character1.getManaSpe(),
                    character1.getForce(), character1.getSecondAttackUser());
        } else if (chooseStarterUser == 2) {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.carte, character2.getPointsDeVie(), character2.getNom(), character2.getManaSpe(),
                    character2.getForce(), character2.getSecondAttackUser());
        } else {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.ronflex, character3.getPointsDeVie(), character3.getNom(),
                    character3.getManaSpe(), character3.getForce(), character3.getSecondAttackUser());
        }
    }
}