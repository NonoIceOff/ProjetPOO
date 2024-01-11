package Classes;

import java.io.Serializable;

abstract class ObjetDuJeu implements Serializable {
    protected String nom;

    public ObjetDuJeu(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite d'interaction avec un personnage
    abstract void interagir(Personnage personnage);

}

