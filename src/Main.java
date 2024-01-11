import Classes.Arme;
import Classes.Potion;
import Classes.Menu;
import Classes.Boss;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // menu du jeu
        Menu myMenu = new Menu();
        myMenu.chooseMode();

        // // création des boss
        // Boss myBoss = new Boss("Salamèche", 2000, 3000, 500, 5000, "Souffle ardent du
        // dragon sacrée",
        // "mange tes morts");

        // Boss myBoss2 = new Boss("TorTank", 100, 500, 500, 700, "Jet d'eau", "Grand
        // jet d'eau");

        // // List<String> listEnnemies = new ArrayList<String>();Ò
        // List<Boss> listBoss = new ArrayList<Boss>();

        // listBoss.add(myBoss);
        // listBoss.add(myBoss2);

        Potion potionGuerison = new Potion("Potion de guérison", 20);
        Arme cuillere = new Arme("Cuillère", 20);

        // Personnage joueur = new Personnage("Héros", 50, 1, );

        // joueur.informations();

        // potionGuerison.interagir(joueur);

        // joueur.informations();

        // cuillere.interagir(joueur);

        // joueur.informations();
    }
}

// level
// normal
// impossible
// String dragon =
// ANSI_RED + " ----------------------- \n" +
// " \\ / \\ //\\\n" +
// " \\ |\\___/| / \\// \\\\\n" +
// " /0 0 \\__ / // | \\ \\ \n" +
// " / / \\/_/ // | \\ \\ \n" +
// " @_^_@'/ \\/_ // | \\ \\\n" +
// " //_^_/ \\/_ // | \\ \\\n" +
// " ( //) | \\/// | \\ \\\n" +
// " ( / /) _|_ / ) // | \\ _\\\n" +
// " ( // /) '/,_ _ _/ ( ; -. | _ _\\.-~ .-~~~^-.\n" +
// " (( / / )) ,-{ _ `-.|.-~-. .~ `.\n" +
// " (( // / )) '/\\ / ~-. _ .-~ .-~^-. \\\n" +
// " (( /// )) `. { } / \\ \\\n" +
// " (( / )) .----~-./ \\-' .~ \\ `. \\^-.\n" +
// " ///.----..> \\ _ -~ `. ^-` ^-_\n" +
// " ///-._ _ _ _ _ _ _}^ - - - - ~ ~-- ,.-~\n" +
// " /.-~" + ANSI_RESET;

// System.out.println(dragon);