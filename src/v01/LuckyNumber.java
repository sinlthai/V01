/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

/**
 * V01 - Lucky Number
 *
 * The LuckyNumber class represents a lucky number used in the guessing game. It
 * encapsulates the functionality to get and set the lucky number.
 *
 * @author CE182093-Thai Ba Sinl 
 */
public class LuckyNumber {

    /**
     * The lucky number
     */
    private int number;

    /**
     * Constructs a LuckyNumber with the specified number.
     *
     * @param number The lucky number to set.
     */
    public LuckyNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the current lucky number.
     *
     * @return The lucky number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets a new lucky number.
     *
     * @param number The new lucky number to set.
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
