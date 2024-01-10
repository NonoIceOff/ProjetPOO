package Classes;

import Classes.ChooseCharacter;

public class Game {
    // private String userCharacter;
    // private String ennemies;
    // private String ennemiesBoss;

    // Game(String userCharacter, String ennemies, String ennemiesBoss) {
    // this.userCharacter = userCharacter;
    // this.ennemies = ennemies;
    // this.ennemiesBoss = ennemiesBoss;
    // }

    ChooseCharacter user = new ChooseCharacter();

    public void showCharacter(String perso) {
        System.out.println(perso);

    }

}
