import Classes.*;

public class Main {
    public static void main(String[] args) {
        Potion potionGuerison = new Potion("Potion de guérison", 20);
        Arme cuillere = new Arme("Cuillère", 20);

        Personnage joueur = new Joueur("Héros", 50,1);

        Ennemi ennemi = new Ennemi("Jsp",50,1);

        joueur.informations();

        potionGuerison.interagir(joueur);

        joueur.informations();

        cuillere.interagir(joueur);

        joueur.informations();

        ennemi.interagir(joueur);
        joueur.interagir(ennemi);
    }
}