package it.figuccia;

/**
 * WordGames class that contains two methods for manipulating words
 */
public class WordGames {
    /**
     * Method that adds the word "Hello" before the input word
     * @param word the input word
     * @return the string "Hello [word]"
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * Method that concatenates a name and a surname
     * @param name the input name
     * @param surname the input surname
     * @return the concatenation of the name and the surname
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}
