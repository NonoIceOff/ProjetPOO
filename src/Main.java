import Classes.Arme;
import Classes.Personnage;
import Classes.Potion;

public class Main {
    public static void main(String[] args) {
        Potion potionGuerison = new Potion("Potion de guérison", 20);
        Arme cuillere = new Arme("Cuillère", 20);

        Personnage joueur = new Personnage("Héros", 50,1);

        joueur.informations();

        potionGuerison.interagir(joueur);

        joueur.informations();

        cuillere.interagir(joueur);

        joueur.informations();
    }
}
