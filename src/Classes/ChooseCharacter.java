package Classes;

import java.util.Scanner;
import Classes.Colors;

public class ChooseCharacter {
        // différents perso, que l'utilisateur peut chosir
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
        // creation des instances

        Joueur character1 = new Joueur("Kirby", 10000, 20, 200, kirby, 10000, 100, "Souffle ardent",
                        "Attaque cannibale", 0);
        Joueur character2 = new Joueur("Carte", 1500, 20, 200, carte, 20, 10, "Ronflement", "Morsure", 0);
        Joueur character3 = new Joueur("Ronflex", 1500, 20, 250, ronflex, 20, 10, "Ronflement", "Coup de tete",
                        0);

        // je sais c'est mal fait
        // represente les caractéristique des différents perso
        String informationsFirstCharacter = "╔══════════════════════════════╗\n" + //
                        "║  Informations                ║\n" +
                        "║                              ║\n" +
                        "║Nom:" + " " + character1.getNom() + "║\n" +
                        "║                              ║\n" +
                        "║Force:" + " " + character1.getForce() + "║\n" +
                        "║                              ║\n" +
                        "║Points de vie:" + " " + character1.getPointsDeVie() + "║\n" +
                        "║                              ║\n" +
                        "║Mana:" + " " + character1.getMana() + " ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "╚══════════════════════════════╝";
        String informationsFirstCharacter2 = "╔══════════════════════════════╗\n" + //
                        "║  Informations                ║\n" +
                        "║                              ║\n" +
                        "║Nom:" + " " + character2.getNom() + "║\n" +
                        "║                              ║\n" +
                        "║Force:" + " " + character2.getForce() + "║\n" +
                        "║                              ║\n" +
                        "║Points de vie:" + " " + character2.getPointsDeVie() + "║\n" +
                        "║                              ║\n" +
                        "║Mana:" + " " + character2.getMana() + "  ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "╚══════════════════════════════╝";
        String informationsFirstCharacter3 = "╔══════════════════════════════╗\n" + //
                        "║  Informations                ║\n" +
                        "║                              ║\n" +
                        "║Nom:" + " " + character2.getNom() + "║\n" +
                        "║                              ║\n" +
                        "║Force:" + " " + character2.getForce() + "║\n" +
                        "║                              ║\n" +
                        "║Points de vie:" + " " + character2.getPointsDeVie() + "║\n" +
                        "║                              ║\n" +
                        "║Mana:" + " " + character2.getMana() + "  ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "║                              ║\n" +
                        "╚══════════════════════════════╝";

        // afficher les informations des personnages
        public void allStarter() {
                /**
                 Méthode permettant d'afficher le choix de personnages
                 Retourne rien mais afficher le choix de personnages à partir des variables de type "Joueur" de cette classe
                 */
                System.out.println(
                                "Veuillez choisir un personnage: \n1 -" + character1.getAsciiArtCharacter() + " \n"
                                                + this.informationsFirstCharacter + "\n2 -\n"
                                                + character2.getAsciiArtCharacter() + "\n"
                                                + this.informationsFirstCharacter2 + "\n3 -\n"
                                                + character3.getAsciiArtCharacter() + "\n"
                                                + this.informationsFirstCharacter3);
        }

        // choisir le personnage starter avec le terminal
        public void chooseStarter() {
                /**
                 Méthode permettant au joueur de choisir son personnage
                 Retourne rien mais récupère les inputs de clavier dans un "int" pour valider un personnage
                 */
                Game myGame = new Game();
                System.out.println("Choississez un personnage:");
                Scanner scannerChoose = new Scanner(System.in);
                int chooseStarterUser = scannerChoose.nextInt();
                if (chooseStarterUser == 1) {
                        System.out.println("Lancement du jeu...");
                        myGame.showCharacter(this.kirby, character1.getPointsDeVie(), character1.getNom(),
                                        character1.getManaSpe(),
                                        character1.getForce(), character1.getSecondAttackUser(), character1.getGold());
                } else if (chooseStarterUser == 2) {
                        System.out.println("Lancement du jeu...");
                        myGame.showCharacter(this.carte, character2.getPointsDeVie(), character2.getNom(),
                                        character2.getManaSpe(),
                                        character2.getForce(), character2.getSecondAttackUser(), character1.getGold());
                } else {
                        System.out.println("Lancement du jeu...");
                        myGame.showCharacter(this.ronflex, character3.getPointsDeVie(), character3.getNom(),
                                        character3.getManaSpe(), character3.getForce(),
                                        character3.getSecondAttackUser(), character1.getGold());
                }
        }
}