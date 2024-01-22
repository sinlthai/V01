/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

/**
 * V01 - Lucky Number
 *
 * The V01 class serves as the entry point for the guessing game application. It
 * initializes the Management class and starts the game by invoking the menu
 * method.
 *
 * @author CE182093-Thai Ba Sinl
 */
public class V01 {

    /**
     * The main method
     *
     * @param args The command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Create an instance of the Management class to manage the guessing game
        Management app = new Management();

        // Start the game by invoking the menu method
        app.menu();
    }
}
