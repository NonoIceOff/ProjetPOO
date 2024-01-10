import Classes.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        PotionDeSoin potionGuerison = new PotionDeSoin("Potion de guérison", 20);

        Arme cuillere = new Arme("Cuillère rouillée", 2, 0);
        Arme couteau = new Arme("Couteau", 20, 0);
        Arme couteauSang = new Arme("Couteau ensanglanté", 21, 0);

        Personnage joueur = new Joueur("Héros", 50,0,1);

        Ennemi ennemi = new Ennemi("Antoine Daniel",50,0,1);

        joueur.informations();

        potionGuerison.interagir(joueur);

        joueur.informations();

        cuillere.interagir(joueur);

        couteau.interagir(joueur);

        joueur.informations();

        ennemi.interagir(joueur);
        joueur.interagir(ennemi);

        joueur.attaquer();
    }
}