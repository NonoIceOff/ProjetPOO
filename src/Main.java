import Classes.Arme;
import Classes.Potion;
import Classes.Menu;

public class Main {
    public static void main(String[] args) {

        // menu du jeu
        Menu myMenu = new Menu();
        myMenu.chooseMode();

        Potion potionGuerison = new Potion("Potion de guérison", 20);
        Arme cuillere = new Arme("Cuillère", 20);

    }
}
