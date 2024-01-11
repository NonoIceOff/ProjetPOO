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
                        "   .col;dl;.          ....,.      \n"  +    
                        " .,lOOO0kOkd.  .....',;'':::,   \n"    +   
                        " .,OOkdc. ;oxc  .clooocodo::::.   \n"   +   
                        " .cO, 'c;       ok;:ll;odd0O;:.    \n"   +  
                        " .Oc   ,:'      ol,:c:.codXKo;   .  \n"   + 
                        " ..     ,;.     lc........;xOxxkO0k   \n"  +
                        "      .,,.codl....',;;::cxxkkkxO0k   \n" +
                        "     ,.:xOK0Od'cllloooooodcc:::ckkK.  \n"+
                        "  oxddoOK000k'ooooooooookl::::ccOXK. \n"+
                        "  .oooodKK0.  ooooooooookkc ooooo0XX,\n"+
                        "   ;    c:.   ooooooooookOl  cooooOX.\n"+
                        "            ooooooooookOl   ,ddd:  \n"+
                        "            ccccc::clodl;          \n"+
                        "           ;,,',:::cc:;.          \n"+
                        "              .lllll;;;           \n"+
                        "      'ddooo;','        \n"   +
                        "    :kxxxx:....;;         \n"+
                        "   l0OOOOc....':x      \n"   +
                        "   l00000d...           \n"   +
                        "   ckO000k;'.          \n"     +
                        "    ..... .;;.       \n"        +
                        "            ';  \n";
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
        List<Boss> listBossHp = new ArrayList<Boss>();       
        List<String> listAttackBoss = new ArrayList<String>();

        // création des boss
        Boss myBoss = new Boss("Salamèche", 200, 200, 500, 5000, "Souffle ardent du dragon sacrée",
                        "mange tes morts", bossCharacter);
        Boss myBoss2 = new Boss("SteveJobs", 200, 500, 500, 700, "Control mental", "jsp", bossCharacter1);
        Boss myBoss3 = new Boss("Steve", 200, 500, 500, 700, "Coup de pioche", "super coup de pioche", bossCharacter2);
        Boss myBoss4 = new Boss("TorTank", 200, 500, 500, 700, "Griffes", "Coup de tete", bossCharacter3);


        public void addBoss() {
                listBossHp.add(myBoss);
                listBossHp.add(myBoss2);
                listBossHp.add(myBoss3); 
                listBossHp.add(myBoss4);
                System.out.println(listBossHp);
        }
        public void addAttackBoss() {
                listAttackBoss.add(listBossHp.get(randomBoss).manaSpe);
                listAttackBoss.add(listBossHp.get(randomBoss).superSpe);
                System.out.println(listAttackBoss);
        }
        Random rand = new Random();
        int randomBoss = (int) (Math.random() * 3);
        int degatsennemies = 0;        
        int degatsUser = 0;


        public int addHpUser(){
        int valueDegatsBoss = 0;
        for (int i = 0; i <= 100; i++) {
            valueDegatsBoss = listBossHp.get(randomBoss).pointsDeVie--;    
        }
        return valueDegatsBoss;
        }
        public int addHpBoss(int lifeUser){
        int valueDegatsUser = 0;
        for (int i = 0; i <= 100; i++) {
                valueDegatsUser = lifeUser--;
        }
        return valueDegatsUser;
        }

       

        ChooseCharacter user = new ChooseCharacter();

        public void showCharacter(String perso, int hpUser, String name, String attackUser, int degatsUserToEnnemie, String secondAttackUser) {
                addBoss();
                addAttackBoss();

                while (!isFinished) {
                System.out.flush();
                        System.out.println("Nom:"+ " " + name +"\n"+"Vos hp:"+ " "  + hpUser +" "+
                                        perso + "\n1 - Dormir: 200 degats | 2 - Coup de pate: 400 degats \n 3 - Inventaire | 4 - Fuir");
                        System.out.println("Nom:"+ " " + listBossHp.get(randomBoss).nom  +"\nhp boss:" + " " + addHpUser() +
                                        "\n"
                                        + listBossHp.get(randomBoss).boss2);
                        Scanner scanner3 = new Scanner(System.in);
                        int chooseAttack = scanner3.nextInt();
                        switch (chooseAttack) {
                                case 1:
                                System.out.println(name + " " + "utilise" + " " + attackUser);

                                addHpUser();
                                // degatsennemies = degatsUserToEnnemie;
                                // addHpUser(degatsennemies);
                                        break;
                                case 2:
                                System.out.println(name + " " + "utilise" + " " + secondAttackUser);
                                case 3:
                                        System.out.println("Inventaire");
                                        break;
                                case 4:
                                        isFinished = true;
                                        break;
                                default:
                                        break;
                        }System.out.println(listBossHp.get(randomBoss).pointsDeVie);
                        // attack du boss
                        System.out.println("Le boss lance" + " " +  listAttackBoss.get(randomBoss) + "\n" );
                        System.out.println(listBossHp.get(randomBoss).pointsDeVie);
                        for (int i = 0; i <= 100; i++) {
                        int valueDegatsUser = 0;
                        valueDegatsUser = hpUser--;
                        }
                         
                        System.out.println("sokrf");
                        if (hpUser == 0 ||hpUser < 0) {
                                System.out.println("vous avez perdu ");
                                isFinished = true;
                                Menu myMenu = new Menu();
                                myMenu.chooseMode();
                        }else if (addHpUser() == 0 || addHpUser() <0) {
                        System.out.println("vous avez gagné");

                        }
                        
                       
                       


                }
                // regardec le java morpion
        }

}
