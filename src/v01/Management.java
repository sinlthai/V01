/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

import java.util.ArrayList;

/**
 * V01 - Lucky Number
 *
 * The Management class encapsulates the logic for playing and managing the
 * guessing game. It keeps track of the lucky numbers, user guesses, and game
 * statistics.
 *
 * @author CE182093-Thai Ba Sinl
 */
public class Management {

    private int totalGuess = 0;
    // Instance variables
    private int guessNum;                           // Store the user's guess
    private LuckyNumber luckyNumber;                // Store the lucky number
    private final ArrayList<BestGame> listBestGame = new ArrayList<>(); // Store the best games

    // Total game statistics
    private int totalGames = 0;                     // Total number of games played
    private int guessPerGame;

    /**
     * Menu method to play the game and manage user choices. Continues playing
     * until the user decides to stop.
     */
    public void menu() {
        String choice;
        // Continue playing until the user decides to stop
        do {
            play(); // Play one round of the game
            choice = MyLib.getString("Do you want to play more games? (Y/N) ",
                    "Please enter (Y or N) or (Yes or No) or (Co or Khong) all of it is ignore case!");
        } while (!choice.equalsIgnoreCase("N") && !choice.equalsIgnoreCase("No") && !choice.equalsIgnoreCase("Khong"));
        report(); // Display game statistics when the user stops playing
        
    }

    /**
     * Method to play one round of the game. Generates a new lucky number and
     * continues until the user correctly guesses it.
     */
    public void play() {
        int max = 100; // Maximum value for the lucky number
        luckyNumber = new LuckyNumber((int) ((max + 1) * Math.random())); // Generate a new lucky number
        guessPerGame = 0; // Initialize guessPerGame before the loop

        // Continue until the user correctly guesses the lucky number
        do {
            guessNum = MyLib.getInteger("Enter your guess: ", "Please enter an integer only ", 0, max);
            guessPerGame++; // Increment guessPerGame for each guess
            totalGuess++;
            System.out.println("Your current guess(es): "+ guessPerGame);
            displayWinOrLose(); // Display whether the guess is too high, too low, or correct

        } while (guessNum != luckyNumber.getNumber());

        totalGames++; // Increment the total number of games played
        System.out.println("-------------------------------------------------");
        System.out.println("Your guess times at game " + totalGames + " is " + guessPerGame + " guess(es)");
        System.out.println("-------------------------------------------------");
        listBestGame.add(new BestGame(totalGames, guessPerGame)); // Add the current game to the list of best games
    }

    /**
     * Method to display whether the user's guess is too high, too low, or
     * correct.
     */
    public void displayWinOrLose() {
        if (guessNum > luckyNumber.getNumber()) {
            System.out.println("Your number is greater than the lucky number!");
        } else if (guessNum == luckyNumber.getNumber()) {
            System.out.println("Your number is the lucky number!");
        } else {
            System.out.println("Your number is less than the lucky number!");
        }
    }

    /**
     * Method to display overall game statistics. Shows the total games played,
     * total guesses made, average guesses per game, and details of the best
     * game with the fewest guesses.
     */
    public void report() {
        System.out.println("#################################################");
        System.out.println("Total games played: " + totalGames);
        System.out.println("Total guesses made: " + totalGuess);

        // Calculate and display average guesses per game
        System.out.println("Average guess(es) per game: " + (double) totalGuess / totalGames);

        // Find and display the best game with the fewest guesses
        int minGuess = listBestGame.get(0).getGuessTimes();
        BestGame bestGame = listBestGame.get(0);

        for (BestGame s : listBestGame) {
            if (minGuess > s.getGuessTimes()) {
                minGuess = s.getGuessTimes();
                bestGame = s;
            }
        }

        bestGame.showBestGame(); // Display details of the best game
    }
}
