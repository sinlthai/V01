/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v01;

import java.util.Scanner;

/**
 * V01 - Lucky Number
 *
 * The MyLib class provides utility methods for input validation in the guessing
 * game application. It includes methods to get a string input and an integer
 * input with specified constraints.
 *
 * @author CE182093-Thai Ba Sinl
 */
public class MyLib {

    /**
     * Scanner object to read input from the console
     */
    public static Scanner sc = new Scanner(System.in);

    /**
     * Gets a string input from the user, validating against specific
     * conditions.
     *
     * @param iMg The input message displayed to the user.
     * @param eMg The error message displayed when the input is invalid.
     * @return A valid string input ("Y", "N", "Yes", "No", "Co", "Khong").
     */
    public static String getString(String iMg, String eMg) {
        // Declare a string variable to store user input
        String x;

        // Infinite loop to keep asking for input until valid input is provided
        while (true) {
            try {
                // Display input message
                System.out.print(iMg);

                // Read a line of input and attempt to trim leading and trailing whitespaces (result not assigned back)
                x = sc.nextLine();

                // Check if the entered string is empty or if it is equal to certain valid options (case-insensitive)
                if (x.isEmpty()
                        || (!x.equalsIgnoreCase("Y") && !x.equalsIgnoreCase("YES") && !x.equalsIgnoreCase("CO")
                        && !x.equalsIgnoreCase("N") && !x.equalsIgnoreCase("NO") && !x.equalsIgnoreCase("KHONG"))) {
                    // If not valid, throw an exception
                    throw new Exception();
                }

                // If valid input, return the entered string
                return x;

            } catch (Exception e) {
                // Catch any exceptions thrown and print the error message
                System.out.println(eMg);
            }
        }
    }

    /**
     * Function is used to enter an integer number
     *
     * @param iMg input message
     * @param eMg error message
     * @param from lower limit
     * @param to upper limit
     * @return an integer number
     */
    public static int getInteger(String iMg, String eMg, int from, int to) {
        int x;
        while (true) {
            try {
                if (from > to) {
                    int temp;
                    temp = from;
                    from = to;
                    to = temp;
                }
                System.out.print(iMg);
                x = Integer.parseInt(sc.nextLine());
                if (x > to || x < from) {
                    throw new Exception();
                }
                return x;
            } catch (Exception e) {
                System.out.println(eMg+"not less than "+from+" and over "+to);
            }
        }
    }
}
