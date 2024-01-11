package Classes;

public class Boss extends Ennemi {
    String superSpe;
    String boss2;

    public Boss(String nom, int pointsDeVie, int force, int agility, int mana, String manaSpe, String superSpe,
            String boss2) {
        super(nom, pointsDeVie, force, agility, mana, manaSpe);
        this.superSpe = superSpe;
        this.boss2 = boss2;
    }

}
