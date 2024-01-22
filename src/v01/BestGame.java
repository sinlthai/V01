/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

/**
 * V01 - Lucky Number
 *
 * The BestGame class represents information about the best-performing game in
 * the guessing game application. It includes the number of games played and the
 * total number of guesses made in the best-performing game.
 *
 * @author CE182093-Thai Ba Sinl 
 */
public class BestGame {

    /**
     * The total number of games played in the best-performing game.
     */
    private int games;

    /**
     * The total number of guesses made in the best-performing game.
     */
    private int guessTimes;

    /**
     * Default constructor for BestGame.
     */
    public BestGame() {
    }

    /**
     * Constructs a BestGame with the specified number of games and total
     * guesses.
     *
     * @param games The number of games played.
     * @param guessTimes The total number of guesses made.
     */
    public BestGame(int games, int guessTimes) {
        this.games = games;
        this.guessTimes = guessTimes;
    }

    /**
     * Gets the number of games played in the best-performing game.
     *
     * @return The number of games played.
     */
    public int getGames() {
        return games;
    }

    /**
     * Gets the total number of guesses made in the best-performing game.
     *
     * @return The total number of guesses made.
     */
    public int getGuessTimes() {
        return guessTimes;
    }

    /**
     * Displays information about the best-performing game.
     */
    public void showBestGame() {
        System.out.printf("Your best game (fewest guesses in a game) is game %d with %d guess(es).\n", games, guessTimes);
    }
}
