import Classes.Arme;
import Classes.Personnage;
import Classes.Potion;
import Classes.Shop;
import Classes.ChooseCharacter;
import Classes.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> listEnnemies = new ArrayList<String>();
        List<String> listBoss = new ArrayList<String>();
        Menu myMenu = new Menu();
        myMenu.chooseMode();
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