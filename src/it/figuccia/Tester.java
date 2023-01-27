package it.figuccia;

/**
 * Tester class that invokes the methods of the WordGames class
 * @author Figuccia
 */
public class Tester {
    public static void main(String[] args) {
        /**
         * Create a new object from WordGames
         */
        WordGames wordGames = new WordGames();
        /**
         * Print in console the two methods of object
         */
        System.out.println(wordGames.addHelloWord("world"));
        System.out.println(wordGames.getFullName("Gino", "Pasticcio"));
    }
}
