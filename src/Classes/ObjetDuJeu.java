package Classes;
abstract class ObjetDuJeu {
    protected String nom;

    public ObjetDuJeu(String nom) {
        this.nom = nom;
    }

    abstract void interagir(Personnage personnage);

}

