package Classes;

public class Boss extends Ennemi {
    private String superSpe;
    private String boss1 = " _______________________ \n" +
            "< Salut je suis le boss >\n" +
            " ----------------------- \n" +
            "      \\                    / \\  //\\\n" +
            "       \\    |\\___/|      /   \\//  \\\\\n" +
            "            /0  0  \\__  /    //  | \\ \\    \n" +
            "           /     /  \\/_/    //   |  \\  \\  \n" +
            "           @_^_@'/   \\/_   //    |   \\   \\\n" +
            "           //_^_/     \\/_ //     |    \\    \\\n" +
            "        ( //) |        \\///      |     \\     \\\n" +
            "      ( / /) _|_ /   )  //       |      \\     _\\\n" +
            "    ( // /) '/,_ _ _/  ( ; -.    |    _ _\\.-~        .-~~~^-.\n" +
            "  (( / / )) ,-{        _      `-.|.-~-.           .~         `.\n" +
            " (( // / ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\\n" +
            " (( /// ))      `.     {            }                   /      \\  \\\n" +
            "  (( / ))     .----~-./        \\-'                 .~         \\  `. \\^-.\n" +
            "             ///.----..>        \\             _ -~             `.  ^-`  ^-_\n" +
            "               ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~\n" +
            "                                                                  /.-~";
    String boss2;

    public Boss(String nom, int pointsDeVie, int force, int agility, int mana, String manaSpe, String supeSpe,
            String boss2) {
        super(nom, pointsDeVie, force, agility, mana, manaSpe);
        this.superSpe = superSpe;
        this.boss2 = boss2;
    }

}
