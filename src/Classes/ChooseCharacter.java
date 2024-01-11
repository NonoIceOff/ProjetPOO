package Classes;

import java.util.Scanner;

public class ChooseCharacter {
    // public String user;m
String dragon =
                "                                '::,.\n" +
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
                "   .xkkkxc:;,;;:loxkkOOOOOOOOOOOkkkkxxxdd\n" +
                "    'xxl''''''',,,,cdxkkkkkkkkkkkkxxxddd.\n" +
                "      .'......'''''',:odxxkkkkkxxxxxddd'\n" +
                "       ............''',codxxxxxxxdddddl.\n" +
                "       ...............'':ldddddddood;\n" +
                "         ..............',clooooodd      .\n" +
                "          .............';lood.         ..\n" +
                "            ...........             ....'\n" +
                "               ......        ..  ......'.\n" +
                "                              ..''''''''\n" +
                "                               ''''''''.\n";

               
                String dragonAndHelloArt =
                "                ..','.\n" +
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

    Joueur character1 = new Joueur("salameche", 10000, 2000, dragon, 10000, 100, "souffle ardent");
    Joueur character2 = new Joueur("Ronflex", 1500, 2000, dragonAndHelloArt, 20, 10, "ronflement");
    Joueur character3 = new Joueur("Ronflex", 1500, 2000, ronflex, 20, 10, "ronflement");
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
                        + character2.getAsciiArtCharacter() + "\n" + this.informations + "3 -\n" + character3.getAsciiArtCharacter());
    }

    public void chooseStarter() {
        Game myGame = new Game();
        System.out.println("Choose:");
        Scanner scannerChoose = new Scanner(System.in);
        int chooseStarterUser = scannerChoose.nextInt();
        if (chooseStarterUser == 1) {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.dragon, character1.getPointsDeVie());
        } else if (chooseStarterUser == 2) {
             System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.dragonAndHelloArt, character2.getPointsDeVie());
        } else {
            System.out.println("Lancement du jeu...");
            myGame.showCharacter(this.ronflex, character3.getPointsDeVie());
        }
    }
}